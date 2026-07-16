package com.phelim.gateway_vertx_project.enums;

public enum CicReportType {

    HOI_TIN_S("HoiTinS", "Tra cứu chi tiết CIC (S10T/S11T)", "DETAIL"),
    HOI_TIN_R("HoiTinR", "Tra cứu tổng hợp CIC (R10T/R11T)", "SUMMARY"),
    HOI_TIN_B11T("HoiTinB11T", "Tra cứu thông tin quan hệ tín dụng cơ bản khách hàng cá nhân (B11T)", "DETAIL");

    private final String code;
    private final String description;
    private final String category;

    CicReportType(String code, String description, String category) {
        this.code = code;
        this.description = description;
        this.category = category;
    }

    public String code() {
        return code;
    }

    public String description() {
        return description;
    }

    public String category() {
        return category;
    }

    public static CicReportType fromCode(String code) {
        for (CicReportType type : values()) {
            if (type.code.equalsIgnoreCase(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unsupported CIC report type: " + code);
    }
}

