package com.afjcjsbx.eshop.entity.checkout.paymentServices;

import com.afjcjsbx.eshop.entity.checkout.PaymentMethod;

public class Visa implements PaymentMethod {

	@Override
	public void validatePaymentService() {
		System.out.println("Validated payment service: Visa");
	}

	@Override
	public double calculateAdditionalPaymentFees() {
		return 7.3;
	}
}
