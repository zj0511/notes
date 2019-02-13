package com.springdemo.service;

import com.springdemo.entity.User;

public interface UserService {
    /**
     * 根据id获取角色
     * @param roleId 角色id
     * @return 相应角色
     */
    User getUserById(String userId);

    User getUserByName(String userName);
}
