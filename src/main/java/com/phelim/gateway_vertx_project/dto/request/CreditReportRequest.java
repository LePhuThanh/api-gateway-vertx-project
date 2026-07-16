package com.phelim.gateway_vertx_project.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditReportRequest {
    @JsonProperty("token")
    private String token;

    @JsonProperty("maSoPhieu")
    private String maSoPhieu;
    @JsonProperty("maSP")
    private String maSP; // S10T, S11T & R10T, R11T & B11T
    @JsonProperty("tenKH")
    private String tenKH;
    @JsonProperty("cccdHoChieu")
    private String cccdHoChieu;
    @JsonProperty("msdn")
    private String msdn;
    @JsonProperty("mucDich")
    private String mucDich;

    public String getToken() {
        return token;
    }

    public String getMaSoPhieu() {
        return maSoPhieu;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getCccdHoChieu() {
        return cccdHoChieu;
    }

    public String getMsdn() {
        return msdn;
    }

    public String getMucDich() {
        return mucDich;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setMaSoPhieu(String maSoPhieu) {
        this.maSoPhieu = maSoPhieu;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setCccdHoChieu(String cccdHoChieu) {
        this.cccdHoChieu = cccdHoChieu;
    }

    public void setMsdn(String msdn) {
        this.msdn = msdn;
    }

    public void setMucDich(String mucDich) {
        this.mucDich = mucDich;
    }
}

