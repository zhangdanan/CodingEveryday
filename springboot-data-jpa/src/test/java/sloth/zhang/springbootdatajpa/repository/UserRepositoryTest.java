package sloth.zhang.springbootdatajpa.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sloth.zhang.springbootdatajpa.entity.User;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 16:16 2019/8/8
 * @Modificd By;
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {


    @Autowired
    UserRepository userRepository;

    @Test
    public void tesh(){
//        System.out.println(userRepository.findByEmailAndName("zhang","wang"));
        User user=new User();
        user.setId(1l);
        user.setEmail("wang");
        user.setName("wang");
        userRepository.save(user);
    }

    @Test
    public void test(){

        System.out.println(userRepository.findAll());
    }






}