package com.library.management.rest;

import com.library.management.entity.Book;
import com.library.management.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {

    private BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public Book addBook(Book theBook) {
        theBook.setId(0);
        return bookService.save(theBook);
    }

    @GetMapping("/books/{i}")
    public Book findById(@PathVariable  int i) {

        Book book = bookService.findById(i);

        if(book == null) {
            throw new RuntimeException("That book could not be found");
        }

        return book;
    }

    @GetMapping("/books")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/books/author/{author}")
    public List<Book> findByAuthor(@PathVariable  String author) {
        //WORK IN PROGRESS

        List<Book> books = bookService.findByAuthor(author);

        return books;
    }

    @DeleteMapping("/books/{id}")
    public void delete(int id) {

        Book book = bookService.findById(id);

        if(book == null) {
            throw new RuntimeException("That book could not be found.");
        }

        bookService.delete(id);
        System.out.println("Book with the ID of " + id + " had been deleted.");
    }

}
