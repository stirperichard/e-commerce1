package com.afjcjsbx.eshop.entity.login;


import com.afjcjsbx.eshop.entity.checkout.CreditCard;
import com.afjcjsbx.eshop.entity.shoppingcart.ShoppingCart;
import com.afjcjsbx.eshop.enums.Roles;

import java.util.List;

public abstract class AbstractUser {

    private int id; // TODO serve l'id? c'è già lo username per identificare univocamente gli utenti. Oppure usiamo l'email?
    private String email;
    private String username;
    private String password;
    private List<Roles> roles;
    private ShoppingCart shoppingCart = new ShoppingCart();
    private boolean valid;

    private String name;
    private String surname;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String zip_code;
    private String phone;
    private String website;
    private String payPalAccount;
    private List<CreditCard> creditcards;

    public abstract Roles getType();


    /*
    public AbstractUser(ResultSet resultSet) throws SQLException {
        this.username = resultSet.getString("username");
        this.password = resultSet.getString("password");
    }
    */


    public void update(Guest toUpdate) {
        this.id = toUpdate.getId();
        this.username = toUpdate.getUsername();
        this.password = toUpdate.getPassword();
        this.email = toUpdate.getEmail();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPayPalAccount() {
        return payPalAccount;
    }

    public void setPayPalAccount(String payPalAccount) {
        this.payPalAccount = payPalAccount;
    }

    public List<CreditCard> getCreditcards() {
        return creditcards;
    }

    public void setCreditcards(List<CreditCard> creditcards) {
        this.creditcards = creditcards;
    }
}
