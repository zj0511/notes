package com.springdemo.service;

import com.springdemo.entity.Book;
import com.springdemo.entity.Category;

import java.util.List;

;

public interface BookService {

	/**
	 * 查询一本图书
	 * @param id
	 * @return
	 */
	Book getById(long bookId);

	/**
	 * 查询所有图书
	 * @return
	 */
	List<Book> getAllBooks();
}
