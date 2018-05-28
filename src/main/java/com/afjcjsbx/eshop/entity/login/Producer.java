package com.afjcjsbx.eshop.entity.login;
import com.afjcjsbx.eshop.enums.Roles;

import static com.afjcjsbx.eshop.enums.Roles.PRODUCER;

public class Producer extends AbstractUser {

    public Producer(String username, String mail, String password, String name, String surname, String address, String address2, String city, String state, String cap, String country, String telephone, String website, String paypal) {

    }

    public Producer() {

    }

    @Override
	public Roles getType() {
		return PRODUCER;
	}
}
