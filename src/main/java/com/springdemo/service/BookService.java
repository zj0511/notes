package com.springdemo.service;

import com.springdemo.entity.Book;

import java.util.List;

public interface BookService {

	/**
	 * 查询一本图书
	 * @param bookId
	 */
	Book getBookById(String bookId);

	/**
	 * 查询所有图书
	 */
	List<Book> getAllBooks(int offset, int limit);
}
