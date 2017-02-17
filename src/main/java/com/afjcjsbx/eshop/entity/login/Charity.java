package com.afjcjsbx.eshop.entity.login;

import com.afjcjsbx.eshop.enums.Roles;

import static com.afjcjsbx.eshop.enums.Roles.CHARITY;

/**
 * Created by Richard on 17/02/2017.
 */
public class Charity extends AbstractUser {

    @Override
    public Roles getType() {return CHARITY;}
}
