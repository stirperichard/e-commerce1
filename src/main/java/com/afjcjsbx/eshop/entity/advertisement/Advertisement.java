package com.afjcjsbx.eshop.entity.advertisement;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.entity.catalogue.Product;
import com.afjcjsbx.eshop.entity.login.Producer;

import java.util.ArrayList;

/**
 * Sale advertisement for a product.
 */
public class Advertisement extends Entity{

    private Product productToSell;
    private Producer seller;
    private double price;
    private ArrayList<DeliveryMethod> availableDeliveryMethods; // array di metodi di consegna disponibili per il productToSell
    private ArrayList<PaymentMethod> availablePaymentMethods;

    public Advertisement(Product productToSell, Producer seller, double price, DeliveryMethod[] availableDeliveryMethods, PaymentMethod[] availablePaymentMethods) {
        this.productToSell = productToSell;
        this.seller = seller;
        this.price = price;
        this.availableDeliveryMethods = availableDeliveryMethods;
        this.availablePaymentMethods = availablePaymentMethods;
    }

    public Product getProduct() {
        return productToSell;
    }

    public void setProduct(Product product) {
        this.productToSell = product;
    }
}
