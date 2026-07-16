package com.phelim.gateway_vertx_project.enums;

public enum CicProduct {

    S10T("S10T", "Báo cáo thông tin quan hệ tín dụng chi tiết khách hàng pháp nhân", CicReportType.HOI_TIN_S),
    S11T("S11T", "Báo cáo thông tin quan hệ tín dụng chi tiết khách hàng cá nhân", CicReportType.HOI_TIN_S),

    R10T("R10T", "Báo cáo thông tin quan hệ tín dụng tổng hợp khách hàng pháp nhân", CicReportType.HOI_TIN_R),
    R11T("R11T", "Báo cáo thông tin quan hệ tín dụng tổng hợp khách hàng cá nhân", CicReportType.HOI_TIN_R),

    B11T("B11T", "Báo cáo thông tin quan hệ tín dụng cơ bản khách hàng cá nhân", CicReportType.HOI_TIN_B11T);

    private final String code;
    private final String description;
    private final CicReportType type;

    CicProduct(String code, String description, CicReportType type) {
        this.code = code;
        this.description = description;
        this.type = type;
    }

    public String code() {
        return code;
    }

    public String description() {
        return description;
    }

    public CicReportType getType() {
        return type;
    }

    public static CicProduct fromCode(String code) {
        for (CicProduct p : values()) {
            if (p.code.equals(code)) {
                return p;
            }
        }
        throw new IllegalArgumentException("Unsupported product: " + code);
    }

}

