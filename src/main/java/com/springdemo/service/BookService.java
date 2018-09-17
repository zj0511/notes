package com.springdemo.service;

import com.springdemo.entity.Book;
import com.springdemo.entity.Category;

import java.util.List;

;

public interface BookService {

	List<Category> getAllCategories();

	Category getCategory(long id);

	List<Book> getAllBooks();

	Book save(Book book);

	Book update(Book book);

	Book get(long id);

	long getNextId();
}
