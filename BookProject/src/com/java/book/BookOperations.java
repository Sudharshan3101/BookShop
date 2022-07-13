package com.java.book;

import java.util.ArrayList;
import java.util.List;

public class BookOperations {

    static List<Book> bookList;

    static {
        bookList = new ArrayList<Book>();
    }
    //update Book
    public String updateBookOperations(Book bookNew){
        Book bookFound = searchBookOperations(bookNew.getBookNo());
        if(bookFound != null){
            for (Book book:bookList) {
                if(book.getBookNo()==bookNew.getBookNo()){
                    book.setBookName(bookNew.getBookName());
                    book.setBookVariety(bookNew.getBookVariety());
                    book.setBookDept(bookNew.getBookDept());
                    book.setBookPrize(bookNew.getBookPrize());
                    break;
                }
            }
            return "Book Records Updated...";
        }
        return "Book Record Not found...";
    }

    //Delete Book
    public String deleteBookOperations(int bookNo){
        Book bookFound = searchBookOperations(bookNo);
        if(bookFound != null){
            bookList.remove(bookFound);
        }
        return "Book Details Not Found...";
    }

    //Search Book
    public Book searchBookOperations(int bookNo){
        Book bookFound = null;
        for (Book book:bookList) {
            if(book.getBookNo() == bookNo){
                bookFound = book;
            }
        }
        return bookFound;
    }
    //Add Book
    public String addBookOperations(Book book){
        bookList.add(book);
        return "Book Details Inserted...";
    }
    //Show Book
    public List<Book> showBook(){
        return bookList;
    }
}
