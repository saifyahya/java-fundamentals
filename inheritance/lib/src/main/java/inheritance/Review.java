package inheritance;

public class Review{
    private String body;
    private String author;
    private int stars;
    private String movie;   // this field when reviewing a movie in Theater class
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
    public int getStars(){
        return stars;
    }
    public String getBody(){
        return body;
    }
    public void setBody(String body){
        this.body=body;
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
