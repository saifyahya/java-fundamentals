package inheritance;

import java.util.ArrayList;

abstract public class AbsReview {
    protected String name;  // common field between classes
    protected ArrayList<Review> reviews;    // common field between classes
    public AbsReview() {
    }

    public AbsReview(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }
    abstract public void addReview(Review review);
}
