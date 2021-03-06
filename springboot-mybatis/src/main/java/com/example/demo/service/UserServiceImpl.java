package com.example.demo.service;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 15:44 2019/7/31
 * @Modificd By;
 */


@Service
public class UserServiceImpl implements UserService{


    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> list(){
        return userMapper.list();
    }

    @Override
    public List<User> findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public User get(String userId) {
        return userMapper.getOne(userId);
    }

    @Override
    public int delete(String userId){
        return userMapper.delete(userId);
    }


}
