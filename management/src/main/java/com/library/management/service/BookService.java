package com.library.management.service;

import com.library.management.entity.Book;

import java.util.List;

public interface BookService {

    Book save(Book theBook);

    Book findById(int i);

    List<Book> findAll();

    List<Book> findByAuthor(String author);

    void delete(int id);

}
