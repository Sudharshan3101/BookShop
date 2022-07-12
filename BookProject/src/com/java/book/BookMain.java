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
            System.out.println("6] EXIT");
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("-------***-------");
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
                case 6:
                    return;
            }
        }while(choice != 6);
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
