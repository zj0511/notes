package com.springdemo.dao;

import com.springdemo.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {
    /**
     * 查询所有菜单
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     */
    List<Menu> getAllMenus(@Param("offset") int offset, @Param("limit") int limit);
}
