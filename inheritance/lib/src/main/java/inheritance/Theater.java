package inheritance;

import java.util.ArrayList;

public class Theater implements ReviewI{
    private ArrayList<String> movies;
    private String name;
    private ArrayList<Review> reviews;
 public Theater(String name) {
     this.name=name;
     this.movies= new ArrayList<>();
     this.reviews=new ArrayList<>();
 }

 public void addMovie(String newMovie) {
     movies.add(newMovie);
 }
 public void removeMovie(String movieToRemove) {
     movies.remove(movieToRemove);
 }
 public ArrayList getReviews(){
     return reviews;
 }

    @Override
    public String toString() {
        return "Theater{" +
                "movies=" + movies +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void addReview(Review review) {
            if(!reviews.contains(review))
                reviews.add(review);
        }
}
