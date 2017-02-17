package com.afjcjsbx.eshop.controller.registration;

import com.afjcjsbx.eshop.controller.AbstractController;
import com.afjcjsbx.eshop.entity.login.AbstractUser;
import com.afjcjsbx.eshop.entity.login.FactoryUsers;
import com.afjcjsbx.eshop.utils.ConnectionManager;
import com.afjcjsbx.eshop.utils.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Richard on 07/02/2017.
 */
public class RegistrationController extends AbstractController {

    private static AbstractUser retrieveUserInfoFromDatabaseQuery(ResultSet resultSet) throws SQLException {

        String u_name = resultSet.getString("Name"),
                u_surname = resultSet.getString("Surname"),
                u_username = resultSet.getString("Username"),
                u_email = resultSet.getString("Mail"),
                u_password = resultSet.getString("Password"),
                u_type = resultSet.getString("Type"),
                u_address = resultSet.getString("address");


        AbstractUser user = FactoryUsers.get(u_type);

        user.setName(u_name);
        user.setSurname(u_surname);
        user.setUsername(u_username);
        user.setEmail(u_email);
        user.setPassword(u_password);
        user.setValid(true);

        System.out.println("Welcome " + u_name + " " + u_surname);

        return user;
    }


    public static AbstractUser retrieveUserInfoByEmail(String email) throws SQLException {

        PreparedStatement preparedStatement = ConnectionManager.getConnection().prepareStatement(Query.FIND_REGISTERED_USER);
        preparedStatement.setString(1, email);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return retrieveUserInfoFromDatabaseQuery(resultSet);
        }

        throw new SQLException();
    }

    public static AbstractUser retrieveUserInfoByUsername(String username) throws SQLException {

        PreparedStatement preparedStatement = ConnectionManager.getConnection().prepareStatement(Query.FIND_REGISTERED_USER);
        preparedStatement.setString(1, username);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return retrieveUserInfoFromDatabaseQuery(resultSet);
        }

        throw new SQLException();
    }

    /* private DatabaseUserSingleton database_singleton = DatabaseUserSingleton.getInstance();

    public boolean register_consumer(Customer c){
        for (int i=0; i < database_singleton.getSize(); i++){
            if (c.getUsername().equals(database_singleton.get(i).getUsername()) ||
                    c.getEmail().equals(database_singleton.get(i).getMail())){
                return false;
            }
        }
        database_singleton.addUser(c);
        return true;
    }

    public boolean register_producer(Producer p){
        for (int i=0; i < database_singleton.getSize(); i++){
            if (p.getUsername().equals(database_singleton.get(i).getUsername()) ||
                    p.getEmail().equals(database_singleton.get(i).getMail())) {
                return false;
            }
        }
        database_singleton.addUser(p);
        return true;
    } */

}
