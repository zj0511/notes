package com.springdemo.dao;

import com.springdemo.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 图书
 */
public interface BookDao {

    /**
     * 通过ID查询单本图书
     * @param id
     * @return
     */
    Book getBookById(String id);

    /**
     * 查询所有图书
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Book> getAllBooks(@Param("offset") int offset, @Param("limit") int limit);

}
