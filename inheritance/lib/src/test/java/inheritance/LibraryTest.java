/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void  restaurantConstructor(){    // test creating instance of Restaurant class and toString() method
        Restaurant res = new Restaurant("PizzaHut",15);
        String actualResult= res.toString();
        String expectedResult = "Restaurant{" +
                "Name='" + "PizzaHut" + '\'' +
                ", stars=" + 0 +
                ", price=" + 15.0 +
                '}';
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test void reviewConstructor () {       // test creating instance of Review class and toString() method
        Restaurant res = new Restaurant("Burrgurize",15);
        Review rev = new Review("nice restaurant","saif",5,res);
        String result ="Review{" +
                "body='" + "nice restaurant" + '\'' +
                ", author='" + "saif" + '\'' +
                ", stars=" + 5 +
                ", restaurant=" + res +
                '}';
        Assertions.assertEquals(result,rev.toString());
    }
    @Test void addReview () {    // test  the association is created between the Restaurant and the Review
        Restaurant res = new Restaurant("PizzaHut",15);
        Review rev = new Review("nice restaurant","saif",5,res);
        Review rev1 = new Review("nice restaurant","saif",4,res);

        res.addReview(rev);
        String result ="Restaurant{" +
                "Name='" + "PizzaHut" + '\'' +
                ", stars=" + 5 +
                ", price=" + 15.0 +
                '}';
        Assertions.assertEquals(result,res.toString());
        res.addReview(rev);  // trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update
        Assertions.assertEquals(result,res.toString());

    }
    @Test void addReviewRepeated () {  // test associating different reviews with the restaurant and updating the stars
        Restaurant res = new Restaurant("PizzaHut",15);
        Review rev1 = new Review("nice restaurant","saif",5,res);
        Review rev2 = new Review("bad restaurant","saif",3,res);
        Review rev3 = new Review("nice restaurant","saif",4,res);
        res.addReview(rev1);
        res.addReview(rev2);
        res.addReview(rev3);
        String result ="Restaurant{" +
                "Name='" + "PizzaHut" + '\'' +
                ", stars=" + 4 +    // (5+4+3)(sum of stars)/3(size of reviews) = 4 (avg stars)
                ", price=" + 15.0 +
                '}';
        Assertions.assertEquals(result,res.toString());
    }
}
