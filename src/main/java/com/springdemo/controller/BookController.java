package com.springdemo.controller;

import com.springdemo.entity.Book;
import com.springdemo.entity.Category;
import com.springdemo.service.BookService;
import com.springdemo.service.CategoryService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    private static final Log logger = LogFactory.getLog(BookController.class);

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/bookList", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    @SuppressWarnings("unchecked")
    public Object listBooks() {
        logger.info("listBooks");
        List<Book> books = bookService.getAllBooks(0,10);
        Book book = new Book();
        List<Book> booksResult = new ArrayList<>();
        for (Book item : books) {
            Category category = categoryService.getCategoryById(item.getCategoryId());
            book.setIsbn(item.getIsbn());
            book.setTitle(item.getTitle());
            book.setAuthor(item.getAuthor());
            book.setCategoryId(category.getName());
            booksResult.add(book);
        }
        Map map = new HashMap<String, Object>();
        map.put("books", booksResult);
        return map;
    }
}
