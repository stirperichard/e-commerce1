package com.afjcjsbx.eshop.entity.payment;

public class Visa implements PaymentService {
	
	@Override 
	public void verificaServizio(){
		
		System.out.println("Servizio verificato. Tipo carta: VISA");
	}

	@Override
	public String rispostaPagamento() {
		
		String mex;
		
		mex = "  ---[VISA]---  Pagamento effettuato con successo!";
		
		return mex;
	}
}
