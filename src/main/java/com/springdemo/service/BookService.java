package com.springdemo.service;

import com.springdemo.entity.Book;

import java.util.List;

public interface BookService {

	/**
	 * 查询一本图书
	 * @param id
	 * @return
	 */
	Book getById(String bookId);

	/**
	 * 查询所有图书
	 * @return
	 */
	List<Book> getAllBooks(int offset, int limit);
}
