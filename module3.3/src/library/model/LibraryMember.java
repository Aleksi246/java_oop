package library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    static int count = 1;

    public List<Book> borrowedBooks = new ArrayList<>();

    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name){
        this.name = name;
        this.memberId = count;
        count++;
    }

    public int getId(){
        return memberId;
    }
    public int getCount(){
        return count;
    }




    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }



}
