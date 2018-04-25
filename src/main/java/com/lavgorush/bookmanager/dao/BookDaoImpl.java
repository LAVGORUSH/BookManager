package com.lavgorush.bookmanager.dao;

import com.lavgorush.bookmanager.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@Repository
public class BookDaoImpl implements BookDao {
    private final Logger log = getLogger(BookDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(book);
        log.info("Book successfully saved. Book details: {}", book);
    }

    public void updateBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.update(book);
        log.info("Book successfully update. Book details: {}", book);

    }

    public void removeBook(int id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.load(Book.class, id);
        if (book != null) {
            session.delete(book);
        }
        log.info("Book successfully delete. Book details: {}", book);

    }

    public Book getBookById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.load(Book.class, id);
        log.info("Book successfully load. Book details: {}", book);
        return book;
    }

    @SuppressWarnings("unchecked")
    public List<Book> listBook() {
        Session session = sessionFactory.getCurrentSession();
        List<Book> bookList = session.createQuery("from Book").list();

        for (Book book : bookList) {
            log.info("Book successfully load. Book details: {}", book);
        }
        return bookList;
    }
}
