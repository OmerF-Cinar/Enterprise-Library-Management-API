package com.library.management.dao;

import com.library.management.entity.Book;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO{

    //entitymanager
    private EntityManager entityManager;

    //injecting entitymanager through constructor
    @Autowired
    public BookDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Book save(Book book) {
        Book theBook = entityManager.merge(book);

        return theBook;
    }

    @Override
    public Book findById(int i) {
        Book myBook = entityManager.find(Book.class, i);
        return myBook;
    }

    @Override
    public List<Book> findAll() {
        //create query
        TypedQuery<Book> query = entityManager.createQuery("FROM Book ORDER BY author DESC", Book.class);

        //return query List
        return query.getResultList();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        //create the query
        TypedQuery<Book> query = entityManager.createQuery("FROM Book WHERE author=:theData", Book.class);

        //Set the query params
        query.setParameter("theData", author);

        //return the result as query
        return query.getResultList();
    }

    @Override
    @Transactional
    public void delete(int id) {
        //retrieving the student first
        Book tempBook = entityManager.find(Book.class, id);

        //delete the student
        entityManager.remove(tempBook);
    }
}
