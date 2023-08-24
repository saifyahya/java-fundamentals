package inheritance;

public class Review{
    protected String body;
    protected String author;
    protected int stars;
    protected String movie;   // this field when reviewing a movie in Theater class
    public Review(String body, String author, int stars) {
this.stars=stars;
this.body=body;
this.author=author;
    }
    public Review(String body, String author, int stars,String movie) {   // constructor for Theater class
        this.stars=stars;
        this.body=body;
        this.author=author;
        this.movie=movie;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                ", " +
                '}';
    }
}
