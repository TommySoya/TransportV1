package com.Transport;

import java.util.Date;

/**
 * @description:
 * @author: dell
 * @date: Created in 2020/5/15 0:51
 * @version: 1.0
 * @modified By:
 */
public class Motorcycle {
    private String ownership = null;
    private String GPSPosition;
    private String price;
    private Date dataOfPurchase;
    private String id;

    public void drivingMethod() {
        System.out.println("Aircraft!");
    }

    public Motorcycle() {
    }

    public Motorcycle(String id) {
        this.id = id;
    }
}
