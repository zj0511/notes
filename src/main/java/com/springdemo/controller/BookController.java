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

    @RequestMapping(value = "/getBookList", method = RequestMethod.POST)
    @ResponseBody
    @SuppressWarnings("unchecked")
    public Object listBooks() {
        logger.info("listBooks");
        List<Book> books = bookService.getAllBooks(0, 10);
        Book book = new Book();
        List<Book> booksResult = new ArrayList<>();
        for (Book item : books) {
            Category category = categoryService.getCategoryById(item.getCategoryId());
            book.setId(item.getId());
            book.setIsbn(item.getIsbn());
            book.setTitle(item.getTitle());
            book.setAuthor(item.getAuthor());
            book.setCategoryId(category.getName());
            booksResult.add(book);
            book = new Book();
        }
        Map map = new HashMap<String, Object>();
        map.put("books", booksResult);
        return map;
    }

    @RequestMapping(value = "/getBook", method = RequestMethod.POST)
    @ResponseBody
    public Object getBook(@RequestParam("id") String id) {
        logger.info("getBook");
        Book book = bookService.getBookById(id);
        Category category = categoryService.getCategoryById(book.getCategoryId());
        book.setCategoryId(category.getName());
        return book;
    }
}
