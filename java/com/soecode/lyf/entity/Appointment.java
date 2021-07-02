package com.soecode.lyf.entity;

import java.util.Date;

/*
    本次代码全部供学习使用，教程原文地址https://blog.csdn.net/qq598535550/article/details/51703190。
 */
public class Appointment {
    private long bookID; //图书ID
    private long studentID; //学号
    private Date appointTime; //预约时间

    //多对一的复合属性
    private Book book; //图书实体

    public long getBookID() {
        return bookID;
    }

    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String toString(){
        return "Appointment[booID=" + bookID +",studentID="+ studentID +",appointTime="+appointTime+"]";
    }

}
