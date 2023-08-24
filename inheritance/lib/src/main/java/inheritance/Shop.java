package inheritance;

import java.util.ArrayList;

public class Shop extends AbsReview{
    private String description;
    private int dollarSigns;

    public Shop(String name, String description, int dollarSigns) {
        super(name);
        this.description = description;
        this.dollarSigns = dollarSigns;

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
