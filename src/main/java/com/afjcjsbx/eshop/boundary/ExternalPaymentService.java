package com.afjcjsbx.eshop.boundary;

import com.afjcjsbx.eshop.entity.checkout.Transaction;

/**
 * Created by Davide on 20/02/2017.
 */
public class ExternalPaymentService {
    private Transaction transaction;

    public ExternalPaymentService(Transaction transaction) {
        this.transaction = transaction;
    }

    public boolean forwardPayment() {
        //TODO Process the transaction and invoke payment company API
        return true;
    }
}
