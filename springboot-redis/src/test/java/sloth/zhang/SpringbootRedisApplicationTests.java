package sloth.zhang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.concurrent.RejectedExecutionHandler;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Test
    public void contextLoads() {
        //这里相当于redis对String类型的set操作
        redisTemplate.opsForValue().set("00000","00000");
        //这里相当于redis对String类型的get操作
        String test = (String)redisTemplate.opsForValue().get("00000");
        System.out.println(test);
    }
     @Test
    public void test(){
       // redisTemplate.opsForHash().putAll("b");
       redisTemplate.opsForList().leftPush("list","java");
       redisTemplate.opsForList().leftPush("list","python");
       redisTemplate.opsForList().leftPush("list","golong");

        // String test = (String)redisTemplate.opsForList().range("list",0,-1);
         System.out.println(redisTemplate.opsForList().range("list",0,-1));

}

}
