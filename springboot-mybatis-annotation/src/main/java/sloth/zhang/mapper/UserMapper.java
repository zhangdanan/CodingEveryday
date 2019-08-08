package sloth.zhang.mapper;

import org.apache.ibatis.annotations.*;
import sloth.zhang.pojo.User;

import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 10:24 2019/8/5
 * @Modificd By;
 */

/*
* 介绍mybatis注解的常见使用方式
* */

@Mapper
public interface UserMapper {

    /*
    * 方式一：使用注解编写sql
    * */
    @Select("select * from user")
    @Results({
            @Result(property = "userId",column = "user_id"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "mobileNum",column = "phone_num")
    })
    List<User> list();


    /*
    *方式2：使用注解指定某个工具类的方法来动态编写SQL.
    * */

    @SelectProvider(type = UserSqlProvider.class,method = "listByUsername")
    List<User> listByUsername(String username);

    @Results({
            @Result(property = "userId", column = "USER_ID"),
            @Result(property = "username", column = "USERNAME"),
            @Result(property = "password", column = "PASSWORD"),
            @Result(property = "mobileNum", column = "PHONE_NUM")
    })
    @Select("select * from user")
    List<User> listSample();

    @Select("select * from user where username like #{username} and password like #{password}")
    User get(@Param("username") String username, @Param("password") String password);

    @SelectProvider(type = UserSqlProvider.class, method = "getBadUser")
    User getBadUser(@Param("username") String username, @Param("password") String password);

}
