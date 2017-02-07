package com.afjcjsbx.eshop.entity.shipment;

import com.afjcjsbx.eshop.entity.Entity;

/**
 * Created by afjcjsbx on 06/01/17.
 */
public class Shippers extends Entity {

    private String name;
    private String telephone;
    private String website;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
