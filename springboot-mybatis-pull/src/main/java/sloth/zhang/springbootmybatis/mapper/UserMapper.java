package sloth.zhang.springbootmybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import sloth.zhang.springbootmybatis.pojo.User;

import java.util.List;


@Repository
@Mapper
public interface UserMapper {

    @Select("select * from t_user where 1=1")
    List<User> list();

    @Select("select * from t_user where username like #{username}")
    List<User> findByUsername(String username);

    @Select("select * from t_user where user_id like #{userId}")
    User getOne(String userId);

    @Delete("delete from t_user where user_id like #{userId}")
    int delete(String userId);


    @Insert("insert into t_user(user_id,username,password) values(2,wang,123),(3,tang,123)")
    int insert(String userId,String username,String password);



}
