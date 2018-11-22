package com.springdemo.service;

import com.springdemo.entity.Menu;

import java.util.List;

public interface MenuService {
    /**
     * 获取菜单
     * @param offset 起始
     * @param limit 查询数目
     * @return 满足条件的菜单
     */
    List<Menu> getAllMenus(int offset, int limit);
}
