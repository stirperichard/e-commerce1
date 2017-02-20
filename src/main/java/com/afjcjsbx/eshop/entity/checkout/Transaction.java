package com.afjcjsbx.eshop.entity.checkout;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.entity.catalogue.Product;
import com.afjcjsbx.eshop.entity.login.Consumer;
import com.afjcjsbx.eshop.entity.login.Producer;


public class Transaction extends Entity{

    private Producer seller;
    private Consumer buyer;
    private Product productOnSale;
    private metodoconsegna delivery;
    private Metododipagamento payment;

    public Transaction(Producer seller, Consumer buyer, Product productOnSale, metodoconsegna delivery, Metododipagamento payment) {
        this.seller = seller;
        this.buyer = buyer;
        this.productOnSale = productOnSale;
        this.delivery = delivery;
        this.payment = payment;
    }


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
