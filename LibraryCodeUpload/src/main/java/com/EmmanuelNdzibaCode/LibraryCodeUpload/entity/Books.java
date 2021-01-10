package com.EmmanuelNdzibaCode.LibraryCodeUpload.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_table")
public class Books {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int ISBN;
    private String title;
    private String author;
    private String publisher;
    private int pages;
    private String description;

    public Books() {
    }


    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
