package com.afjcjsbx.eshop.entity.checkout;

public interface PaymentMethod {
	
	void validatePaymentService();
	
	double calculateAdditionalPaymentFees();

}
