package com.springdemo.dao;

import com.springdemo.BaseTest;
import com.springdemo.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class BookDaoTest extends BaseTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testGetBookById() throws Exception {
        long bookId = 1;
        Book book = bookDao.getBookById(bookId);
        System.out.println(book);
    }

    @Test
    public void testGetAllBooks() throws Exception {
        List<Book> books = bookDao.getAllBooks(0, 2);
        for (Book book : books) {
            System.out.println(book);
        }
    }

}