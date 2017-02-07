package com.afjcjsbx.eshop.entity.login;
import com.afjcjsbx.eshop.enums.Roles;

import static com.afjcjsbx.eshop.enums.Roles.ADMINISTRATOR;
import static com.afjcjsbx.eshop.enums.Roles.PRODUCER;

public class Admin extends AbstractUser {

	@Override
	public Roles getType() {
		return ADMINISTRATOR;
	}
}
