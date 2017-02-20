package com.afjcjsbx.eshop.entity.checkout;

import com.afjcjsbx.eshop.entity.checkout.paymentServices.Mastercard;
import com.afjcjsbx.eshop.entity.checkout.paymentServices.Paypal;
import com.afjcjsbx.eshop.entity.checkout.paymentServices.Visa;

public class PaymentMethodFactory {
	
	public PaymentMethod createPaymentMethod(int type) throws Exception{
        switch (type)
        {
            case 1: return new Visa();
            case 2: return new Mastercard();
            case 3: return new Paypal();
            default: throw new Exception("Invalid type : " + type);
        }
    }
}
