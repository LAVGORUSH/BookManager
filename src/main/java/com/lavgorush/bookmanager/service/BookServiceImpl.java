package com.lavgorush.bookmanager.service;

import com.lavgorush.bookmanager.dao.BookDao;
import com.lavgorush.bookmanager.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void addBook(Book book) {
        this.bookDao.addBook(book);
    }

    public void updateBook(Book book) {
        this.bookDao.updateBook(book);
    }

    public void removeBook(int id) {
        this.bookDao.removeBook(id);
    }

    public Book getBookById(int id) {
        return this.bookDao.getBookById(id);
    }

    public List<Book> listBook() {
        return this.bookDao.listBook();
    }
}
