package com.afjcjsbx.eshop.entity.payment;

import com.afjcjsbx.eshop.entity.catalogue.Product;
import com.afjcjsbx.eshop.entity.login.Consumer;
import com.afjcjsbx.eshop.entity.login.Producer;

/**
 * Created by afjcjsbx on 07/02/17.
 */
public class Transaction {

    private Producer producer;
    private Consumer consumer;
    private Product product;

    public Transaction(Producer producer, Consumer consumer, Product product) {
        this.producer = producer;
        this.consumer = consumer;
        this.product = product;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
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
