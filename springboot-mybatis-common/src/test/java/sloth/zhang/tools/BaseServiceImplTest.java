package sloth.zhang.tools;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sloth.zhang.SpringbootMybatisCommonApplication;
import sloth.zhang.mapper.UserMapper;
import sloth.zhang.pojo.User;
import sloth.zhang.service.UserService;

import static org.junit.Assert.*;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 16:04 2019/8/5
 * @Modificd By;
 */
public class BaseServiceImplTest extends SpringbootMybatisCommonApplication {

   @Autowired

   UserService userService;

    @Test
    public void list() {

    }

    @Test
    public void get() {
    }

    @Test
    public void update() {
    }

    @Test
    public void save() {
        User user=new User();
        user.setPassword("sss");
        user.setMobileNum("sdsdasd");
        user.setUserId("3");
        user.setUsername("zhangynan");
        userService.save(user);




    }

    @Test
    public void delete() {
    }
}