package com.afjcjsbx.eshop.controller.payment;

import com.afjcjsbx.eshop.enums.payment.PaymentStatus;


public interface PaymentObserver {
    void update(PaymentStatus status);
    //nell'update implementato accedere all'attributo transaction e
    // fare getStatus. In base allo stato comportarsi di conseguenza.
}
