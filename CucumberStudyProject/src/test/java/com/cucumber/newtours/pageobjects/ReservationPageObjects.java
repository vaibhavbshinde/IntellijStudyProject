package com.cucumber.newtours.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservationPageObjects {

    public static WebElement getContinueBttn(WebDriver driver){
        return driver.findElement(By.xpath("//input[@name='findFlights']"));
    }

    public static WebElement getFlights(WebDriver driver)
    {
        return driver.findElement(By.linkText("Flights"));
    }

    public static WebElement getTypeOneWayTrip(WebDriver driver){
        return driver.findElement(By.xpath("//input[@value='oneway']"));
    }

    public static WebElement getServiceClassBusiness(WebDriver driver){
        return driver.findElement(By.xpath("//input[@value='Business']"));
    }


}
