package com.griso.springsecurityjwt.controller;

import com.griso.springsecurityjwt.model.AuthenticationRequest;
import com.griso.springsecurityjwt.service.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class restController {

    @Autowired
    private IAuthenticationService authService;

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

    @PostMapping("/authenticate")
    public Map<String, String> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) {
        return authService.authenticate(authenticationRequest);
    }
}
