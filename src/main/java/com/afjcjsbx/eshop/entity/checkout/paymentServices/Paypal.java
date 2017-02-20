package com.afjcjsbx.eshop.entity.checkout.paymentServices;

import com.afjcjsbx.eshop.entity.checkout.PaymentMethod;

public class Paypal implements PaymentMethod {

	@Override
	public boolean validatePaymentService() {
		System.out.println("Validated payment service: Paypal");
		return true;
	}

	@Override
	public double calculateAdditionalPaymentFees() {
		return 0.5;
	}
}
