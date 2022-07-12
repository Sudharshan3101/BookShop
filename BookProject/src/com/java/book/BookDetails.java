package com.java.book;

import java.util.List;

public class BookDetails {

    static StringBuilder sb = new StringBuilder();
    static BookOperations bds = new BookOperations();

    public List<Book> showBookDetails() {
       return bds.showBook();
   }
    public String addBookDetails(Book book) throws BookException {
        if(isValid(book) == true) {
            return bds.addBookOperations(book);
        }
        return "";
    }
    public boolean isValid(Book book) throws BookException {
        boolean flag = true;
        if(book.getBookNo() <= 0) {
            sb.append("Book No cannot be Zero or Negative...\r\n");
            flag = false;
        }
        if(book.getBookName().length() < 5) {
            sb.append("Book Name Contains Minimum 5 characters...\r\n");
            flag = false;
        }
        if(book.getBookDept().length() < 5){
            sb.append("Book Department contains Minimum 5 Charcater...\r\n ");
            flag = false;
        }
        if(book.getBookPrize() < 65 || book.getBookPrize() > 1000){
            sb.append("Book Prize must between 65 and 1000...\r\n");
            flag = false;
        }
        if(flag == false){
            throw new BookException(sb.toString());
        }
        return flag;
        //Goto 7th line and write then
    }
}
