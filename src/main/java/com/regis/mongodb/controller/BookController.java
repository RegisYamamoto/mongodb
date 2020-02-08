package com.regis.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.regis.mongodb.model.Book;
import com.regis.mongodb.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping(value = "/addBook")
	public String saveBook(@RequestBody Book book) {
		bookService.saveBook(book);
		return "Added book with id: " + book.getId();
	}
	
	@GetMapping(value = "/findAllBooks")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}
	
	@GetMapping(value = "/findAllBooks/{id}")
	public Optional<Book> getBook(@PathVariable int id) {
		return bookService.getBook(id);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		return "book deleted with id:" + id;
	}
	
}