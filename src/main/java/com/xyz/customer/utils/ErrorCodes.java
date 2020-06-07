package com.xyz.customer.utils;

public enum ErrorCodes {
    CUSTOMER_NOT_FOUND("ER001");
    private String errorCode;

    ErrorCodes(String code) {
        this.errorCode = code;
    }

    public String getCode() {
        return errorCode;
    }

}
