package com.spboot.restfulmicroservices.service;

import com.spboot.restfulmicroservices.dto.UserDto;
import com.spboot.restfulmicroservices.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto getUserById(Long userId);
    List<UserDto> getAllUser();
    UserDto updateUser(UserDto user);
    void deleteUser(Long userId);
}
