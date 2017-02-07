package com.afjcjsbx.eshop.entity.shipment;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.enums.shipment.DeliveryStatus;

import java.util.Date;

/**
 * Created by afjcjsbx on 06/01/17.
 */
public class Shipment extends Entity {

    private DeliveryStatus deliveryStatus;
    private String track;
    private Date date;


    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
