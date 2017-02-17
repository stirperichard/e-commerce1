package com.afjcjsbx.eshop.entity.payment;

import com.afjcjsbx.eshop.entity.catalogue.Product;
import com.afjcjsbx.eshop.entity.login.Consumer;
import com.afjcjsbx.eshop.entity.login.Producer;


public class Transaction {

    private Producer seller;
    private Consumer buyer;
    private Product productOnSale;
    /*
    private DeliveryMethod delivery; // TODO creare queste due interfacce? Mi sa che è meglio il Decorator
    private PaymentMethod payment;


    public Transaction(Producer seller, Consumer buyer, Product productOnSale, DeliveryMethod delivery, PaymentMethod payment) {
        this.seller = seller;
        this.buyer = buyer;
        this.productOnSale = productOnSale;
    }
    */

    /*public Producer getProducer() {
        return seller;
    }

    public void setProducer(Producer producer) {
        this.seller = producer;
    }

    public Consumer getConsumer() {
        return buyer;
    }

    public void setConsumer(Consumer buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return productForSale;
    }

    public void setProduct(Product product) {
        this.productForSale = product;
    }*/

}
