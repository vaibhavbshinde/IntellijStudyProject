package com.selenium.newtours.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObjects {

    public static WebElement getHomeLink(WebDriver driver){
          return driver.findElement(By.linkText("Home"));
    }

    public static WebElement getFlights(WebDriver driver){
         return driver.findElement(By.linkText("Flights"));
    }

    public static WebElement getHotels(WebDriver driver){
        return driver.findElement(By.linkText("Hotels"));
    }

    public static WebElement getRegister(WebDriver driver){
        return driver.findElement(By.linkText("REGISTER"));
    }

    public static WebElement getSignOn(WebDriver driver) {
        return driver.findElement(By.linkText("SIGN-ON"));
    }

    public static WebElement getUserNameTextBox(WebDriver driver){
        return driver.findElement(By.name("userName"));
    }

}
