package cn.edu.ncu.eureka.library.books;

import java.time.LocalDate;
import java.util.Date;

public class Fairytale extends Book {
    public Fairytale(String name) {
        super(name);
    }

    public Fairytale(String name, String ISBN, String publisher, String author, double price) {
        super(name, ISBN, publisher, author, price);
    }

    @Override
    public double lossRate() {
        Date now = new Date();
        Date before = super.getDateCreated();
        int second = now.getSeconds() - before.getSeconds();
        double year = second * 100.0 / 365;
        return year / 10 * 0.01;
    }

    @Override
    public double currentPrice() {
        double current = (1 - lossRate()) * super.getPrice();
        super.setPrice(current);
        return current;
    }
}
