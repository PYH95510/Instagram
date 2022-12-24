package com.cos.photostagram.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/profile")
    public String profile() {
        return "user/profile";
    }
}
