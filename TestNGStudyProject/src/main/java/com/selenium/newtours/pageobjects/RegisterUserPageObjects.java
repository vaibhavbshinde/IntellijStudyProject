package com.selenium.newtours.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// For dropdown we have to import select
import org.openqa.selenium.support.ui.Select;

public class RegisterUserPageObjects {

    public static Select getCountryDropdown(WebDriver driver){
        // then here create the Select object for web element
        Select drpCounty = new Select(driver.findElement(By.name("country")));
        return drpCounty;
    }

}
