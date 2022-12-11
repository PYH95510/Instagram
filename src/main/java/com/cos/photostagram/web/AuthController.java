package com.cos.photostagram.web;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.photostagram.domain.user.User;
import com.cos.photostagram.handler.ex.CustomValidationException;
import com.cos.photostagram.service.AuthService;
import com.cos.photostagram.web.dto.auth.SignupDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // construct objects for final variables
@Controller
public class AuthController {
    // annotation form that we should follow to use exception handler, if we are
    // using this, all the exceptions, inside the Runtime exceptions will be taken
    // to here

    private final Logger log = LoggerFactory.getLogger(AuthController.class);

    // private AuthService authService;

    // public AuthController(AuthService authService) {
    // this.authService = authService;
    // }
    private final AuthService authService; // same di as above

    // move to sign in page
    @GetMapping("/auth/singin")
    public String signinForm() {
        return ".auth/signin";
    }

    @GetMapping("/auth/signup")
    public String signupForm() {
        return "/auth/signup";
    }

    @PostMapping("/auth/signup")
    public String signup(@Valid SignupDto signupDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            Map<String, String> errorMap = new HashMap<>();
            for (FieldError error : bindingResult.getFieldErrors()) {
                errorMap.put(error.getField(), error.getDefaultMessage());
                System.out.println(error.getDefaultMessage());
            }
            throw new CustomValidationException("validation fail", errorMap);
        } else {

            User user = signupDto.toEntity();
            // log.info(user.toString());
            User userEntity = authService.Singups(user);
            System.out.println(userEntity);
            return "/auth/signin";

        }

    }

}
/*
 * even if get and post mapping are having same url, one has get and the
 * otherone has post mapping. Getmapping is just getting maping value from
 * url and going to the signup page. However, postmapping is different. Even if
 * we first go to the signup page, we are going to request
 * data or the data will be posted, we will return to the other page that we
 * typed above.
 */
