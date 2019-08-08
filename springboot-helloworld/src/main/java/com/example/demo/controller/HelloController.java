package com.example.demo.controller;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 13:47 2019/7/31
 * @Modificd By;
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
