package com.java.book;

import java.util.ArrayList;
import java.util.List;

public class BookOperations {

    static List<Book> bookList;

    static {
        bookList = new ArrayList<Book>();
    }
    public String addBookOperations(Book book){
        bookList.add(book);
        return "Book Details Inserted...";
    }
    public List<Book> showBook(){
        return bookList;
    }
}
