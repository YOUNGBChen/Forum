package com.bcyoung.forum.service;

import com.bcyoung.forum.dao.UserMapper;
import com.bcyoung.forum.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int userId){
        return userMapper.selectById(userId);
    }
}
