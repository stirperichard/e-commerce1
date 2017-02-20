package com.afjcjsbx.eshop.entity.checkout;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.entity.catalogue.Product;
import com.afjcjsbx.eshop.entity.login.Consumer;
import com.afjcjsbx.eshop.entity.login.Producer;

/**
 * Transaction between producer and consumer for a product.
 */
public class Transaction extends Entity{

    private Producer seller;
    private Consumer buyer;
    private Product productOnSale;
    private DeliveryMethod delivery;
    private PaymentMethod payment;

    public Producer getSeller() {
        return seller;
    }

    public Consumer getBuyer() {
        return buyer;
    }

    public Product getProductOnSale() {
        return productOnSale;
    }

    public DeliveryMethod getDelivery() {
        return delivery;
    }

    public PaymentMethod getPayment() {
        return payment;
    }

    public Transaction(Producer seller, Consumer buyer, Product productOnSale, DeliveryMethod delivery, PaymentMethod payment) {
        this.seller = seller;
        this.buyer = buyer;
        this.productOnSale = productOnSale;
        this.delivery = delivery;
        this.payment = payment;

    }
}
