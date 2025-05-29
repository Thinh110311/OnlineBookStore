
package com.bookstore.model;

public class BookStoreBook {
    private int id;
    private String title;
    private String author;
    private String genre;
    private int publishedYear;
    private double price;
    private int stock;

    public BookStoreBook(int id, String title, String author, String genre, int publishedYear, double price, int stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishedYear = publishedYear;
        this.price = price;
        this.stock = stock;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getPublishedYear() { return publishedYear; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
}
