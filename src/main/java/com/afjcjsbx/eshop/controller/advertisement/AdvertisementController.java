package com.afjcjsbx.eshop.controller.advertisement;

import com.afjcjsbx.eshop.entity.advertisement.Advertisement;
import com.afjcjsbx.eshop.entity.login.Producer;
import com.afjcjsbx.eshop.utils.ConnectionManager;
import com.afjcjsbx.eshop.utils.Query;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdvertisementController {


    public boolean insert_advertisement(Advertisement advertisement, Producer producer) {

        try {

            PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(Query.INSERT_ADVERTISE);

            statement.setString(1, producer.getEmail());
            statement.setString(2, advertisement.getProduct().getCategory().getName());
            statement.setString(3, advertisement.getProduct().getName());
            statement.setString(4, advertisement.getProduct().getDescription());
            statement.setString(5, advertisement.getProduct().getPicture());
            statement.setString(6, Float.toString(advertisement.getProduct().getPrice()));
            statement.setString(7, advertisement.getProduct().getManufacturer());
            statement.setString(8, (advertisement.getProduct().isCharitable()) ? "1" : "0");
            statement.setString(9, advertisement.getProduct().getKeywords());
            statement.setString(10, Integer.toString(advertisement.getProduct().getDiscountPercentage()));
            statement.setString(11, Float.toString(advertisement.getProduct().getShipmentCost()));
            statement.setString(12, (advertisement.getProduct().isAvailability()) ? "1" : "0");

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


    @Override
    public String toString() {
        return "AdvertisementController{}";
    }

    public boolean update_advertisement(Advertisement advertisement) {

        try {

            PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(Query.UPDATE_ADVERTISE);

            statement.setString(1, advertisement.getProduct().getName());
            statement.setString(2, advertisement.getProduct().getDescription());
            statement.setString(3, Float.toString(advertisement.getProduct().getPrice()));
            statement.setString(4, Integer.toString(advertisement.getProduct().getDiscountPercentage()));

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

            statement.setString(1, Integer.toString(advertisement.getProduct().getId()));

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
