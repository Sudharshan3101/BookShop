package com.java.book;

import java.util.List;
import java.util.Scanner;

public class BookMain {
    static Scanner sc = new Scanner(System.in);
    static BookDetails bd = new BookDetails();

    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("OPTIONS");
            System.out.println("-------+++-------");
            System.out.println("1] ADD BOOKS");
            System.out.println("2] SHOW BOOKS");
            System.out.println("3] SEARCH BOOKS");
            System.out.println("4] DELETE BOOKS");
            System.out.println("5] UPDATE BOOKS");
            System.out.println("6] EXIT");
            System.out.println("-------***-------");
            System.out.println("ENTER YOUR CHOICE");

            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    try {
                        addBookMain();
                    } catch (BookException e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 2:
                    showBookMain();
                    break;
                case 3:
                    searchBookMain();
                    break;
                case 4:
                    deleteBookMain();
                    break;
                case 5:
                    try {
                        updateBookMain();
                    } catch (BookException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    return;
            }
        }while(choice != 6);
    }
    //update Book details
    public static void updateBookMain() throws BookException {
        Book book = new Book();

        System.out.println("Enter the Book No: ");
        book.setBookNo(sc.nextInt());

        System.out.println("Enter the Book Name: ");
        book.setBookName((sc.next()));

        System.out.println("Enter Book Varieties(E_BOOKS or PAPER_BOOKS): ");
        String bookVariety = sc.next();

        if (bookVariety.equals("E_BOOKS")) {
            book.setBookVariety(BookVariety.E_BOOKS);
        }
        if (bookVariety.equals("PAPER_BOOKS")) {
            book.setBookVariety(BookVariety.PAPER_BOOKS);
        }

        System.out.println("Enter Book Department: ");
        book.setBookDept(sc.next());

        System.out.println("Enter the Book Prize: ");
        book.setBookPrize(sc.nextDouble());
        System.out.println(bd.updateBookDetails(book));
    }

    //Delete book details
    public static void deleteBookMain(){
        int bookNo;
        System.out.println("Enter the Book No: ");
        bookNo = sc.nextInt();
        System.out.println(bd.deleteBookDetails(bookNo));
        }
    //Search Book details
    public static void searchBookMain(){
        int bookNo;
        System.out.println("Enter the Book No: ");
        bookNo = sc.nextInt();
        Book book = bd.searchBookDetails(bookNo);
        if(book != null){
            System.out.println(book);
        }else {
            System.out.println("***___Book Records Not Founded___***");
        }
    }
    public static void showBookMain(){
        List<Book> bookList = bd.showBookDetails();
        System.out.println("Book List is ");
        for (Book e:bookList) {
            System.out.println(e);
        }
    }
    public static void addBookMain() throws BookException {
        Book book = new Book();

        System.out.println("Enter the Book No: ");
        book.setBookNo(sc.nextInt());

        System.out.println("Enter the Book Name: ");
        book.setBookName((sc.next()));

        System.out.println("Enter Book Varieties(E_BOOKS or PAPER_BOOKS): ");
        String bookVariety = sc.next();

            if (bookVariety.equals("E_BOOKS")) {
                book.setBookVariety(BookVariety.E_BOOKS);
            }
            if (bookVariety.equals("PAPER_BOOKS")) {
                book.setBookVariety(BookVariety.PAPER_BOOKS);
            }

        System.out.println("Enter Book Department: ");
        book.setBookDept(sc.next());

        System.out.println("Enter the Book Prize: ");
        book.setBookPrize(sc.nextDouble());
        System.out.println(bd.addBookDetails(book));
    }
}
