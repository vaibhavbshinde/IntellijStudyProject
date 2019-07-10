package com.sample.testng.booking;

import org.testng.annotations.Test;

public class BookHolidayPackage {

    @Test(groups = "JetAirwaysRegression")
    public void bookHolidayPackage_Destination(){
      System.out.println("bookHolidayPackage_Destination_TestCase1");
    }
    @Test
    public void bookHolidayPackage_Departure(){
        System.out.println("bookHolidayPackage_Departure_TestCase2");
    }
    @Test
    public void bookHolidayPackage_Return(){
        System.out.println("bookHolidayPackage_Return_TestCase3");
    }

}
