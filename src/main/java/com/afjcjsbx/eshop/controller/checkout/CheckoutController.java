package com.afjcjsbx.eshop.controller.checkout;

import com.afjcjsbx.eshop.entity.catalogue.Product;
import com.afjcjsbx.eshop.entity.checkout.DeliveryMethod;
import com.afjcjsbx.eshop.entity.checkout.PaymentMethod;
import com.afjcjsbx.eshop.entity.checkout.Transaction;
import com.afjcjsbx.eshop.entity.login.Consumer;
import com.afjcjsbx.eshop.entity.login.Producer;
import com.afjcjsbx.eshop.exceptions.DatabaseException;

/**
 * Created by Davide on 20/02/2017.
 */
public class CheckoutController {

    private static CheckoutController instance;

    public synchronized static CheckoutController getInstance() {
        if (instance == null)
            instance = new CheckoutController();
        return instance;
    }

    private CheckoutController() {
    }

    // TODO deve prendere tutte stringhe e istanziare gli oggetti associati, per poi scrivere nel db
    public void createTransaction(Producer seller, Consumer buyer, Product productOnSale, DeliveryMethod delivery, PaymentMethod payment) throws DatabaseException {
        Transaction transaction = new Transaction(seller, buyer, productOnSale, delivery, payment);

        // JDBC
    }

}
