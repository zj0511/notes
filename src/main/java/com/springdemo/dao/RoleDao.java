package com.springdemo.dao;

import com.springdemo.entity.Role;

/**
 * 角色
 */
public interface RoleDao {

    /**
     * 通过ID查询相应角色
     * @param id 角色id
     */
    Role getRoleById(String id);
}
