package sloth.zhang.springbootmybatis.service;

import sloth.zhang.springbootmybatis.pojo.User;
import java.util.List;

public interface UserService {

    List<User> list();

    List<User> findByUsername(String username);

    User get(String userId);

    int delete(String userId);


    int insert(String userId,String username,String password);

}
