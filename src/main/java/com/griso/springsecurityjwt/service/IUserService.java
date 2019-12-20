package com.griso.springsecurityjwt.service;

import com.griso.springsecurityjwt.dto.UserDto;

public interface IUserService {

    UserDto findByUsername(String username);

}
