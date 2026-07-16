package com.phelim.gateway_vertx_project.enums;

public enum CicValidationError {

    // ===== MaSoPhieu =====
    MA_SO_PHIEU_EMPTY_OR_INVALID("IN_01", "Mã số phiếu null hoặc trống hoặc chứa kí tự đặc biệt"),
    MA_SO_PHIEU_EXCEED_MAX_LENGTH("IN_02", "Mã số phiếu vượt quá số kí tự quy định"),

    // ===== MaSP =====
    MA_SAN_PHAM_EMPTY("???", "Mã sản phẩm null hoặc trống"),
    MA_SAN_PHAM_EXCEED_MAX_LENGTH("???", "Mã sản phẩm vượt quá số kí tự quy định"),

    // ===== TenKH =====
    TEN_KHACH_HANG_EMPTY("IN_03", "Tên khách hàng null hoặc trống"),
    TEN_KHACH_HANG_EXCEED_MAX_LENGTH("IN_04", "Tên khách hàng vượt quá số kí tự quy định"),

    // ===== CCCD / Ho chieu =====
    CCCD_OR_PASSPORT_EMPTY("IN_05", "Số căn cước công dân hoặc hộ chiếu null hoặc trống"),
    CCCD_OR_PASSPORT_EXCEED_MAX_LENGTH("IN_06", "Số căn cước công dân hoặc hộ chiếu vượt quá số kí tự quy định"),

    // ===== MSDN =====
    MSDN_EMPTY("IN_11", "Mã số Doanh nghiệp/Quyết định thành lập/Giấy phép đầu tư null hoặc trống"),
    MSDN_EXCEED_MAX_LENGTH("IN_12", "Mã số Doanh nghiệp/Quyết định thành lập/Giấy phép đầu tư vượt quá số kí tự quy định"),

    // ===== Muc dich =====
    MUC_DICH_EMPTY("IN_09", "Mục đích tra cứu null hoặc trống"),
    MUC_DICH_EXCEED_MAX_LENGTH("???", "Mục đích tra cứu vượt quá số kí tự quy định");



    private final String code;
    private final String description;

    CicValidationError(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String code() {
        return code;
    }

    public String description() {
        return description;
    }
}

