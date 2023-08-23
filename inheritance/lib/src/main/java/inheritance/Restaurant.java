package inheritance;
import java.util.ArrayList;
public class Restaurant {
    private String Name;
    private int stars;
    private double price;
    private ArrayList<Review> reviews;
    public Restaurant(String Name, double price) {
        this.Name=Name;
        this.stars=0;
        this.price=price;
        this.reviews=new ArrayList<>();
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "Name='" + Name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                '}';
    }
    public void addReview(Review review) {
        if(!reviews.contains(review))
            {
        reviews.add(review);  //associate the new review with the Restaurant reviews list
        updateStars(); // update the stars of the Restaurant
    }
    }
    public void updateStars() {
            int avg=0;
            for(Review review:reviews){
                avg+=review.getStars();
        }
            avg/=reviews.size();
            stars=avg;
    }
}
