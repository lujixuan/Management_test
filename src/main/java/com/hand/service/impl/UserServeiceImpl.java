package com.hand.service.impl;

import com.hand.dto.UserDto;
import com.hand.mapper.UserMapper;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServeiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(UserDto userDto){
        userMapper.addUser(userDto);
    }

    @Override
    public void updateUser(UserDto userDto){
        userMapper.updateUser(userDto);
    }

    @Override
    public UserDto selectById(String id){
        return userMapper.selectById(id);
    }

    @Override
    public boolean selectIsRepeat(String id){
        return userMapper.selectIsRepeat(id);
    }
}
