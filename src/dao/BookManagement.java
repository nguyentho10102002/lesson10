package dao;

import model.Book;
import model.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    Scanner input = new Scanner (System.in);
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }
    public void updateBook(Book updatedBook) {
        for (Book book : books) {
            if (book.getID() == updatedBook.getID()) {
                System.out.println("Choose is: ");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        System.out.println("Enter New Producer :");
                        book.setProducer(input.nextLine());
                        System.out.println("Successful Update !!");
                        break;
                    case 2:
                        System.out.println("Enter New Author : ");
                        book.setAuthor(input.nextLine());
                        System.out.println("Successful Update !!");
                        break;
                    case 3:
                        System.out.println("Enter releaseNumber : ");
                        book.setReleaseNumber(input.nextInt());
                        System.out.println("Successful Update !!");
                        break;
                    case 4:
                        System.out.println("Enter Paper : ");
                        book.setPage(input.nextInt());
                        System.out.println("Successful Update !!");
                        break;
                    default:
                        System.out.println("Not Found !!");
                }
            }
        }
    }
    public void addBook(Book book)
    {
     books.add(book);
    }
    public void deleteBook(Book book){
        books.remove(book);
    }

    public Book searchByID(int ID) {
        for (Book book: books) {
            if (book.getID() == ID) {
                return book;
            }
        }
        return null;
    }
}


