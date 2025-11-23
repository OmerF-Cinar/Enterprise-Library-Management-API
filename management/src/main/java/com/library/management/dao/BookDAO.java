package com.library.management.dao;

import com.library.management.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDAO{

    Book save(Book theBook);

    Book findById(int i);

    List<Book> findAll();

    List<Book> findByAuthor(String author);

    void delete(int id);
}
