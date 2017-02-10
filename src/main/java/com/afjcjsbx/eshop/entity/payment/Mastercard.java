package com.afjcjsbx.eshop.entity.payment;

public class Mastercard implements PaymentService {
	
	@Override 
	public void verificaServizio(){
		
		System.out.println("Servizio verificato. Tipo carta: Mastercard");
	}

	@Override
	public String rispostaPagamento() {
		
		String mex;
		
		mex = "  ---[MASTERCARD]---  Pagamento effettuato con successo!";
		
		return mex;
	}
}
