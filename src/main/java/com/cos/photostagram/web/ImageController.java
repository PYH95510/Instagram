package com.cos.photostagram.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageController {

    @GetMapping({ "/", "/image/story" }) // by using getmapping, we connect
    public String story() {
        return "image/story";
    }

    @GetMapping("/image/popular") // by using getmapping, we connect
    public String popular() {
        return "image/popular";
    }
}
