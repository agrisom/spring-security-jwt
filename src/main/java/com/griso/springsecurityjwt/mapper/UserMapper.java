package com.griso.springsecurityjwt.mapper;

import com.griso.springsecurityjwt.dto.UserDto;
import com.griso.springsecurityjwt.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

}
