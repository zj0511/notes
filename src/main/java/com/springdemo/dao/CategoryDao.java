package com.springdemo.dao;

import com.springdemo.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 图书类别
 */
public interface CategoryDao {
    /**
     * 通过ID查询类别
     * @param id
     * @return
     */
    Category getCategoryById(long id);

    /**
     * 查询所有类别
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Category> getAllCategories(@Param("offset") int offset, @Param("limit") int limit);
}
