package com.xyz.customer.utils;

public enum ErrorCodes {
    CUSTOMER_NOT_FOUND();
    private String errorCode;

    ErrorCodes() {
        this.errorCode = "ER001";
    }

    public String getCode() {
        return errorCode;
    }

}
