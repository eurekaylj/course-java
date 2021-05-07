package cn.edu.ncu.eureka.library.books;

import java.time.LocalDate;
import java.util.Date;

public abstract class Book {
    private String name;
    private String ISBN;
    private String publisher;
    private String author;
    private double price;
    private boolean accessibility;
    private Date dateCreated;

    public Book(String name) {
        this(name, null, null, null, 0.0);
    }

    public Book(String name, String ISBN, String publisher, String author, double price) {
        this.name = name;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.dateCreated = new Date();
        this.accessibility = true;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAccessibility() {
        return accessibility;
    }

    public void setAccessibility(boolean borrow) {
        this.accessibility = borrow;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    protected double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author='" + author + '\'' +
                String.format(", price= %6.2f", price) +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public abstract double lossRate();

    public abstract double currentPrice();
}
