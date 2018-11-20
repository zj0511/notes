package com.springdemo.dao;

import com.springdemo.BaseTest;
import com.springdemo.entity.Menu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class MenuDaoTest extends BaseTest {

    @Autowired
    private MenuDao menuDao;

    @Test
    public void getAllMenus() {
        List<Menu> menus =  menuDao.getAllMenus(0,10);
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }
}