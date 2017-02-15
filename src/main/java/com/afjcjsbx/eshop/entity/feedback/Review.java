package com.afjcjsbx.eshop.entity.feedback;

/**
 * Created by Davide on 13/02/2017.
 */
public class Review { // TODO rinominare a ManageFeedbackBean? Cioè, entitè e bean sono la stessa cosa? Direi di no, vedi esempio Mastrofini

    private int reviewId;
    private int productId; // reviewed product
    private String username; // the consumer who is providing his feedback. Users are identified by email username
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
