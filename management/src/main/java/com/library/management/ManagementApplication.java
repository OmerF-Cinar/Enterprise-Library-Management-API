package com.library.management;

import com.github.javafaker.Faker;
import com.library.management.dao.BookDAO;
import com.library.management.entity.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

//    @Bean
//    public CommandLineRunner commandLineRunner (BookDAO bookDAO) {
//
//        return runner -> {
//            delete(bookDAO);
//        };
//    }
//
//    private void createBook(BookDAO bookDAO) {
//
//        //Creating the Book Object
//        System.out.println("Creating a new book object.");
//        for(int i = 0; i<10; i++) {
//            Faker faker = new Faker();
//            String name = faker.book().title();
//            String author = faker.book().author();
//            String isbn = "123";
//            Book tempBook = new Book(name, author, isbn);
//
//            //Saving the Book object
//            System.out.println("Saving the Book object.");
//            bookDAO.save(tempBook);
//            System.out.println(tempBook.getId());
//
//            //Reading the Book object
//            System.out.println(tempBook.toString());
//        }
//    }
//
//    private void retrieveBooks(BookDAO bookDAO) {
//        //get a list of books
//        List<Book> booklist = bookDAO.findAll();
//
//        //display the list of books
//        for (Book tempBook : booklist) {
//            System.out.println(tempBook);
//        }
//    }
//
//    private void findByAuthor(BookDAO bookDAO) {
//
//        //getting a list of students
//        List<Book> bookList = bookDAO.findByAuthor("Bram Stoker");
//
//        for (Book tempBook : bookList) {
//            System.out.println(tempBook);
//        }
//    }
//
//    private void update(BookDAO bookDAO) {
//        //retrieve the book based on id as primary key
//        int bookId = 6;
//        System.out.println("Retrieved the book with the UNIQUE ID of : " +bookId);
//        Book tempBook = bookDAO.findById(bookId);
//
//        //change the author to "test" and update
//        tempBook.setAuthor("Test");
//        bookDAO.update(tempBook);
//
//        //display the updated book
//        System.out.println("Updated book : " + tempBook);
//    }
//
//    private void delete(BookDAO bookDAO) {
//        int id = 3;
//        System.out.println("Deleting the book with the ID of " + id);
//        bookDAO.delete(id);
//    }
}
