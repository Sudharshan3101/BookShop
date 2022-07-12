package com.java.book;

public class Book {
private int bookNo;
private String bookName;
private BookVariety bookVariety;
private String bookDept;
private double bookPrize;

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BookVariety getBookVariety() {
        return bookVariety;
    }

    public void setBookVariety(BookVariety bookVariety) {
        this.bookVariety = bookVariety;
    }

    public String getBookDept() {
        return bookDept;
    }

    public void setBookDept(String bookDept) {
        this.bookDept = bookDept;
    }

    public double getBookPrize() {
        return bookPrize;
    }

    public void setBookPrize(double bookPrize) {
        this.bookPrize = bookPrize;
    }

    //default constructor
    public Book(){

    }
    public Book(int bookNo, String bookName, BookVariety bookVariety, String bookDept, double bookPrize) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.bookVariety = bookVariety;
        this.bookDept = bookDept;
        this.bookPrize = bookPrize;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNo=" + bookNo +
                ", bookName='" + bookName + '\'' +
                ", bookVariety=" + bookVariety +
                ", bookDept='" + bookDept + '\'' +
                ", bookPrize=" + bookPrize +
                '}';
    }
}
