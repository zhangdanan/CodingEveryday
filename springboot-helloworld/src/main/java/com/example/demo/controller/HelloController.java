package com.example.demo.controller;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 13:47 2019/7/31
 * @Modificd By;
 */

import com.example.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/get")
    public User getUser(){
        User user=new User();
        user.setId("1");
        user.setName("zhang");
        user.setWord("nishige shabi");
        return user;
    }
}
