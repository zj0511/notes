package com.springdemo.service;

import com.springdemo.entity.Category;

import java.util.List;

public interface CategoryService {

    /**
     * 获取单个类别
     * @param categoryId
     * @return
     */
    Category getCategoryById(String categoryId);

    /**
     * 查询所有类别
     * @return
     */
    List<Category> getAllCategories(int offset, int limit);
}
