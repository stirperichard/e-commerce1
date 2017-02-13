package com.afjcjsbx.eshop.entity.payment;

import com.afjcjsbx.eshop.entity.catalogue.Product;
import com.afjcjsbx.eshop.entity.login.Consumer;
import com.afjcjsbx.eshop.entity.login.Producer;


public class Transaction {

    private Producer seller;
    private Consumer consumer;
    private Product product;
    private DeliveryMethod delivery; // TODO creare queste due interfacce? quando ho la conferma su applicazione pattern
    private PaymentMethod payment;

    public Transaction(Producer producer, Consumer consumer, Product product, DeliveryMethod delivery, PaymentMethod payment) {
        this.seller = producer;
        this.consumer = consumer;
        this.product = product;
    }

    public Producer getProducer() {
        return seller;
    }

    public void setProducer(Producer producer) {
        this.seller = producer;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
