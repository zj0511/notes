package com.springdemo.controller;

import com.springdemo.entity.Book;
import com.springdemo.entity.Category;
import com.springdemo.service.BookService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookController {
	
	private static final Log logger = LogFactory.getLog(BookController.class);
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/book_input",method={RequestMethod.POST,RequestMethod.GET})
	public String inputBook(Model model) {
		logger.info("inputBook called");
		List<Category> categories = bookService.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("book", new Book());
		return "BookAddForm";
	}
	
	@RequestMapping(value="/book_edit/{id}")
	public String editBook( Model model, @PathVariable long id){
		logger.info("editBook called");
		List<Category> categories = bookService.getAllCategories();
		model.addAttribute("categories", categories);
		Book book = bookService.get(id);
		model.addAttribute("book", book);
		return "BookEditForm";
	}
	
	@RequestMapping(value="/book_save")
	public String saveBook(@ModelAttribute Book book){
		logger.info("saveBook called");
		Category category = bookService.getCategory(book.getCategory().getId());
		book.setCategory(category);
		bookService.save(book);
		return "redirect:/book_list";
	}
	
	@RequestMapping(value="/book_update")
	public String updateBook(@ModelAttribute Book book){
		logger.info("updateBook called");
		Category category = bookService.getCategory(book.getCategory().getId());
		book.setCategory(category);
		bookService.update(book);
		return "redirect:/book_list";
	}
	
	@RequestMapping(value="/book_list")
	public String listBooks(Model model){
		logger.info("listBooks called");
		List<Book> books = bookService.getAllBooks();
		model.addAttribute("books", books);
		return "BookList";
	}
}
