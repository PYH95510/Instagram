package com.cos.photostagram.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    @GetMapping("/user/{id}") // it should be existed as variable because there should be more than one users.
    public String profile(@PathVariable Integer id) {
        return "user/profile";
    }
}