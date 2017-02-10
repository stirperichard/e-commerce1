package com.afjcjsbx.eshop.controller.pay;

import com.afjcjsbx.eshop.entity.login.*;
import com.afjcjsbx.eshop.entity.catalogue.*;
import com.afjcjsbx.eshop.entity.payment.Transaction;
import com.afjcjsbx.eshop.exceptions.TransactionNotValidException;


public class PaymentController {
    private Transaction transaction;
    private PaymentObserver observer;

    public PaymentController(Producer producer, Consumer consumer, Product product) throws TransactionNotValidException {
        this.transaction = new Transaction(producer, consumer, product);
    }


/*    public void confirmForm(String cardNumber, String ownerFirstName, String ownerLastName, String expirationDate) {
        try {
            CreditCard creditCard = new CreditCard(cardNumber, ownerFirstName, ownerLastName, expirationDate);
            transaction.setCreditCard(creditCard);
            if (new CreditCardSociety(transaction).forwardPayment())
                setTransactionStatus(Status.Approved);
            else
                setTransactionStatus(Status.Failed);
        } catch (CreditCardCredentialNotValid creditCardCredentialNotValid) {
            JOptionPane.showMessageDialog(new Frame(), creditCardCredentialNotValid.getMessage());
            creditCardCredentialNotValid.printStackTrace();
        }
    }*/

    public void attachObserver(PaymentObserver observer) {
        this.observer = observer;
    }

    /*
    public void detachObserver(){
        this.observer = null;
    }
    */

    /*public void setTransactionStatus(Status status) {
        try {
            this.observer.update(status);
            this.transaction.setStatus(status);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }*/

    public Transaction getTransaction() {
        return transaction;
    }
}
