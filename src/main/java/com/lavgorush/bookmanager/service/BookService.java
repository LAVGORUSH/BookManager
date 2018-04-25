package com.lavgorush.bookmanager.service;

import com.lavgorush.bookmanager.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    Book getBookById(int id);

    List<Book> listBook();
}
