package com.afjcjsbx.eshop.entity.advertisement;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.entity.catalogue.Product;
import com.afjcjsbx.eshop.entity.checkout.DeliveryMethod;
import com.afjcjsbx.eshop.entity.checkout.PaymentMethod;
import com.afjcjsbx.eshop.entity.login.Producer;

import java.util.List;

/**
 * Sale advertisement for a product.
 */
public class Advertisement extends Entity {


    private Product productToSell;
    private Producer seller;
    private double sellingPrice;
    private List<DeliveryMethod> availableDeliveryMethods; // array di metodi di consegna disponibili per il productToSell
    private List<PaymentMethod> availablePaymentMethods;

    public Advertisement(Product productToSell, Producer seller, double sellingPrice, List<DeliveryMethod> availableDeliveryMethods, List<PaymentMethod> availablePaymentMethods) {
        this.productToSell = productToSell;
        this.seller = seller;
        this.sellingPrice = sellingPrice;
        this.availableDeliveryMethods = availableDeliveryMethods;
        this.availablePaymentMethods = availablePaymentMethods;
    }

    public Product getProductToSell() {
        return productToSell;
    }

    public void setProductToSell(Product productToSell) {
        this.productToSell = productToSell;
    }

    public Producer getSeller() {
        return seller;
    }

    public void setSeller(Producer seller) {
        this.seller = seller;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public List<DeliveryMethod> getAvailableDeliveryMethods() {
        return availableDeliveryMethods;
    }

    public void setAvailableDeliveryMethods(List<DeliveryMethod> availableDeliveryMethods) {
        this.availableDeliveryMethods = availableDeliveryMethods;
    }

    public List<PaymentMethod> getAvailablePaymentMethods() {
        return availablePaymentMethods;
    }

    public void setAvailablePaymentMethods(List<PaymentMethod> availablePaymentMethods) {
        this.availablePaymentMethods = availablePaymentMethods;
    }
}
