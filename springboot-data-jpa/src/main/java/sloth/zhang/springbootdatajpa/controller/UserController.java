package sloth.zhang.springbootdatajpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sloth.zhang.springbootdatajpa.entity.User;
import sloth.zhang.springbootdatajpa.repository.UserRepository;

import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 15:50 2019/8/8
 * @Modificd By;
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/list")
    public List<User> list(){
       return userRepository.findAll();
    }


    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") long id){
        User user=userRepository.findAll().get(0);
        return user;
    }


    @RequestMapping("/user/delete/{id}")
    public List<User> delete(@PathVariable("id") long id){
        userRepository.deleteById(id);
        return userRepository.findAll();
    }

    @RequestMapping("/user/update")
    public User update(User user){
        User update=userRepository.save(user);
        return update;
    }



    @GetMapping("/user/save")
    public User insertUser(User user){
        User save=userRepository.save(user);
        return save;
    }



}
