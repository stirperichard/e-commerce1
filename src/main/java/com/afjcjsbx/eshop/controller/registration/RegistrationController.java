package com.afjcjsbx.eshop.controller.registration;

import com.afjcjsbx.eshop.controller.AbstractController;
import com.afjcjsbx.eshop.entity.login.*;
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



    public boolean register_user(AbstractUser user) throws SQLException {

        PreparedStatement preparedStatement = DataSource.getConnection().prepareStatement(Query.INSERT_USER);
        preparedStatement.setString(1, user.getEmail());
        preparedStatement.setString(2, user.getUsername());
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
        preparedStatement.setString(15, String.valueOf(user.getType()));

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return true;
        }

        return false;
    }
}
