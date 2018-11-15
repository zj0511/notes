package com.springdemo.service.impl;

import com.springdemo.dao.BookDao;
import com.springdemo.entity.Book;
import com.springdemo.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private BookDao bookDao;

    @Override
    public Book getBookById(String bookId) {
        logger.info("getBookById");
        return bookDao.getBookById(bookId);
    }

    @Override
    public List<Book> getAllBooks(int offset, int limit) {
        logger.info("getAllBooks");
        return bookDao.getAllBooks(offset, limit);
    }

}
