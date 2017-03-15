package com.afjcjsbx.eshop.controller.shipment;

import com.afjcjsbx.eshop.entity.shipment.Shipment;
import com.afjcjsbx.eshop.enums.shipment.DeliveryStatus;
import com.afjcjsbx.eshop.persistence.DataSource;
import com.afjcjsbx.eshop.persistence.Query;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Richard on 07/02/2017.
 */
public class ShipmentController {

    private static DeliveryStatus retrieveShipmentStatus(ResultSet resultSet) throws SQLException, ParseException {
        DeliveryStatus ds = null;
        String s_tracking = resultSet.getString("ShipmentTracking"),
                s_data = resultSet.getString("ShipmentDate"),
                s_status = resultSet.getString("ShipmentStatus");

        System.out.println(s_tracking);
        System.out.println(s_data);
        System.out.println(s_status);

        if (s_status == "NOT_FOUND"){
            ds = DeliveryStatus.NOT_FOUND;
        } else if (s_status == "NOTSENT"){
            ds = DeliveryStatus.NOTSENT;
        } else if (s_status == "SENT"){
            ds = DeliveryStatus.SENT;
        } else if (s_status == "DELIVERED"){
            ds = DeliveryStatus.DELIVERED;
        }

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        Date date_f = (Date) formatter.parse(s_data);

        System.out.println(date_f);

        Shipment shipment = new Shipment();

        shipment.setTrackingNumber(s_tracking);
        shipment.setDate(date_f);
        shipment.setDeliveryStatus(ds);

        return shipment.getDeliveryStatus();
    }

    public static DeliveryStatus shipment(String tracking, String date) throws SQLException, ParseException {
        System.out.println(tracking);
        System.out.println(date);
        System.out.println("A");

        PreparedStatement preparedStatement = DataSource.getConnection().prepareStatement(Query.FIND_SHIPMENT_STATUS);
        System.out.println("B");
        preparedStatement.setString(1, tracking);
        System.out.println("C");
        preparedStatement.setString(2, date);
        System.out.println("D");

        ResultSet resultSet = preparedStatement.executeQuery();

        System.out.println("E");

        if (resultSet.next()) {
            return retrieveShipmentStatus(resultSet);
        }

        return DeliveryStatus.NOT_FOUND;
    }
}
