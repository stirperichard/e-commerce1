package com.afjcjsbx.eshop.entity.shipment;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.enums.shipment.DeliveryStatus;

import java.util.Date;

/**
 * Created by afjcjsbx on 06/01/17.
 */

public class Shipment extends Entity {

    private DeliveryStatus DeliveryStatus;
    private String trackingNumber;
    private Date date;


    public DeliveryStatus getDeliveryStatus() {
        return DeliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.DeliveryStatus = deliveryStatus;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
