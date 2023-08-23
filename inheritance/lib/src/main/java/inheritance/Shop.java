package inheritance;

import java.util.ArrayList;

public class Shop implements ReviewI{
    private String name;
    private String description;
    private int dollarSigns;
    private ArrayList<Review> reviews;


    public Shop(String name, String description, int dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
        this.reviews=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollarSigns=" + dollarSigns +
                '}';
    }


    @Override
    public void addReview(Review review) {
        if(!reviews.contains(review))
            reviews.add(review);
    }
}
