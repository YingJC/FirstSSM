package com.soecode.lyf.entity;

public class Book {
    private long bookID; //图书ID
    private  String name; //图书名称
    private  int number; //馆藏数量
    public long getBookID() {
        return bookID;
    }

    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
