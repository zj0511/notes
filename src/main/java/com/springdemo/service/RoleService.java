package com.springdemo.service;

import com.springdemo.entity.Role;

public interface RoleService {
    /**
     * 根据id获取角色
     * @param roleId 角色id
     * @return 相应角色
     */
    Role getRoleById(String roleId);
}
