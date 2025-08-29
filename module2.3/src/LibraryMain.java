public class LibraryMain {
    public static void main(String[] args){


        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("Animal Farm", "George Orwell", 1945);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book5 = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book book6 = new Book("Moby-Dick", "Herman Melville", 1851);

        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);
        User user3 = new User("Charlie", 22);
        User user4 = new User("Diana", 28);
        User user5 = new User("Ethan", 35);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);
        library.addUser(user4);
        library.addUser(user5);

        System.out.println("");

        library.displayBooks();
        System.out.println("");

        library.findBooksByAuthor("George Orwell");
        System.out.println("");

        System.out.println("1984 is available: "+ library.isBookAvailable("1984"));

        library.borrowBook("1984",user1);

        System.out.println("1984 is available: "+ library.isBookAvailable("1984"));

        library.returnBook(book1,user1);

        book1.setRating(4);
        book2.setRating(3);

        book1.addReview("meh");
        book1.addReview("meh");
        book1.addReview("meh");
        book2.addReview("meh");

        System.out.println("");

        System.out.println(library.getAverageBookRating());
        System.out.println("");

        System.out.println(library.getMostReviewedBook().getTitle());
        System.out.println("");

        library.borrowBook("1984",user1);

        library.displayBooks();
        System.out.println("");

        System.out.println(library.getAverageBookRating());
        System.out.println("");

        System.out.println(library.getMostReviewedBook().getTitle());







    }
}
