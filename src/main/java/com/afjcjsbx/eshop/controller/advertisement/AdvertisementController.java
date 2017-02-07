package com.afjcjsbx.eshop.controller.advertisement;

import com.afjcjsbx.eshop.entity.advertisement.Advertisement;
import com.afjcjsbx.eshop.entity.login.AbstractUser;
import com.afjcjsbx.eshop.entity.login.FactoryUsers;
import com.afjcjsbx.eshop.entity.login.Producer;
import com.afjcjsbx.eshop.utils.ConnectionManager;
import com.afjcjsbx.eshop.utils.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdvertisementController {



    public boolean insert_advertisement(Advertisement advertisement, Producer producer) {

        try {

            PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(Query.INSERT_ADVERTISE);

            statement.setString(1, "bill");
            statement.setString(2, "secretpass");
            statement.setString(3, "Bill Gates");
            statement.setString(4, "bill.gates@microsoft.com");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    public boolean update_advertisement(Advertisement advertisement) {

        try {

            PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(Query.UPDATE_ADVERTISE);
            statement.setString(1, "123456789");
            statement.setString(2, "William Henry Bill Gates");
            statement.setString(3, "bill.gates@microsoft.com");
            statement.setString(4, "bill");

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            }

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    public boolean delete_advertisement(Advertisement advertisement) {

        try {

            PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(Query.DELETE_ADVERTISE);

            statement.setString(1, "bill");
            statement.setString(2, "secretpass");
            statement.setString(3, "Bill Gates");
            statement.setString(4, "bill.gates@microsoft.com");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


}
