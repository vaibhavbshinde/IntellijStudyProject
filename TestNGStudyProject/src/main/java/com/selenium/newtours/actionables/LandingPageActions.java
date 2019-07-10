package com.selenium.newtours.actionables;

import com.selenium.newtours.pageobjects.LandingPageObjects;
import com.selenium.newtours.utils.Utils;

public class LandingPageActions {

    public static void clickOn_HomeLink(){
        LandingPageObjects.getHomeLink(Utils.driver).click();
    }

    public static void clickOn_FlightsLink(){
        LandingPageObjects.getFlights(Utils.driver).click();
    }

    public static void clickOn_RegisterLink(){
        LandingPageObjects.getRegister(Utils.driver).click();
    }

    public static void clickOn_SignOnLink(){
        LandingPageObjects.getSignOn(Utils.driver).click();
    }

}
