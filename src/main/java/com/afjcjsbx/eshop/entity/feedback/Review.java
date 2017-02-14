package com.afjcjsbx.eshop.entity.feedback;

import com.afjcjsbx.eshop.entity.Entity;

/**
 * Created by Davide on 13/02/2017.
 */
public class Review extends Entity { // TODO rinominare a ReviewBean?

    private int productId; // reviewed product
    private String username; // the consumer who is providing his feedback
    private int rating; // rating in number of stars
    private String comment; // comment of the user about the product

    public Review(String username, int rating, String comment) {
        this.username = username;
        this.rating = rating;
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

}
