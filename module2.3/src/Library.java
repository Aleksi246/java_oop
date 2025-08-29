import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void addUser(User user){
        users.add(user);
    }




    public void displayBooks(){
        for(Book book : books){
            System.out.printf("%-25s %-25s %-6d",book.getTitle(),book.getAuthor(),book.getYear());
            System.out.println("");
        }
    }
    public void findBooksByAuthor(String author){
        for(Book book : books){
            if(book.getAuthor().equals(author)){
                System.out.printf("%-25s %-25s %-6d",book.getTitle(),book.getAuthor(),book.getYear());
                System.out.println("");
            }
        }
    }
    public void borrowBook(String title, User user){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                books.remove(book);
                user.addBookToUser(book);
                break;
            }
        }
    }

    public void returnBook(Book book,User user){
        ArrayList<Book> lista = user.getBorrowedBooks();
        boolean userhasbook = false;
        for(Book b : lista){
            if(book.equals(b)){
                books.add(b);

                break;
            }
        }
        if(userhasbook) {
            user.getBorrowedBooks().remove(book);
        }
    }

    public boolean isBookAvailable(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating(){
        double laskuri = 0;
        double sum = 0;
        for(Book book : books){
            if(book.getRating() > 0) {
                laskuri++;
                sum += book.getRating();
            }

        }
        return sum/laskuri;
    }

    public Book getMostReviewedBook(){
        int mostReviews = 0;
        Book mostReviewed = null;
        for(Book book : books){
            int pituus = book.getReviews().size();
            if(pituus > mostReviews){
                mostReviews = pituus;
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }




}