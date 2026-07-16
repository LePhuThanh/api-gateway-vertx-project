package com.phelim.gateway_vertx_project.consumer;

import com.google.gson.Gson;
import com.google.inject.Inject;
import com.phelim.gateway_vertx_project.config.ModuleConfig;
import com.phelim.gateway_vertx_project.dto.MockData;
import com.phelim.gateway_vertx_project.dto.response.CicPrResponse;
import com.phelim.gateway_vertx_project.dto.request.CreditReportRequest;
import com.phelim.gateway_vertx_project.enums.CicProduct;
import com.phelim.gateway_vertx_project.enums.CicReportType;
import com.phelim.gateway_vertx_project.enums.CicValidationError;
import com.phelim.gateway_vertx_project.integration.module.CallApiModule;
import com.phelim.gateway_vertx_project.integration.cic.CicSoapBuilder;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.json.XML;
import java.nio.charset.StandardCharsets;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

@Slf4j
public class CicConsumerImpl implements CicConsumer {
    private static final Pattern MA_SO_PHIEU_PATTERN = Pattern.compile("^[a-zA-Z0-9./]+$");
    private static final Pattern CIC_ERROR_PATTERN = Pattern.compile("^(IN|OUT)_\\d+.*");

    private Vertx vertx;
    private final ModuleConfig config;
    private final CallApiModule callApiModule;
    private final CicSoapBuilder cicSoapBuilder;
    private final Gson gson;

    boolean isTest = false;

    @Inject
    public CicConsumerImpl(Vertx vertx, ModuleConfig config, CicSoapBuilder cicSoapBuilder, CallApiModule callApiModule, Gson gson) {
        this.vertx = vertx;
        this.config = config;
        this.cicSoapBuilder = cicSoapBuilder;
        this.callApiModule = callApiModule;
        this.gson = gson;
    }

    @Override
    public void handlerRouter(Router router) {
        router.post("/partner/cic/reports/relationship").handler(this::handleCreditRelationshipInquiry); //S10T + S11T & R10T + R11T
        router.post("/partner/cic/reports/basic").handler(this::handleBasicCreditInquiry); // B11T
    }

    private void handleCreditRelationshipInquiry(RoutingContext ctx) {
        log.info("[CicConsumerImpl][handleCreditRelationshipInquiry] Start (S10T + S11T & R10T + R11T)");

        ctx.request().bodyHandler(buffer -> {
            log.info("[handleCreditRelationshipInquiry] Receiving request={}",
                    buffer.toString(StandardCharsets.UTF_8).replaceAll("\\s+", " "));

            try {
                // Parse JSON
                CreditReportRequest req = gson.fromJson(buffer.toString(StandardCharsets.UTF_8), CreditReportRequest.class);
                String token = req.getToken();

                if (isBlank(req.getMaSP())) {
                    error(ctx, CicValidationError.MA_SAN_PHAM_EMPTY);
                    return;
                }
                CicProduct maSp = CicProduct.fromCode(req.getMaSP());

                // Resolve type
                CicReportType type;
                String description;
                String responseTag = "PHHoiTin";

                if (EnumSet.of(CicProduct.S10T, CicProduct.S11T).contains(maSp)) {
                    type = CicReportType.HOI_TIN_S;
                    description = "Credit Detail Report - S10T/S11T";

                    log.info("[handleCreditRelationshipInquiry] type={}, maSP={}", type.name(), maSp);
                } else if (EnumSet.of(CicProduct.R10T, CicProduct.R11T).contains(maSp)) {
                    type = CicReportType.HOI_TIN_R;
                    description = "Credit Summary Report - R10T/R11T";

                    log.info("[handleCreditRelationshipInquiry] type={}, maSP={}", type.name(), maSp);
                } else {
                    log.error("[handleCreditRelationshipInquiry] Unsupported maSP={}", maSp);
                    ctx.response().setStatusCode(400).putHeader("Content-Type", "application/json").end(gson.toJson(
                            CicPrResponse.error("001", "Unsupported MaSP=" + maSp)));
                    return;
                }

                // Validate
                validateReportRequest(type, req, ctx);
                if (ctx.response().ended()) {
                    return;
                }

                // Build SOAP
                String request = cicSoapBuilder.getCreditReport(type, req);
                log.info("[handleCreditRelationshipInquiry] SoapRequest={} to partner", request);

                // Call CIC
                String response;
                if(isTest){
                    response = callApiModule.callAPI(config.getCicConfig().getRealtimeSrUrl(),
                            request, "text/xml;charset=utf-8", description, token);
                }else{
                    // Mock TEST CIC Response
                    Map<CicProduct, String> mockDataMap = new HashMap<>();
                    mockDataMap.put(CicProduct.S10T, MockData.s10tSoapResponse);
                    mockDataMap.put(CicProduct.S11T, MockData.s11tSoapResponse);
                    mockDataMap.put(CicProduct.R10T, MockData.r10tSoapResponse);
                    mockDataMap.put(CicProduct.R11T, MockData.r11tSoapResponse);

                    response = mockDataMap.get(maSp);
                }
                log.info("[handleCreditRelationshipInquiry] SoapResponse={} from partner", response);

                try {
                    // Parse SOAP => JSON
                    JSONObject jsonObject = XML.toJSONObject(response);
                    log.info("[handleCreditRelationshipInquiry] Parse SOAP to JSON. jsonObject={}", jsonObject);

                    JSONObject cleaned = new JSONObject(jsonObject.toString()
                            .replace("ns2:", "")
                            .replace("env:", ""));
                    JSONObject result = cleaned
                            .getJSONObject("Envelope")
                            .getJSONObject("Body")
                            .getJSONObject(responseTag);
                    result.remove("xmlns:ns2");

                    Object dataObj = result.get("Data");
                    JSONObject data;

                    if (dataObj instanceof JSONObject) {
                        data = (JSONObject) dataObj;
                    } else {
                        String rawData = dataObj.toString(); //(String JSON)
                        data = new JSONObject(rawData);
                    }
                    log.info("[handleCreditRelationshipInquiry] FinalResponse={}", data);

                    // Check cic error
                    if (data.has("TL099")) {
                        String tl099 = data.optString("TL099", "").trim();
                        if (!tl099.isEmpty() && isCicError(tl099)) {
                            log.warn("[handleBasicCreditInquiry] CIC Error={}", tl099);
                            ctx.response().setStatusCode(400).putHeader("Content-Type", "application/json").end(gson.toJson(
                                    CicPrResponse.error("001", "CIC Error", tl099)));
                            return;
                        }
                    }
                    log.info("[CicConsumerImpl][handleCreditRelationshipInquiry] Successful (S10T + S11T & R10T + R11T)");
                    ctx.response().putHeader("Content-Type", "application/json").end(gson.toJson(CicPrResponse.success(data)));

                } catch (Exception parseEx) {
                    log.info("[handleCreditRelationshipInquiry] Parse fail => return SoapResponse={}", response);
                    ctx.response().putHeader("Content-Type", "application/json").end(gson.toJson(
                            CicPrResponse.error("001", "Failed to parse CIC response")));
                }
            } catch (Exception e) {
                log.error("[handleCreditRelationshipInquiry] Exceptions={}", e.getMessage());
                ctx.response().setStatusCode(500).putHeader("Content-Type", "application/json").end(gson.toJson(
                        CicPrResponse.error("001", "System error")));
            }
        });
    }

    private void handleBasicCreditInquiry(RoutingContext ctx) {
        log.info("[CicConsumerImpl][handleBasicCreditInquiry] Start (B11T)");

        ctx.request().bodyHandler(buffer -> {
            log.info("[handleBasicCreditInquiry] Receiving request={}",
                    buffer.toString(StandardCharsets.UTF_8).replaceAll("\\s+", " "));

            try {
                // Parse JSON
                CreditReportRequest req = gson.fromJson(buffer.toString(StandardCharsets.UTF_8), CreditReportRequest.class);
                String token = req.getToken();

                CicReportType type = CicReportType.HOI_TIN_B11T;
                String description = "Individual Basic Credit Report - B11T";
                String responseTag = "PHHoiTinB11T";

                // Validate
                validateReportRequest(type, req, ctx);
                if (ctx.response().ended()) {
                    return;
                }

                // Build SOAP
                String request = cicSoapBuilder.getCreditReport(type, req);
                log.info("[handleBasicCreditInquiry] SoapRequest={} to partner", request);

                // Call CIC
                String response;
                if(isTest){
                    response = callApiModule.callAPI(config.getCicConfig().getRealtimeB11tUrl(),
                            request, "text/xml;charset=utf-8", description, token);
                } else {
                    // Mock TEST CIC Response
                    int rand = ThreadLocalRandom.current().nextInt(100);
                    if (rand < 60) {
                        response = MockData.b11tSoapResponse;      // 60%
                    } else {
                        response = MockData.b11tSoapResponse2;     // 40%
                    }
                }
                log.info("[handleBasicCreditInquiry] SoapResponse={} from partner", response);
                try {
                    // Parse SOAP => JSON
                    JSONObject jsonObject = XML.toJSONObject(response);
                    log.info("[handleBasicCreditInquiry] Parse SOAP to JSON. jsonObject: {}", jsonObject);

                    JSONObject cleaned = new JSONObject(jsonObject.toString()
                            .replace("ns2:", "")
                            .replace("env:", ""));
                    JSONObject result = cleaned
                            .getJSONObject("Envelope")
                            .getJSONObject("Body")
                            .getJSONObject(responseTag);
                    result.remove("xmlns:ns2");

                    Object dataObj = result.get("Data");
                    JSONObject data;

                    if (dataObj instanceof JSONObject) {
                        data = (JSONObject) dataObj;
                    } else {
                        String rawData = dataObj.toString(); //(String JSON)
                        data = new JSONObject(rawData);
                    }
                    log.info("[handleBasicCreditInquiry] FinalResponse={}", data);

                    // Check cic error
                    if (data.has("TL099")) {
                        String tl099 = data.optString("TL099", "").trim();
                        if (!tl099.isEmpty() && isCicError(tl099)) {
                            log.warn("[handleBasicCreditInquiry] CIC Error={}", tl099);
                            ctx.response().setStatusCode(400).putHeader("Content-Type", "application/json").end(gson.toJson(
                                    CicPrResponse.error("001", "CIC Error", tl099)));
                            return;
                        }
                    }
                    log.info("[CicConsumerImpl][handleBasicCreditInquiry] Successful (B11T)");
                    ctx.response().putHeader("Content-Type", "application/json").end(gson.toJson(CicPrResponse.success(data)));

                } catch (Exception parseEx) {
                    log.info("[handleBasicCreditInquiry] Parse fail => return SoapResponse={}", response);
                    ctx.response().putHeader("Content-Type", "application/json").end(gson.toJson(
                            CicPrResponse.error("001", "Failed to parse CIC response")));
                }
            } catch (Exception e) {
                log.error("[handleBasicCreditInquiry] Exceptions={}", e.getMessage());
                ctx.response().setStatusCode(500).putHeader("Content-Type", "application/json").end(gson.toJson(
                        CicPrResponse.error("001", "System error")));
            }
        });
    }

    private void validateReportRequest(CicReportType type, CreditReportRequest req, RoutingContext ctx) {
        // MaSoPhieu
        if (isBlank(req.getMaSoPhieu()) || !MA_SO_PHIEU_PATTERN.matcher(req.getMaSoPhieu()).matches()) {
            error(ctx, CicValidationError.MA_SO_PHIEU_EMPTY_OR_INVALID);
            return;
        }
        if (req.getMaSoPhieu().length() > 100) {
            error(ctx, CicValidationError.MA_SO_PHIEU_EXCEED_MAX_LENGTH);
            return;
        }
        // MaSP
        if (isBlank(req.getMaSP())) {
            error(ctx, CicValidationError.MA_SAN_PHAM_EMPTY);
            return;
        }
        if (req.getMaSP().length() > 10) {
            error(ctx, CicValidationError.MA_SAN_PHAM_EXCEED_MAX_LENGTH);
            return;
        }
        // TenKH
        if (isBlank(req.getTenKH())) {
            error(ctx, CicValidationError.TEN_KHACH_HANG_EMPTY);
            return;
        }
        if (req.getTenKH().length() > 250) {
            error(ctx, CicValidationError.TEN_KHACH_HANG_EXCEED_MAX_LENGTH);
            return;
        }
        // Muc dich
        if (isBlank(req.getMucDich())) {
            error(ctx, CicValidationError.MUC_DICH_EMPTY);
            return;
        }
        if (req.getMucDich().length() > 200) {
            error(ctx, CicValidationError.MUC_DICH_EXCEED_MAX_LENGTH);
            return;
        }

        switch (type) {
            case HOI_TIN_S:
                // S11T => CCCD/Ho Chieu
                if (CicProduct.S11T.name().equals(req.getMaSP())) {
                    if (isBlank(req.getCccdHoChieu())) {
                        error(ctx, CicValidationError.CCCD_OR_PASSPORT_EMPTY);
                        return;
                    }
                    if (req.getCccdHoChieu().length() > 12) {
                        error(ctx, CicValidationError.CCCD_OR_PASSPORT_EXCEED_MAX_LENGTH);
                        return;
                    }
                }
                // S10T => MSDN
                if (CicProduct.S10T.name().equals(req.getMaSP())) {
                    if (isBlank(req.getMsdn())) {
                        error(ctx, CicValidationError.MSDN_EMPTY);
                        return;
                    }
                    if (req.getMsdn().length() > 50) {
                        error(ctx, CicValidationError.MSDN_EXCEED_MAX_LENGTH);
                        return;
                    }
                }
                break;
            case HOI_TIN_R:
                // R11T => CCCD
                if (CicProduct.R11T.name().equals(req.getMaSP())) {
                    if (isBlank(req.getCccdHoChieu())) {
                        error(ctx, CicValidationError.CCCD_OR_PASSPORT_EMPTY);
                        return;
                    }
                    if (req.getCccdHoChieu().length() > 12) {
                        error(ctx, CicValidationError.CCCD_OR_PASSPORT_EXCEED_MAX_LENGTH);
                        return;
                    }
                }
                // R10T => MSDN
                if (CicProduct.R10T.name().equals(req.getMaSP())) {
                    if (isBlank(req.getMsdn())) {
                        error(ctx, CicValidationError.MSDN_EMPTY);
                        return;
                    }
                    if (req.getMsdn().length() > 50) {
                        error(ctx, CicValidationError.MSDN_EXCEED_MAX_LENGTH);
                        return;
                    }
                }
                break;
            case HOI_TIN_B11T:
                if (isBlank(req.getCccdHoChieu())) {
                    error(ctx, CicValidationError.CCCD_OR_PASSPORT_EMPTY);
                    return;
                }
                if (req.getCccdHoChieu().length() > 12) {
                    error(ctx, CicValidationError.CCCD_OR_PASSPORT_EXCEED_MAX_LENGTH);
                    return;
                }
                break;
        }
    }

    private void error(RoutingContext ctx, CicValidationError error) {
        CicPrResponse<Object> resp = CicPrResponse.error(error.code(), error.description());
        ctx.response().setStatusCode(400).putHeader("Content-Type", "application/json").end(gson.toJson(resp));
    }

    private boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    private boolean isCicError(String tl099) {
        return CIC_ERROR_PATTERN.matcher(tl099).matches();
    }
}

