package com.sample.testng.booking;

import org.testng.annotations.*;


/**
 *  Class Name : Start with Uppercase character and if contain Multiple word then every innerword should start with uppercase character
 *               eg. String, StringBuffer, ArrayList
 *  Interface  : Start with Uppercase character and if contain Multiple word then every innerword should start with uppercase character
 *               eg. RandomAccess, Serializable,
 *  Methods    : Start with lowercase character and if contain Multiple word then every innerword should start with uppercase character
 *               eg. getName, setName
 *  Variables  : Start with lowercase character and if contain Multiple word then every innerword should start with uppercase character
 *               eg. age, gender
 *  Constants  : Should contains only UpperCase characters and if contains multiple word then this word are seperated with underscore symbol. By default it is public static final
 *               eg. MAX_VALUE, MAX_PRIORITY, PI
 * Java Bean Class : it is simple java class, which has private variables and public getter & setter method.
 *              eg.
 * Listener   : it listen event and perform appropriate action
 *
 */
public class FlightStatus {

    @BeforeTest
    public void clickOntheFlightStatusTab_TC4(){
        System.out.println("******* It should be executed first as user needs to click on FlightStatusTab******* ");
        System.out.println("******* This method should be executed first before all test cases executed******* ");
    }

    @AfterTest
    public void clickOntheCheckInTab_TC5(){
        System.out.println("~~~~As Flight is Searched going to CheckIn tab~~~~");
    }

    @BeforeMethod
    public void reloadDropDown(){
        System.out.println("@@");
        System.out.println("This method is gets executed before every method gets executed");
        System.out.println("@@");
    }

    @AfterMethod
    public void callingGC(){
        System.out.println("##");
        System.out.println("This method is gets executed after every method gets executed");
        System.out.println("##");
    }

    @BeforeClass
    public void callingForBeforeClass(){
        System.out.println("TestingforBeforeClass -- It gets executed only once before any test gets executed");
    }
    @AfterClass
    public void callingForAfterClass(){
        System.out.println("TestingforAfterClass -- It gets executed only once all test method gets executed");
    }

    @Test
    public void testSearchFlight_TC1(){

        System.out.println("========CLICK ON THE SEARCH BUTTON===========");
        System.out.println("========Executed the Statement from the testSearchFlight_TC1========");
    }

    @Test
    public void testSearchFromDepartureCity_TC2(){
        System.out.println("-------For Method Name : testSearchFromDepartureCity_TC2-------");
        System.out.println("-------Here searching FROM  city name from the dropdown list-------");
    }

    @Test
    public void testSearchToCity_TC3(){
        System.out.println("!!!!!For Method Name : testSearchToCity_TC3!!!!!");
        System.out.println("!!!!!Here searching TO city name from the dropdown list!!!!!");
 }




}

