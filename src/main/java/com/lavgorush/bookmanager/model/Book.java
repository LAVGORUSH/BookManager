package com.lavgorush.bookmanager.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKS")
public class Book {

    private int id;
    private int price;
    private String title;
    private String author;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
