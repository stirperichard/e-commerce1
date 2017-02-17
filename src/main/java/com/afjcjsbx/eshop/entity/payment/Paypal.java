package com.afjcjsbx.eshop.entity.payment;

public class Paypal implements PaymentService {
	
	@Override 
	public void verificaServizio(){
		
		System.out.println("Servizio verificato. Tipo servizio: Paypal");
	}

	@Override
	public String rispostaPagamento() {
		
		String mex;
		
		mex = "  ---[PAYPAL]---  Pagamento effettuato con successo!";
		
		return mex;
	}
}
