package com.springdemo.service.impl;

import com.springdemo.dao.MenuDao;
import com.springdemo.entity.Menu;
import com.springdemo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> getAllMenus(int offset, int limit) {
        return menuDao.getAllMenus(0, 10);
    }
}
