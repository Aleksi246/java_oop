import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private int year;

    private ArrayList<String> reviews = new ArrayList<>();

    private double rating;




    public Book(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public double getRating(){
        return rating;
    }
    public ArrayList<String> getReviews(){
        return reviews;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public void addReview(String review){
        reviews.add(review);
    }

}
