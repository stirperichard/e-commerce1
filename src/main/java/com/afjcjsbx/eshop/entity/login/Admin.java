package com.afjcjsbx.eshop.entity.login;
import com.afjcjsbx.eshop.enums.Roles;

import static com.afjcjsbx.eshop.enums.Roles.ADMINISTRATOR;
import static com.afjcjsbx.eshop.enums.Roles.PRODUCER;

public class Admin extends AbstractUser {

    public Admin(String username, String mail, String password, String name, String surname, String address, String address2, String city, String state, String cap, String country, String telephone, String website, String paypal) {

    }

    public Admin() {

    }

    @Override
	public Roles getType() {
		return ADMINISTRATOR;
	}
}
