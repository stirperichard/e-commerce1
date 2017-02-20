package com.afjcjsbx.eshop.entity.checkout;

import com.afjcjsbx.eshop.entity.checkout.paymentServices.Mastercard;
import com.afjcjsbx.eshop.entity.checkout.paymentServices.Paypal;
import com.afjcjsbx.eshop.entity.checkout.paymentServices.Visa;

public class PaymentMethodFactory {
	
	public PaymentMethod creaServizioPagamento(int tipo) throws Exception{
        switch (tipo)
        {
            case 1: return new Paypal();
            case 2: return new Visa();
            case 3: return new Mastercard();
            default: throw new Exception("Invalid type : " + tipo);
        }
  }
}
