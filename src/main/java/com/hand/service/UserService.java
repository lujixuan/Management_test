package com.hand.service;

import com.hand.dto.UserDto;

import java.util.List;

public interface UserService {
    void addUser(UserDto userDto);

    void updateUser(UserDto userDto);

    UserDto selectById(String id);

    boolean selectIsRepeat(String id);
}
