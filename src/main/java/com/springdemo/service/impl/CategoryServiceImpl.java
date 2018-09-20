package com.springdemo.service.impl;

import com.springdemo.dao.CategoryDao;
import com.springdemo.entity.Category;
import com.springdemo.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Category getCategoryById(String categoryId) {
        logger.info("getCategoryById");
        return categoryDao.getCategoryById(categoryId);
    }

    @Override
    public List<Category> getAllCategories(int offset, int limit) {
        logger.info("getAllCategories");
        return categoryDao.getAllCategories(offset, limit);
    }
}
