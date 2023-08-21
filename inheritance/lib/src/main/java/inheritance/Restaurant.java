package inheritance;
public class Restaurant {
    private String Name;
    private int stars;
    private int price;
    private Review review;
    public Restaurant(String Name, int stars, int price) {
        this.Name=Name;
        this.stars=stars;
        this.price=price;
        this.review=null;
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
        if(this.review==null){
        this.review=review;
        this.stars= review.getStars();
    }}
}
