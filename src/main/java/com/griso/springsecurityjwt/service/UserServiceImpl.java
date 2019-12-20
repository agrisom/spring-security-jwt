package com.griso.springsecurityjwt.service;

import com.griso.springsecurityjwt.dto.UserDto;
import com.griso.springsecurityjwt.mapper.UserMapper;
import com.griso.springsecurityjwt.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepo repository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto findByUsername(String username) {
        return userMapper.toUserDto(repository.findByUsername(username).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User " + username + " not found")));
    }
}
