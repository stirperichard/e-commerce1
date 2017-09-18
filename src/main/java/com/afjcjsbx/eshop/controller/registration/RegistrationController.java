package com.afjcjsbx.eshop.controller.registration;

import com.afjcjsbx.eshop.controller.AbstractController;
import com.afjcjsbx.eshop.entity.login.*;
import com.afjcjsbx.eshop.enums.Roles;
import com.afjcjsbx.eshop.persistence.DataSource;
import com.afjcjsbx.eshop.persistence.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.afjcjsbx.eshop.enums.Roles.CONSUMER;

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

    public boolean register_user(String username, String mail, String password, String name, String surname, String address, String address2, String city, String state, String cap, String country, String telephone, String website, String paypal, Roles roles) throws SQLException {

        String role;
        if(String.valueOf(roles).equals("CONSUMER")){
            role = "C";
        }else if(String.valueOf(roles).equals("PRODUCER")){
            role = "P";
        } else if(String.valueOf(roles).equals("CHARITY")){
            role = "H";
        } else if(String.valueOf(roles).equals("ADMINISTRATOR")){
            role = "A";
        } else {
            role = "G";
        }

        System.out.println(roles);
        System.out.println(role);
        System.out.println(String.valueOf(roles));

        try {

            PreparedStatement preparedStatement = DataSource.getConnection().prepareStatement(Query.INSERT_USER);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, mail);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, name);
            preparedStatement.setString(5, surname);
            preparedStatement.setString(6, address);
            preparedStatement.setString(7, address2);
            preparedStatement.setString(8, city);
            preparedStatement.setString(9, state);
            preparedStatement.setString(10, cap);
            preparedStatement.setString(11, country);
            preparedStatement.setString(12, telephone);
            preparedStatement.setString(13, website);
            preparedStatement.setString(14, paypal);
            preparedStatement.setString(15, role);

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