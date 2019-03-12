package com.hand.controller;

import com.hand.dto.UserDto;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addOrUpdate", method = RequestMethod.POST)
    public String addUser(@RequestParam(value = "userId", required = false) String userId, UserDto userDto){
        if(userId == null){
            userService.addUser(userDto);
        }
        else{
            userService.updateUser(userDto);
        }
        return "user";
    }

    @RequestMapping(value = "/selectById", method = RequestMethod.POST)
    @ResponseBody
    public UserDto selectById(String id){
        return userService.selectById(id);
    }

    @RequestMapping(value = "/selectIsRepeat", method = RequestMethod.POST)
    public boolean selectIsRepeat(String id){
        return userService.selectIsRepeat(id);
    }
}
