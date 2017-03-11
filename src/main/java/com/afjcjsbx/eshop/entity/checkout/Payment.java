package com.afjcjsbx.eshop.entity.checkout;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.enums.payment.PaymentStatus;
import com.afjcjsbx.eshop.enums.payment.PaymentType;

/**
 * Created by afjcjsbx on 06/01/17.
 */
public class Payment extends Entity {

    private PaymentStatus paymentStatus;
    private PaymentType paymentType;


    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
