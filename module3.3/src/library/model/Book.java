package library.model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean reserved = false;

    public Book( String title,String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    @Override
    public boolean equals(Object obj){

        Book temporary = (Book) obj;
        if(this.isbn != temporary.isbn){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return title +" "+ author +" "+ isbn;
    }

    public void toggleReserved(){
        reserved = !reserved;
    }

    public boolean getReserved(){
        return reserved;
    }

}
