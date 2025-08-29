import java.util.ArrayList;

public class User {
    private String name;
    private int age;

    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void addBookToUser(Book book){
        borrowedBooks.add(book);
    }
    public void removeBookFromUser(Book book){
        borrowedBooks.remove(book);
    }
    public ArrayList<Book> getBorrowedBooks(){
        return borrowedBooks;
    }



}
