package com.springdemo.dao;

import com.springdemo.BaseTest;
import com.springdemo.entity.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class CategoryDaoTest extends BaseTest {

    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void getCategoryById() throws Exception {
        long categoryId = 1L;
        Category category = categoryDao.getCategoryById(categoryId);
        System.out.println(category);
    }

    @Test
    public void getAllCategories() throws Exception {
        List<Category> categoryList = categoryDao.getAllCategories(0, 3);
        for (Category category : categoryList) {
            System.out.println(category);
        }
    }
}