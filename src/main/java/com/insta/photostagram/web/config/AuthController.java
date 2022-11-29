package com.insta.photostagram.web.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/auth/signin")
    public String signinForm(){

        return "auth/signin";
    }

    @GetMapping("/auth/signup")
    public String signupForm(){

        return "auth/signup";
    }

    @PostMapping("/auth/signup")
    public String signup(){

        return "auth/signin"; //once you successfully sign up, you need to go back to sign in.

    }

}
