package com.afjcjsbx.eshop.entity.checkout.paymentServices;

import com.afjcjsbx.eshop.entity.checkout.PaymentMethod;

public class Visa implements PaymentMethod {

	@Override
	public boolean validatePaymentService() {
		System.out.println("Validated payment service: Visa");
		return true;
	}

	@Override
	public double calculateAdditionalPaymentFees() {
		return 0.9;
	}
}
