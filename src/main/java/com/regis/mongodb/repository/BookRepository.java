package com.regis.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.regis.mongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}