package com.cos.photostagram.handler;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.photostagram.handler.ex.CustomValidationException;

@RestController // by using rest controller, when error happens, this page is shown
@ControllerAdvice // collect all exceptions here
public class ControllerExceptionHandler {

    @ExceptionHandler(CustomValidationException.class)
    public Map<String, String> validationException(CustomValidationException e) {
        return e.getErrorMap();
    }

}
