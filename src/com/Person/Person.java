package com.Person;

import com.Transport.*;

/**
 * @description:
 * @author: dell
 * @date: Created in 2020/5/15 0:40
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private int p_Age = 18;
    private String p_Sex = "男";
    private String id = "201902202";
    private String p_Name;

    public Person(String p_Name) {
        this.p_Name = p_Name;
    }

    public Person() {
    }

    public void driveTransport(Aircraft transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Airship transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Automobile transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Bicycle transport) {
        transport.drivingMethod();
    }
    public void driveTransport(HotAirBallon transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Hovercraft transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Motorcycle transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Ship transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Submarine transport) {
        transport.drivingMethod();
    }
}
