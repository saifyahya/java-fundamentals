package inheritance;
import java.util.ArrayList;
public class Restaurant extends  AbsReview{
    private int stars;
    private double price;
    public Restaurant(String name, double price) {
        super((name));
        this.stars=0;
        this.price=price;

    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "Name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                '}';
    }
    @Override
    public void addReview(Review review) {
        if(!reviews.contains(review))
            reviews.add(review);  //associate the new review with the Restaurant reviews list
        updateStars(); // update the stars of the Restaurant
    }
    public void updateStars() {
            int avg=0;
            for(Review review:reviews){
                avg+=review.stars;
        }
            avg/=reviews.size();
            stars=avg;
    }
}
