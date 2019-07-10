package com.cucumber.newtours.stepdefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.DataTable;


public class UserRegistrationStepDefinition {
    public static  WebDriver driver = null;

    @Given("^User is on registration pagess$")
    public void user_is_on_registration_pagess() {
        System.setProperty("webdriver.chrome.driver", "E:\\GitRpo\\IntellijStudyProject\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");

    }

    @When("^I entered invalid data on the page$")
    public void i_entered_invalid_data_on_the_page(DataTable arg1) {
        //Initialize data table
        List<List<String>> data = arg1.raw();
        System.out.println(data.get(1).get(1));

        //Enter data
        driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));
        driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));
        driver.findElement(By.name("reg_email__")).sendKeys(data.get(3).get(1));
        driver.findElement(By.name("reg_email_confirmation__")).
                sendKeys(data.get(4).get(1));
        driver.findElement(By.name("reg_passwd__")).sendKeys(data.get(5).get(1));

        Select dropdownB = new Select(driver.findElement(By.name("birthday_day")));
        dropdownB.selectByValue("15");

        Select dropdownM = new Select(driver.findElement(By.name("birthday_month")));
        dropdownM.selectByValue("6");

        Select dropdownY = new Select(driver.findElement(By.name("birthday_year")));
        dropdownY.selectByValue("1990");

     //   driver.findElement(By.className("_58mt")).click();

    }

    @Then("^user registration should be unsuccessful$")
    public void user_registration_should_be_unsuccessful() {
        // Write code here that turns the phrase above into concrete actions


    }
}