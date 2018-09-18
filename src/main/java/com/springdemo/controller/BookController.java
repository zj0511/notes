package com.springdemo.controller;

import com.springdemo.dto.Result;
import com.springdemo.entity.Book;
import com.springdemo.entity.Category;
import com.springdemo.service.BookService;
import net.sf.json.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    private static final Log logger = LogFactory.getLog(BookController.class);

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/bookList", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    @SuppressWarnings("unchecked")
    public Object listBooks(Model model) {
        logger.info("listBooks");
        List<Book> books = bookService.getAllBooks();
        Map map = new HashMap<String, Object>();
        map.put("status", "200");
        map.put("message", "获得图书列表");
        Map map2 = new HashMap<String, Object>();
        map2.put("books", books);
        map.put("data", map2);
        return map;
    }
}
