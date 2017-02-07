package com.afjcjsbx.eshop.entity.orders;


public class Refund {
	
	/**
	 * 
	 */
	private Long orderId;
	private String amount;


	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
