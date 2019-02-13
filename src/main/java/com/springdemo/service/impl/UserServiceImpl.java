package com.springdemo.service.impl;

import com.springdemo.dao.UserDao;
import com.springdemo.entity.User;
import com.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    // 注入Service依赖
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(String userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public User getUserByName(String userName) {
        return userDao.getUserByName(userName);
    }
}
