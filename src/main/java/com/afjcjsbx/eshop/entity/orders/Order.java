package com.afjcjsbx.eshop.entity.orders;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.enums.orders.OrderStatus;

import java.util.Arrays;
import java.util.List;



public class Order extends Entity{

	private List<OrderStatus> orderStatusList = Arrays.asList(OrderStatus.values());
	private String datePurchased = "";
	//private Delivery delivery = null;
	//private Billing billing = null;


	public List<OrderStatus> getOrderStatusList() {
		return orderStatusList;
	}

	public void setOrderStatusList(List<OrderStatus> orderStatusList) {
		this.orderStatusList = orderStatusList;
	}

	public String getDatePurchased() {
		return datePurchased;
	}

	public void setDatePurchased(String datePurchased) {
		this.datePurchased = datePurchased;
	}

	/*
	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}


	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	*/

}