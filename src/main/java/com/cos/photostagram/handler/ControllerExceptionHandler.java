package com.cos.photostagram.handler;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.photostagram.handler.ex.CustomValidationException;
import com.cos.photostagram.web.dto.auth.CMRespDto;

@RestController // by using rest controller, when error happens, this page is shown
@ControllerAdvice // collect all exceptions here
public class ControllerExceptionHandler {

    @ExceptionHandler(CustomValidationException.class)
    public CMRespDto<Map<String, String>> validationException(CustomValidationException e) {
        return new CMRespDto<>(-1, e.getMessage(), e.getErrorMap()); // if it is succedded 1, fail -1. it is just http
                                                                     // protocol.
    }

}
