package com.cos.photostagram.handler.ex;

import java.util.Map;

// to Identify serial number
// for JVM
public class CustomValidationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private Map<String, String> errorMap;

    public CustomValidationException(String message, Map<String, String> errorMap) {
        super(message); // super(message) -> RuntimeException's String(s) super
        this.errorMap = errorMap; // DI

    }

    public Map<String, String> getErrorMap() {
        return errorMap;
    }
}
