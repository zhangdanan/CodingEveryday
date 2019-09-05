package sloth.zhang.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sloth.zhang.domain.User;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 11:10 2019/8/21
 * @Modificd By;
 */
@RestController
public class UserController {



    @RequestMapping("/get")
    @Cacheable(value="user-key")
    public User getUser() {
        User user=new User();
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }
}

