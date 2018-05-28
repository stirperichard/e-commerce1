package com.afjcjsbx.eshop.entity.login;
import com.afjcjsbx.eshop.enums.Roles;

import static com.afjcjsbx.eshop.enums.Roles.CONSUMER;

public class Consumer extends AbstractUser {

	public Consumer(String username, String mail, String password, String name, String surname, String address, String address2, String city, String state, String cap, String country, String telephone, String website, String paypal) {
		super();
	}

	public Consumer(){
		super();
	}

	@Override
	public Roles getType() {
		return CONSUMER;
	}
}
