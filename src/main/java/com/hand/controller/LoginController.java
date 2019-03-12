package com.hand.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestParam("userId") String userId, @RequestParam("userPwd") String userPwd){
        if(userId.equals("123") && userPwd.equals("123")){
            return "user";
        }
        return "redirect:/login.html";
    }
}
