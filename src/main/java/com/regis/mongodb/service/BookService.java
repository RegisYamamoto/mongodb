package com.regis.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regis.mongodb.model.Book;
import com.regis.mongodb.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public String saveBook(Book book) {
		bookRepository.save(book);
		return "Added book with id: " + book.getId();
	}
	
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	public Optional<Book> getBook(int id) {
		return bookRepository.findById(id);
	}
	
	public String deleteBook(int id) {
		bookRepository.deleteById(id);
		return "book deleted with id:" + id;
	}
	
}