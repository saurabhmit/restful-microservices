package com.spboot.restfulmicroservices.mapper;

import com.spboot.restfulmicroservices.dto.UserDto;
import com.spboot.restfulmicroservices.entity.User;

public class UserMapper {

    // convert USer JPA Entity into UserDto
    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }
    //Convert userDto to User JPA Entity
    public static User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }
}
