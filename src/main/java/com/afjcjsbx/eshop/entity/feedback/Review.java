package com.afjcjsbx.eshop.entity.feedback;

/**
 * Created by Davide on 13/02/2017.
 */
public class Review {

    private int reviewId;
    private int productId; // reviewed product
    private String email; // the consumer who is providing his feedback. Users are identified by email username
    private int rating; // rating in number of stars
    private String comment; // comment of the user about the product

    public Review(int reviewId, int productId, String email, int rating, String comment) {
        this.reviewId = reviewId;
        this.productId = productId;
        this.email = email;
        this.rating = rating;
        this.comment = comment;
    }

    public int getReviewId() {
        return reviewId;
    }

    public int getProductId() {
        return productId;
    }

    public String getEmail() {
        return email;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
