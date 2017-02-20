package com.afjcjsbx.eshop.entity.checkout.paymentServices;

import com.afjcjsbx.eshop.entity.checkout.PaymentMethod;

public class Paypal implements PaymentMethod {

	@Override
	public void validatePaymentService() {
		System.out.println("Validated payment service: Paypal");
	}

	@Override
	public double calculateAdditionalPaymentFees() {
		return 10.4;
	}
}
