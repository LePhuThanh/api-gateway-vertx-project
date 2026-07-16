package com.phelim.gateway_vertx_project.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
public class CicPrResponse<T> {

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CicPrResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CicPrResponse() {
    }

    public static <T> CicPrResponse<T> success(T data) {
        return new CicPrResponse<>("00", "SUCCESS", data);
    }

    public static <T> CicPrResponse<T> error(String code, String message) {
        return new CicPrResponse<>(code, message, null);
    }

    public static <T> CicPrResponse<T> error(String code, String message, T data) {
        return new CicPrResponse<>(code, message, data);
    }
}

