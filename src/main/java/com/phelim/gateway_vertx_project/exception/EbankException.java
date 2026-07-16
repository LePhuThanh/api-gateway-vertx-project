package com.phelim.gateway_vertx_project.exception;

public class EbankException extends Exception {
    private String errCode = "";
    private String errMsg = "";

    public EbankException(String errCode) {
        this.errCode = errCode;
    }

    public EbankException(String errCode, String errMsg){
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode( ){
        return errCode;
    }

    public void setErrCode(String errCode){
        this.errCode = errCode;
    }

    public String getErrMsg( ){
        return errMsg;
    }

    public void setErrMsg(String errMsg){
        this.errMsg = errMsg;
    }
}

