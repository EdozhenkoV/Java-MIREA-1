package com.company;

public class Book {
    private String name;
    private int pages;
    private int year;

    public Book() {}
    public Book(String name,int pages,int year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public void setName() { this.name = name; }
    public String getName() { return name; }
    public void setPages() { this.pages = pages; }
    public int getPage() { return pages; }
    public void setYear() { this.year = year; }
    public int getYear() { return year; }

    public String toString() { return "Название книги: "+this.name+" Количество страниц: "+this.pages+" Год издания: "+this.year; }
}
