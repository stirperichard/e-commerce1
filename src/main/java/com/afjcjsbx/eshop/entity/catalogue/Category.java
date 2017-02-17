package com.afjcjsbx.eshop.entity.catalogue;

import com.afjcjsbx.eshop.entity.Entity;

/**
 * Created by afjcjsbx on 06/01/17.
 */

public class Category {


    private String name;
    private String description;
    private String image;


    public Category(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
