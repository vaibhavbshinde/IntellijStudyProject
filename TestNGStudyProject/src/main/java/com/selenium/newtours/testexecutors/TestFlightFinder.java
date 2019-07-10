package com.selenium.newtours.testexecutors;

import com.selenium.newtours.actionables.BrokenLinksVerification;
import com.selenium.newtours.actionables.LandingPageActions;
import com.selenium.newtours.actionables.LandingPageUsingActionActionsClasses;
import com.selenium.newtours.actionables.ReservationPageActions;
import com.selenium.newtours.utils.Utils;
import net.bytebuddy.utility.JavaModule;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFlightFinder {

    @BeforeClass
    public static void testcase_loadwebapp(){
        Utils.loadWebApp();
    }

    /**
     * Click on the "Flights" from main page
     * On the Reservation page, click on the oneway trip and Business service class
     */
    @Test(enabled=false)
    public static void testcase_FlightFinder(){
        LandingPageActions.clickOn_FlightsLink();
        ReservationPageActions.clickOn_OnewayRoundTrip();
        ReservationPageActions.clickOn_ServiceClassBusiness();
    }

    /**
     * This is the test case for selecting the value from the dropdown using SELECT class. Here we can select single
     */
    @Test(enabled=false)
    public static void testcase_CountryDropdown(){
        LandingPageActions.clickOn_RegisterLink();
        ReservationPageActions.RegisterUserActions.select_CountryValue("INDIA");
        boolean finalFound = ReservationPageActions.RegisterUserActions.select_CountryValuePresent("INDIA");
        if(finalFound){
            System.out.println("Yeah .... finally my country found");
        }

        finalFound = ReservationPageActions.RegisterUserActions.select_CountryValuePresent("ALPHABETA");
        if (!finalFound){
            System.out.println("Sorry .... WrongCountryName!!!");
        }
   }


    /**
     * This is the test case which performs series of the action classes using the Action and Actions classes
     *
     */
     @Test(enabled=false)
     public static void testcase_TypeUserName(){
         LandingPageUsingActionActionsClasses.typeUserNameUsingActions();
     }

    /**
     * This is the test case which used the xpath axes
     *
     */
    @Test(enabled = false)
     public static void testcase_usingXpathaxes(){
         LandingPageActions.clickOn_SignOnLink();
     }


    @Test
    public static void testcase_brokenlinks(){
        BrokenLinksVerification.findBroken_links();
    }


}
