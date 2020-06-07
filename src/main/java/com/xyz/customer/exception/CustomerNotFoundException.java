package com.xyz.customer.exception;

import com.xyz.customer.utils.ErrorCodes;

public class CustomerNotFoundException extends RuntimeException {

    private String errorCode;
    private String errorMessage;

    public CustomerNotFoundException(String errorMessage, ErrorCodes errorCode) {
        this.errorCode = errorCode.getCode();
        this.errorMessage = errorMessage;
    }
}