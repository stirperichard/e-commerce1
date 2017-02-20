package com.afjcjsbx.eshop.entity.checkout.paymentServices;

import com.afjcjsbx.eshop.entity.checkout.PaymentMethod;

public class Mastercard implements PaymentMethod {

	@Override
	public void validatePaymentService() {
		System.out.println("Validated payment service: Mastercard");
	}

	@Override
	public double calculateAdditionalPaymentFees() {
		return 4.5;
	}
}
