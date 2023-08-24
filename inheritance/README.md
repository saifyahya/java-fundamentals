## overview of the architecture the library
- inheritance library contains *5 classes*:
1. **Restaurant**
- Attributes: int stars, double price.
- Methods: Constructor, toString, addReview, updateStars.
2. **Shop**
- Attributes: String description int dollarSigns.
- Methods: Constructor, toString, addReview.
3. **Theater**
- Attributes: ArrayList<String> movies.
- Methods: Constructor, toString, addReview, addMovie, removeMovie.
4. **Review**: *it holds the review information  of each class of the above, and it is a composition component of the above classes*
- Attributes: String body, String author, int stars, String movie.
- Methods: Constructor, toString.
5. **AbsReview**: *abstract class that is extended by Restaurant, Shop and Theater classes.*
- Attributes: String name, ArrayList<Review> reviews. 
- Methods: Constructor, abstract method addReview.

## directions on how to test the code
- Testing making instance of Shop, Restaurant and Theater classes correctly.
- Testing add review to each instance of class correctly.
- Testing making instance review to each class correctly.