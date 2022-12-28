package com.cos.photostagram.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cos.photostagram.config.auth.PrincipalDetails;

@Controller
public class UserController {

    @GetMapping("/user/{id}") // it should be existed as variable because there should be more than one users.
    public String profile(@PathVariable Integer id) {
        return "user/profile";
    }

    @GetMapping("/user/{id}/update")
    public String update(@PathVariable Integer id, @AuthenticationPrincipal PrincipalDetails principalDetails,
            Model model) {
        System.out.println("Verifying session information" + principalDetails.getUser());
        model.addAttribute("principal", principalDetails.getUser()); // we can add it to the .jsp file
        return "user/update";
    }

    // spring security automatically has sign in and sign out function

}
