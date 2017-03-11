package com.afjcjsbx.eshop.entity.checkout.paymentServices;

import com.afjcjsbx.eshop.entity.checkout.PaymentMethod;

public class Mastercard implements PaymentMethod {

	@Override
	public boolean validatePaymentService() {
		System.out.println("Validated payment service: Mastercard");
		return true;
	}

	@Override
	public double calculateAdditionalPaymentFees() {
		return 0.7;
	}
}
