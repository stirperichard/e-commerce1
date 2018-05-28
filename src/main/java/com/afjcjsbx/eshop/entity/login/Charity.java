package com.afjcjsbx.eshop.entity.login;

import com.afjcjsbx.eshop.enums.Roles;

import static com.afjcjsbx.eshop.enums.Roles.CHARITY;

/**
 * Created by Richard on 17/02/2017.
 */
public class Charity extends AbstractUser {

    public Charity(String username, String mail, String password, String name, String surname, String address, String address2, String city, String state, String cap, String country, String telephone, String website, String paypal) {

    }

    public Charity() {

    }

    @Override
    public Roles getType() {return CHARITY;}
}
