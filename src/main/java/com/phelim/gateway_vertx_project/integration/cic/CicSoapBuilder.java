package com.phelim.gateway_vertx_project.integration.cic;

import com.phelim.gateway_vertx_project.dto.request.CreditReportRequest;
import com.phelim.gateway_vertx_project.enums.CicReportType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CicSoapBuilder {

    public String getCreditReport(CicReportType type, CreditReportRequest req) {
        log.info("[getCreditReport] Build SOAP with type={}", type.name());
        StringBuilder sb = new StringBuilder(512);

        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" ")
                .append("xmlns:cic=\"http://www.endpoint.ws.h2h.cic.org.vn/cicqr\">")
                .append("<soapenv:Header/>")
                .append("<soapenv:Body>");

        sb.append(openTag(type.code()));
        sb.append(tag("MaSoPhieu", req.getMaSoPhieu()));
        sb.append(tag("MaSP", req.getMaSP()));
        sb.append(tag("CCCD_HoChieu", req.getCccdHoChieu()));
        if (type != CicReportType.HOI_TIN_B11T) {
            sb.append(tag("MSDN_QDTL_GPDT", req.getMsdn()));
        }
        sb.append(tag("TenKH", req.getTenKH()));
        sb.append(tag("MucDich", req.getMucDich()));
        sb.append(closeTag(type.code()));

        sb.append("</soapenv:Body>")
                .append("</soapenv:Envelope>");

        return sb.toString();
    }

    private String tag(String name, String value) {
        return "<cic:" + name + ">" + (value == null ? "" : value) + "</cic:" + name + ">";
    }
    private String openTag(String name) {
        return "<cic:" + name + ">";
    }
    private String closeTag(String name) {
        return "</cic:" + name + ">";
    }

}

