package library;

import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {
    public static void main(String[] args){

        Library.addBook(new Book("1984", "George Orwell", "9780451524935"));
        Library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        Library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        Library.addBook(new Book("Pride and Prejudice", "Jane Austen", "9781503290563"));
        Library.addBook(new Book("Moby-Dick", "Herman Melville", "9781503280786"));
        Library.addBook(new Book("Brave New World", "Aldous Huxley", "9780060850524"));

        Library.addMember("Alice");
        Library.addMember("Bob");
        Library.addMember("Charlie");
        Library.addMember("Diana");
        Library.addMember("Ethan");
        Library.addMember("Fiona");

        Library.displayLibrarysBooks();
        System.out.println("");
        Library.borrowBook(new Book("1984", "George Orwell", "9780451524935"),2);
        Library.borrowBook(new Book("Brave New World", "Aldous Huxley", "9780060850524"),1);
        Library.borrowBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"),1);
        Library.borrowBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"),1);

        Library.displayLibrarysBooks();
        System.out.println("");
        Library.returnBook(new Book("1984", "George Orwell", "9780451524935"),1);
        //Library.returnBook(new Book("1984", "George Orwell", "9780451524935"),2);
        Library.returnBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"),1);
        Library.displayLibrarysBooks();
    }

}
