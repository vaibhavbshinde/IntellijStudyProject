package com.cucumber.newtours.stepdefs;

import com.cucumber.newtours.pageobjects.ReservationPageObjects;
import com.selenium.newtours.util.Utils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;



public class LoginStepDefinition extends Utils {

    @Given("^user on home page$")
    public void user_on_home_page(){
        this.loadWebApp();
        ReservationPageObjects.getFlights(this.driver).click();
    }

    @When("^title of page find flight$")
    public void title_of_page_find_flight(){
/*        Wait wait = new FluentWait<WebDriver>(driver)
                   .pollingEvery(Duration.ofSeconds(15))
                   .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(ReservationPageObjects.getContinueBttn(this.driver));
    */    if(ReservationPageObjects.getContinueBttn(this.driver).isDisplayed()) {
            System.out.println("Get Continue Button is available");
        }

    }

    @Then("^click on oneway$")
    public void click_on_oneway(){
        ReservationPageObjects.getTypeOneWayTrip(this.driver).click();
        if(ReservationPageObjects.getTypeOneWayTrip(Utils.driver).isSelected()){
           System.out.println("OneWay RoundTrip is selected");
            }
    }

    @Then("^click on businessclass$")
    public void click_on_businessclass(){
        ReservationPageObjects.getServiceClassBusiness(this.driver).click();
        if(ReservationPageObjects.getServiceClassBusiness(this.driver).isSelected()){
            System.out.println("Bussiness class is selected");
        }
    }
}
