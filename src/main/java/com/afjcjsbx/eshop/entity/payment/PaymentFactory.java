package com.afjcjsbx.eshop.entity.payment;

public class PaymentFactory {
	
	public PaymentService creaServizioPagamento(int tipo) throws Exception{
        switch (tipo)
        {
            case 1: return new Paypal();
            case 2: return new Visa();
            case 3: return new Mastercard();
            default: throw new Exception("Invalid type : " + tipo);
        }
  }
}
