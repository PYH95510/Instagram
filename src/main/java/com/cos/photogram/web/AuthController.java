package com.cos.photogramstart.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.photogramstart.domain.user.User;
import com.cos.photogramstart.web.dto.auth.SignupDto;

@Controller
public class AuthController {

    private final Logger log = LoggerFactory.getLogger(AuthController.class);

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
    public String signup(SignupDto signupDto) {
        User user = signupDto.toEntity();
        log.info(user.toString());
        return "/auth/signin";
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
