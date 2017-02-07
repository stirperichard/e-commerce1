package com.afjcjsbx.eshop.entity.advertisement;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.entity.catalog.Category;
import com.afjcjsbx.eshop.entity.login.Producer;

/**
 * Created by afjcjsbx on 07/02/17.
 */
public class Advertisement extends Entity{

    private String name;
    private String description;
    private Category catergory;
    private String picture;
    private float price;
    private String manufacturer;
    private boolean charitable;
    private String keywords;
    private int discount_percentage;
    private float shipment_cost;
    private boolean available;
    private Producer producer;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCatergory() {
        return catergory;
    }

    public void setCatergory(Category catergory) {
        this.catergory = catergory;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isCharitable() {
        return charitable;
    }

    public void setCharitable(boolean charitable) {
        this.charitable = charitable;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getDiscount_percentage() {
        return discount_percentage;
    }

    public void setDiscount_percentage(int discount_percentage) {
        this.discount_percentage = discount_percentage;
    }

    public float getShipment_cost() {
        return shipment_cost;
    }

    public void setShipment_cost(float shipment_cost) {
        this.shipment_cost = shipment_cost;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }


}
