package com.afjcjsbx.eshop.controller.registration;

import com.afjcjsbx.eshop.controller.AbstractController;
import com.afjcjsbx.eshop.entity.login.AbstractUser;
import com.afjcjsbx.eshop.entity.login.*;
import com.afjcjsbx.eshop.enums.Roles;
import com.afjcjsbx.eshop.persistence.DataSource;
import com.afjcjsbx.eshop.persistence.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Richard on 07/02/2017.
 */
public class RegistrationController extends AbstractController {

    public static boolean FindByEmail(String email) throws SQLException {

        PreparedStatement preparedStatement = DataSource.getConnection().prepareStatement(Query.FIND_USER_BY_EMAIL);
        preparedStatement.setString(1, email);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return false;
        }
        return true;
    }

    public static boolean FindByUsername(String username) throws SQLException {

        PreparedStatement preparedStatement = DataSource.getConnection().prepareStatement(Query.FIND_USER_BY_USERNAME);
        preparedStatement.setString(1, username);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return false;
        }
        return true;
    }



    public AbstractUser create_user(String username, String mail, String password, String name, String surname, String address, String address2, String city, String state, String cap, String country, String telephone, String website, String paypal, Roles roles) throws SQLException {

        AbstractUser user;

        if(String.valueOf(roles).equals("CONSUMER")){
            user = new Consumer();
        }else if(String.valueOf(roles).equals("PRODUCER")){
            user = new Producer();
        } else if(String.valueOf(roles).equals("CHARITY")){
            user = new Charity();
        } else if(String.valueOf(roles).equals("ADMINISTRATOR")){
            user = new Admin();
        } else {
            user = new Guest();
        }

        user.setName(name);
        user.setSurname(surname);
        user.setEmail(mail);
        user.setUsername(username);
        user.setPassword(password);
        user.setAddress1(address);
        user.setAddress2(address2);
        user.setCountry(country);
        user.setState(state);
        user.setCity(city);
        user.setZip_code(cap);
        user.setPhone(telephone);
        user.setPayPalAccount(paypal);
        user.setWebsite(website);
        user.setType(roles);

        return user;
    }

        public boolean register_user(String username, String mail, String password, String name, String surname, String address, String address2, String city, String state, String cap, String country, String telephone, String website, String paypal, Roles roles) throws SQLException {

        AbstractUser user;

        if(String.valueOf(roles).equals("CONSUMER")){
            user = new Consumer(username, mail, password, name, surname, address, address2, city, state, cap, country, telephone, website, paypal);
        }else if(String.valueOf(roles).equals("PRODUCER")){
            user = new Producer(username, mail, password, name, surname, address, address2, city, state, cap, country, telephone, website, paypal);
        } else if(String.valueOf(roles).equals("CHARITY")){
            user = new Charity(username, mail, password, name, surname, address, address2, city, state, cap, country, telephone, website, paypal);
        } else if(String.valueOf(roles).equals("ADMINISTRATOR")){
            user = new Admin(username, mail, password, name, surname, address, address2, city, state, cap, country, telephone, website, paypal);
        } else {
            user = new Guest();
        }

        try {

            PreparedStatement preparedStatement = DataSource.getConnection().prepareStatement(Query.INSERT_USER);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getName());
            preparedStatement.setString(5, user.getSurname());
            preparedStatement.setString(6, user.getAddress1());
            preparedStatement.setString(7, user.getAddress2());
            preparedStatement.setString(8, user.getCity());
            preparedStatement.setString(9, user.getState());
            preparedStatement.setString(10, user.getZip_code());
            preparedStatement.setString(11, user.getCountry());
            preparedStatement.setString(12, user.getPhone());
            preparedStatement.setString(13, user.getWebsite());
            preparedStatement.setString(14, user.getPayPalAccount());
            preparedStatement.setString(15, String.valueOf(user.getRoles()));

            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                return true;
            }
        } catch (SQLException e) {
        e.printStackTrace();
        }
    return false;
    }
}