package com.afjcjsbx.eshop.entity.checkout;

public interface PaymentMethod {
	
	boolean validatePaymentService();
	
	double calculateAdditionalPaymentFees();

}
