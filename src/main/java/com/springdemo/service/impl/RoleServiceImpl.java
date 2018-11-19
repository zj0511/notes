package com.springdemo.service.impl;

import com.springdemo.dao.RoleDao;
import com.springdemo.entity.Role;
import com.springdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    // 注入Service依赖
    @Autowired
    private RoleDao roleDao;

    @Override
    public Role getRoleById(String roleId) {
        return roleDao.getRoleById(roleId);
    }
}
