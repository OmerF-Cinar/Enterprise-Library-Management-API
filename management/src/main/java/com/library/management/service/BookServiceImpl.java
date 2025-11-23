package com.library.management.service;

import com.library.management.dao.BookDAO;
import com.library.management.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private BookDAO bookDAO;

    @Autowired
    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional
    public Book save(Book theBook) {
        return bookDAO.save(theBook);
    }

    @Override
    public Book findById(int i) {
        return bookDAO.findById(i);
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return bookDAO.findByAuthor(author);
    }

    @Override
    @Transactional
    public void delete(int id) {
        bookDAO.delete(id);
    }
}
