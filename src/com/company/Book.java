package com.company;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return name + ", " + author.toString() + ", " + year;
    }

    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (getClass() != a.getClass()) return false;
        Book book = (Book) a;
        return name.equals(book.name) && author.equals(book.author) && year == book.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
