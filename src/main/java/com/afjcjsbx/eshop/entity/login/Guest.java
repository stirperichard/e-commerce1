package com.afjcjsbx.eshop.entity.login;

import com.afjcjsbx.eshop.enums.Roles;

import static com.afjcjsbx.eshop.enums.Roles.GUEST;

public class Guest extends AbstractUser{

    @Override
    public Roles getType() {
        return GUEST;
    }
}
