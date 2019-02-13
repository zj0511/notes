package com.springdemo.dao;

import com.springdemo.entity.User;

/**
 * 角色
 */
public interface UserDao {

    /**
     * 通过ID查询相应角色
     * @param id 角色id
     */
    User getUserById(String userId);

    User getUserByName(String userName);
}
