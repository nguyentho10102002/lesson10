package main;

import dao.BookManagement;
import dao.MagazineManagement;
import dao.NewspaperManagement;
import model.Book;
import model.Magazine;
import model.Newspaper;

import java.util.*;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BookManagement BookManagement = new BookManagement();
        List<Book> bookList = BookManagement.getBooks();
        MagazineManagement magazineManagement = new MagazineManagement();
        List<Magazine> magazineList = magazineManagement.getList();
        NewspaperManagement NewspaperManagement = new NewspaperManagement();
        List<Newspaper> newspaperList = NewspaperManagement.getList();
        System.out.println("What book, newspaper or magazine do you want?");
        System.out.println("1. Book ");
        System.out.println("2. NewPaper");
        System.out.println("3. Magazine");
        int choose = Integer.parseInt(sc.nextLine());
        if (choose == 1) {
            showMenuBook();
            System.out.println("Welcome to the world of books");
            while (true) {
                System.out.println("Number :");
                int number = sc.nextInt();
                switch (choose) {
                    case 1:
                        Book book = inputInfo();
                        BookManagement.addBook(book);
                        break;
                    case 2:
                        System.out.println("Enter ID Book : ");
                        int inputID = sc.nextInt();
                        Book book1 = BookManagement.searchByID(inputID);
                        if (book1 == null) {
                            System.out.println("Not Found");
                            break;
                        } else {
                            BookManagement.deleteBook(book1);
                            System.out.println("Successfully deleted !!! ");
                        }
                        break;
                    case 3:
                        System.out.println("Enter New ID Book : ");
                        int newID = sc.nextInt();
                        Book book2 = BookManagement.searchByID(newID);
                        if (book2 == null) {
                            System.out.println("Not Found");
                            break;
                        } else {
                            BookManagement.updateBook(book2);
                            System.out.println("Successfully Updates !!! ");
                        }
                        break;
                    case 4:
                        for (Book book3 : bookList) {
                            show(book3);
                        }
                        break;
                    case 5:
                        Collections.sort(bookList, new Comparator<Book>() {
                            @Override
                            public int compare(Book o1, Book o2) {
                                if (o1.getPage() > o2.getPage()) {
                                    return -1;
                                } else if (o1.getPage() < o2.getPage()) {
                                    return 1;
                                } else {
                                    return 0;
                                }
                            }
                        });
                        for (Book book3 : bookList) {
                            show(book3);
                        }
                        break;
                    case 6:
                        showMenuBook();
                        break;
                    case 7:
                        System.out.println("GoodBye~~~");
                        break;
                    default:
                        System.out.println("Enter Again");
                }
            }
        } else {
            if (choose == 2) {
                showMenuMagazine();
                System.out.println("Welcome to the world of Magazine");
                while (true) {
                    System.out.println("Number:");
                    int Number = sc.nextInt();
                    switch (Number) {
                        case 1:
                            Magazine magazine = inputInfor();
                            MagazineManagement.addMagazine(magazine);
                            break;
                        case 2:
                            System.out.println("Enter ID Magazine : ");
                            int inputID = sc.nextInt();
                            Magazine magazine1 = MagazineManagement.searchByID(inputID);
                            if (magazine1 == null) {
                                System.out.println("Not Found");
                                break;
                            } else {
                                MagazineManagement.deleteMagazine(magazine1);
                                System.out.println("Successfully deleted !!! ");
                            }
                            break;
                        case 3:
                            System.out.println("Enter New ID Magazine : ");
                            int newID = sc.nextInt();
                            Magazine magazine2 = MagazineManagement.searchByID(newID);
                            if (magazine2 == null) {
                                System.out.println("Not Found");
                                break;
                            } else {
                                MagazineManagement.updateMagazine(magazine2);
                                System.out.println("Successfully Updates !!! ");
                            }
                            break;
                        case 4:
                            for (Magazine magazine3 : magazineList) {
                                shows(magazine3);
                            }
                            break;
                        case 5:
                            showMenuMagazine();
                            break;
                        case 6:
                            System.out.println("GoodBye~~~");
                            break;
                        default:
                            System.out.println("Enter Again");
                    }
                }
            }
            else {
                if (choose == 3 ) {
                    showMenuNewsPaper();
                    System.out.println("Welcome to the world of NewPaper");
                    while (true) {
                        System.out.println(" choose1:");
                        int choose1 = sc.nextInt();
                        switch (choose1) {
                            case 1:
                                Newspaper newspaper = inputInfoer();
                                NewspaperManagement.addNewspaper(newspaper);
                                break;
                            case 2:
                                System.out.println("Enter ID News Paper : ");
                                int ID = sc.nextInt();
                                Newspaper newspaper1 = NewspaperManagement.searchByID(ID);
                                if (newspaper1 == null) {
                                    System.out.println("Not Found");
                                    break;
                                } else {
                                   NewspaperManagement.deleteNewspaper(newspaper1);
                                    System.out.println("Successfully deleted !!! ");
                                }
                                break;
                            case 3:
                                System.out.println("Enter New ID NewsPaper : ");
                                int Id = sc.nextInt();
                                Newspaper newspaper2 = NewspaperManagement.searchByID(Id);
                                if (newspaper2 == null) {
                                    System.out.println("Not Found");
                                    break;
                                } else {
                                    NewspaperManagement.updateNewspaper(newspaper2);
                                    System.out.println("Successfully Updates !!! ");
                                }
                                break;
                            case 4:
                                for (Newspaper newspaper3 : newspaperList) {
                                    showss(newspaper3);
                                }
                                break;
                            case 5:
                                showMenuNewsPaper();
                                break;
                            case 6:
                                System.out.println("GoodBye~~~");
                                break;
                            default:
                                System.out.println("Enter Again");
                        }
                    }
                }
            }
        }
    }

    public static void showMenuBook() {
        System.out.println("1. Add Book :");
        System.out.println("2. Delete Book :");
        System.out.println("3. Update Book :");
        System.out.println("4.Display all");
        System.out.println("5.Sort Book");
        System.out.println("6.Show Menu");
        System.out.println("7. Exit Program:");
    }

    public static Book inputInfo() {
        System.out.println("Enter ID: ");
        int ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Producer: ");
        String producer = sc.nextLine();
        System.out.println("Enter Release Number: ");
        int releaseNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Author: ");
        String author = sc.nextLine();
        System.out.println("Enter Page: ");
        int page = sc.nextInt();
        return new Book(ID, producer, releaseNumber, author, page);
    }

    public static void show(Book book) {
        System.out.println(book.toString());
    }

    public static void showMenuMagazine() {
        System.out.println("1. Add Magazine :");
        System.out.println("2. Delete Magazine :");
        System.out.println("3. Update Magazine :");
        System.out.println("4. Display all");
        System.out.println("5. Show Menu");
        System.out.println("6. Exit Program:");
    }

    public static Magazine inputInfor() {
        System.out.println("Enter ID: ");
        int ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Producer: ");
        String producer = sc.nextLine();
        System.out.println("Enter Release Number: ");
        int releaseNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Release Month : ");
        String releaseMonth = sc.nextLine();
        System.out.println("Enter Issue Number : ");
        int issueNumber = sc.nextInt();
        return new Magazine(ID, producer, releaseNumber, releaseMonth, issueNumber);
    }

    public static void shows(Magazine magazine) {
        System.out.println(magazine.toString());
    }


    public static void showMenuNewsPaper()
    {
        System.out.println("1. Add NewsPaper :");
        System.out.println("2. Delete NewsPaper :");
        System.out.println("3. Update NewsPaper :");
        System.out.println("4. Display all");
        System.out.println("5. Show Menu");
        System.out.println("6. Exit Program:");
    }
    public static Newspaper inputInfoer(){
        System.out.println("Enter ID: ");
        int ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Producer: ");
        String producer = sc.nextLine();
        System.out.println("Enter Release Number: ");
        int releaseNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Release Date : ");
        String releaseDate = sc.nextLine();
        return new Newspaper( ID , producer, releaseNumber, releaseDate );
    }
    public static void showss(Newspaper newspaper){
        System.out.println(newspaper.toString());
    }
}

