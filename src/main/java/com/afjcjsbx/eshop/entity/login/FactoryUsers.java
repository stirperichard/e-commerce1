package com.afjcjsbx.eshop.entity.login;


public class FactoryUsers {

    public static AbstractUser get(String type) {

        switch (type) {

            case "P":
                return new Producer();
            case "C":
                return new Consumer();
                /*
            case "A":
                return new Admin();
                break;
                */

            default:
                return new Guest();
        }
    }
}