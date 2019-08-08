package sloth.zhang.springbootmybatis.controller;

import org.springframework.web.bind.annotation.*;
import sloth.zhang.springbootmybatis.pojo.R;
import sloth.zhang.springbootmybatis.pojo.User;
import sloth.zhang.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("list")
    public List<User> list() {
           return userService.list();}

    @GetMapping("list/{username}")
    public List<User> listbyname(@PathVariable("username")  String username) {
            return userService.findByUsername(username);}


    @GetMapping("get/{userId}")
    public User get(@PathVariable("userId") String userId) {
            return userService.get(userId);}


    @GetMapping("del/{userId}")
    public int delete(@PathVariable("userId") String userId) {
        return userService.delete(userId);
    }

//    @PostMapping("is")
//    public int insert(){
//        return userService.insert();
//    }
//

}
