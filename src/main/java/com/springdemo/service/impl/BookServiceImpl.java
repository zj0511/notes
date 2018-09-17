package com.springdemo.service.impl;

import com.springdemo.entity.Book;
import com.springdemo.entity.Category;
import com.springdemo.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

	private List<Category> categories;
	private List<Book> books;

	public BookServiceImpl() {
		super();
		categories = new ArrayList<>();
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Computing");
		Category category2 = new Category();
		category1.setId(2);
		category1.setName("Travel");
		Category category3 = new Category();
		category1.setId(3);
		category1.setName("Health");
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);

		books = new ArrayList<>();
		Book book1 = new Book();
		book1.setId(1L);
		book1.setIsbn("9780980839623");
		book1.setTitle("Servlet & JSP: A Tutorial");
		book1.setCategory(category1);
		book1.setAuthor("Budi Kurniawan");
		Book book2 = new Book();
		book2.setId(2L);
		book2.setIsbn("9780980839630");
		book2.setTitle("C#: A Beginner's Tutprial");
		book2.setCategory(category1);
		book2.setAuthor("Jayden Ky");
		books.add(book1);
		books.add(book2);
	}

	@Override
	public List<Category> getAllCategories() {
		return categories;
	}

	@Override
	public Category getCategory(long id) {
		for (Category category : categories) {
			if (id == category.getId()) {
				return category;
			}
		}
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		return books;
	}

	@Override
	public Book save(Book book) {
		book.setId(getNextId());
		books.add(book);
		return book;
	}

	@Override
	public Book update(Book book) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == book.getId()) {
				books.set(i, book);
			}
		}
		return book;
	}

	@Override
	public Book get(long id) {
		for (Book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	@Override
	public long getNextId() {
		// needs to be locked
		long id = 0L;
		for (Book book : books) {
			long BookId = book.getId();
			if (BookId > id) {
				id = BookId;
			}
		}
		return id + 1;
	}

}
