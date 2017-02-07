package com.afjcjsbx.eshop.entity.catalog;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.entity.login.Producer;
import com.afjcjsbx.eshop.entity.review.Review;

import java.util.List;


public class Product extends Entity{


	private String name;
	private String description;
	private String SKU;
	private String picture;
	private float price;
	private int discountPercentage;
	private float shipmentCost;
	private Producer producer;
	private Category category;
	private String manufacturer;
    private String keywords;
    private List<Review> reviews;
    private boolean isCharitable;
    private boolean availability;


	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
        return this;

    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String SKU) {
		this.SKU = SKU;
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

	public Product setPrice(float price) {
		this.price = price;
        return this;
    }

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public float getShipmentCost() {
		return shipmentCost;
	}

	public void setShipmentCost(float shipmentCost) {
		this.shipmentCost = shipmentCost;
	}

	public Producer getProducer_email() {
		return producer;
	}

	public void setProducer_email(Producer producer) {
		this.producer = producer;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public boolean isCharitable() {
		return isCharitable;
	}

	public void setCharitable(boolean charitable) {
		isCharitable = charitable;
	}

    public Product getProduct(){
        return this;
    }


	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}
