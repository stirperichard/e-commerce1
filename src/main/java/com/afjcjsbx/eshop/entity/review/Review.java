package com.afjcjsbx.eshop.entity.review;

import com.afjcjsbx.eshop.entity.Entity;

/**
 * Created by afjcjsbx on 06/01/17.
 */
public class Review extends Entity {

    private Integer rating;
    private String description;
    private String username;


    public Review(Integer rating, String description, String username) {
        this.rating = rating;
        this.description = description;
        this.username = username;
    }

    public Integer getRatings() {
        return rating;
    }

    public void setRatings(Integer rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
