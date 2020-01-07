package com.griso.springsecurityjwt.service;

import com.griso.springsecurityjwt.model.AuthenticationRequest;

import java.util.Map;

public interface IAuthenticationService {

    Map<String, String> authenticate(AuthenticationRequest authenticationRequest);
}
