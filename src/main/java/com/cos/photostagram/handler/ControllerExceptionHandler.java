package com.cos.photostagram.handler;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.photostagram.handler.ex.CustomValidationException;
import com.cos.photostagram.util.Script;
import com.cos.photostagram.web.dto.auth.CMRespDto;

@RestController // by using rest controller, when error happens, this page is shown
@ControllerAdvice // collect all exceptions here
public class ControllerExceptionHandler {

    @ExceptionHandler(CustomValidationException.class)
    public String validationException(CustomValidationException e) {
        return Script.back(e.getMessage().toString());

        // if it is succedded 1, fail -1. it is just http. For ajax or developers,
        // CMRespDto is better, however, for the users, Script is better
        // protocol.
    }

}
// if we are using geneirc type, we can return any type of error message, it
// doesn't have to be string type. It can be int or what ever.