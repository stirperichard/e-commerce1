package com.afjcjsbx.eshop.controller.shipment;

import com.afjcjsbx.eshop.enums.shipment.DeliveryStatus;
import com.afjcjsbx.eshop.persistence.DataSource;
import com.afjcjsbx.eshop.persistence.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

/**
 * Created by Richard on 07/02/2017.
 */
public class ShipmentController {

    private static DeliveryStatus retrieveShipmentStatus(ResultSet resultSet) throws SQLException, ParseException {
        String s_status = resultSet.getString("ShipmentStatus");

        if (s_status.equals("NOT_FOUND")){
            return DeliveryStatus.NOT_FOUND;
        } else if (s_status.equals("NOTSENT")){
            return DeliveryStatus.NOTSENT;
        } else if (s_status.equals("SENT")){
            return DeliveryStatus.SENT;
        }
        return DeliveryStatus.DELIVERED;
    }

    public static DeliveryStatus shipment(String tracking) throws SQLException, ParseException {

        PreparedStatement preparedStatement = DataSource.getConnection().prepareStatement(Query.FIND_SHIPMENT_STATUS);
        preparedStatement.setString(1, tracking);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return retrieveShipmentStatus(resultSet);
        }
        return DeliveryStatus.NOT_FOUND;
    }
}