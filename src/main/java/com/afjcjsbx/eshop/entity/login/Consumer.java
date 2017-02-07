package com.afjcjsbx.eshop.entity.login;
import com.afjcjsbx.eshop.enums.Roles;

import static com.afjcjsbx.eshop.enums.Roles.CONSUMER;

public class Consumer extends AbstractUser {

	@Override
	public Roles getType() {
		return CONSUMER;
	}
}
