package com.afjcjsbx.eshop.entity.review;

import com.afjcjsbx.eshop.entity.Entity;

/**
 * Created by afjcjsbx on 06/01/17.
 */
public class Review extends Entity {

    private String description;
    private String username;
    private int stars;


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

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

}
