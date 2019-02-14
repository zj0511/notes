package com.springdemo.dao;

import com.springdemo.BaseTest;
import com.springdemo.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void getRoleById() throws Exception {
        String userId = "1";
        User user = userDao.getUserById(userId);
        System.out.println(user);
    }
}
