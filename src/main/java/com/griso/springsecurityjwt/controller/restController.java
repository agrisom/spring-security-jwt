package com.griso.springsecurityjwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller("rest")
public class restController {

    @GetMapping("/public")
    public String getPublicContent() {
        return "Public";
    }

    @GetMapping("/private")
    public String getPrivateContent() {
        return "Private (Only logged users)";
    }

    @GetMapping("/admin")
    public String getAdminContent() {
        return "Private (Only ADMIN users)";
    }
}
