package library.system;

import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;


public class Library {
    static List<Book> libraryBooks = new ArrayList<>();
    static List<LibraryMember> libraryMembers = new ArrayList<>();

    public static void addBook(Book book){
        libraryBooks.add(book);
    }
    public static void addMember(String name){
        libraryMembers.add(new LibraryMember(name));
    }

    public static void reserveBook(Book book, int memberId){
        LibraryMember temp = null;
        for(LibraryMember member : libraryMembers){
            if(member.getId() == memberId){
                temp = (LibraryMember) member;
            }
        }
        if(temp == null){
            return;
        }
        for(Book b : libraryBooks) {
            if(b.equals(book)) {
                book = b;
                break;
            }
        }
        if(book.getReserved()){
            return;
        }

        book.toggleReserved();
        temp.addBookToReserved(book);
       // System.out.println("toimii");
    }
    public static void cancelReservation(Book book, int memberId){
        LibraryMember temp = null;
        for(LibraryMember member : libraryMembers){
            if(member.getId() == memberId){
                temp = (LibraryMember) member;
            }
        }
        if(temp == null){
            return;
        }
        for(Book b : libraryBooks) {
            if(b.equals(book)) {
                book = b;
                break;
            }
        }
        if(!book.getReserved()){
            return;
        }
        if(!temp.getReservedBookList().contains(book)){
            return;
        }
        book.toggleReserved();
        temp.removeBookFromReserved(book);
    }



    public static void borrowBook(Book book, int memberId){
        LibraryMember temp = null;
        for(LibraryMember member : libraryMembers){
            if(member.getId() == memberId){
                temp = (LibraryMember) member;
            }
        }
        if(temp == null){
            return;
        }
        //List<Book> temp2 = temp.getReservedBookList();
        //boolean temp2contains = temp2.contains(book);
        if(book.getReserved() && !temp.getReservedBookList().contains(book)){
            return;
        }


        for(Book b : libraryBooks) {
            if(b.equals(book)) {
                libraryBooks.remove(book);
                temp.borrowBook(book);
                break;
            }
        }
    }
    public static void returnBook(Book book, int memberId){
        LibraryMember temp = null;
        for(LibraryMember member : libraryMembers){
            if(member.getId() == memberId){
                temp = (LibraryMember) member;
            }
        }
        if(temp == null){
            return;
        }

        for(Book b : temp.borrowedBooks) {
            if(b.equals(book)) {
                libraryBooks.add(book);
                temp.returnBook(book);
                cancelReservation(book,temp.getId());
                break;
            }
        }
    }

    public static void displayLibrarysBooks(){
        for(Book book : libraryBooks){
            System.out.println(book);
        }
    }

    public static void displayReservedBooks(){
        for(Book book : libraryBooks){
            if(book.getReserved()) {
                System.out.println(book);
            }
        }
    }


}
