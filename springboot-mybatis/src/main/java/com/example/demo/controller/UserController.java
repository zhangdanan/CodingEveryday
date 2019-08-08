package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 16:11 2019/7/31
 * @Modificd By;
 */

@Controller
public class UserController {
  @Autowired
    UserService userService;



  @GetMapping("/list")
  @ResponseBody
   public List<User> list(){
      return userService.list();
  }

  @GetMapping("list/{username}")
   public List<User> findByUsername(String username){
      return userService.findByUsername(username);
  }

  @GetMapping("get/{userId}")
  public User get(String userId){
      return userService.get(userId);
  }

  @DeleteMapping("delete/{userId}")
    public int delete(String userId){
      return userService.delete(userId);
  }

}
