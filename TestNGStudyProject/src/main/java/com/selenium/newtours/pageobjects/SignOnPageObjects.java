package com.selenium.newtours.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignOnPageObjects {


    // Returning the xpath using the Following xpath axes methods
    public static WebElement getPasswordTextBox(WebDriver driver){
        return driver.findElement(By.xpath("//*[@name='userName']//following::input[1]"));
    }

    // Returning the xpath using the Following xpath axes methods
    public static WebElement getSubmitButton(WebDriver driver){
        return driver.findElement(By.xpath("//*[@name='userName']//following::input[2]"));
    }

    //Returning the xpath using the ancestor xpath axes methods
    public static WebElement getUserNameTextBox(WebDriver driver){
        return driver.findElement(By.xpath("//*[@name='submit']//ancestor::table[1]//tr[1]"));
    }

}
