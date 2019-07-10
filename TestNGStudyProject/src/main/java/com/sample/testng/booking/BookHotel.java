package com.sample.testng.booking;

import org.testng.annotations.Test;

public class BookHotel {
    @Test
    public void destination_City(){
        System.out.println("BookHotel.destination_City_TestCase1");
    }
    @Test
    public void checkin() {
        System.out.println("BookHotel.checkin_TestCase2");
    }
    @Test(groups="JetAirwaysRegression")
    public void checkout(){
        System.out.println("BookHotel.checkout_TestCase3");
    }




}