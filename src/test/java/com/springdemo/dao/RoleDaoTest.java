package com.springdemo.dao;

import com.springdemo.BaseTest;
import com.springdemo.entity.Role;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleDaoTest extends BaseTest {

    @Autowired
    private RoleDao roleDao;

    @Test
    public void getRoleById() throws Exception {
        String roleId = "1";
        Role role = roleDao.getRoleById(roleId);
        System.out.println(role);
    }
}
