package com.cos.photostagram.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//webapp/WEB-INF/views

@Controller
public class ImageController {

    @GetMapping({ "/", "/image/story" }) // by using getmapping, we connect
    public String story() {
        return "image/story";
    }

    @GetMapping("/image/popular") // by using getmapping, we should connect to this url
    public String popular() {
        return "image/popular"; // returning this static
    }

    @GetMapping("/image/upload")
    public String upload() {
        return "image/upload";
    }

}
