package com.afjcjsbx.eshop.entity.checkout;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.enums.payment.CreditCardType;

/**
 * Created by afjcjsbx on 06/01/17.
 */
public class CreditCard extends Entity{

    private CreditCardType creditCardType;
    private String number;
    private String holder;
    private int exp_day;
    private int exp_month;
    private int exp_year;


    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getExp_day() {
        return exp_day;
    }

    public void setExp_day(int exp_day) {
        this.exp_day = exp_day;
    }

    public int getExp_month() {
        return exp_month;
    }

    public void setExp_month(int exp_month) {
        this.exp_month = exp_month;
    }

    public int getExp_year() {
        return exp_year;
    }

    public void setExp_year(int exp_year) {
        this.exp_year = exp_year;
    }

}
