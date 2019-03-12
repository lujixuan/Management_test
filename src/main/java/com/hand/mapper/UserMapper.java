package com.hand.mapper;

import com.hand.dto.UserDto;

public interface UserMapper {
    void addUser(UserDto userDto);

    void updateUser(UserDto userDto);

    UserDto selectById(String id);

    boolean selectIsRepeat(String id);
}
