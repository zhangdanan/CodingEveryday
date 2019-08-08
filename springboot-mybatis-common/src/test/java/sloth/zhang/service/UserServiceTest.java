package sloth.zhang.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sloth.zhang.SpringbootMybatisCommonApplicationTests;
import sloth.zhang.pojo.User;

import static org.junit.Assert.*;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 16:20 2019/8/5
 * @Modificd By;
 */
public class UserServiceTest extends SpringbootMybatisCommonApplicationTests {

    @Autowired
    UserService userService;
    @Test
    public void save(){
        User user=new User();
        user.setUsername("wangbadan");
        user.setUserId("4");
        user.setMobileNum("188792466");
        user.setPassword("555555");
        userService.save(user);
    }

    @Test
    public void update(){
        User user=new User();
        user.setUserId("2");
        user.setUsername("wshishabim");
        userService.update(user);
    }

    @Test
    public void delete(){
        User user=new User();
        user.setUserId("2");
        userService.delete(user);

    }

    @Test
    public void list(){
        User user=new User();
        userService.list(user);
        System.out.println(user);
    }

}