package inheritance;

public class Review{
    private String body;
    private String author;
    private int stars;
   Restaurant restaurant;  // to show that review is for this restaurant
    public Review(String body, String author, int stars,Restaurant restaurant) {
this.stars=stars;
this.body=body;
this.author=author;
this.restaurant=restaurant;
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
                ", restaurant=" + restaurant +
                '}';
    }
}
