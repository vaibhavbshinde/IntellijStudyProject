package com.sample.testng.booking;

import org.testng.annotations.*;

public class BookFlight {

@Parameters("browser")
@BeforeTest
public void BeforeTest_TestCase(String loadbrowser)
{
    System.out.println("BeforeTest-This should be first"+loadbrowser);
}

@BeforeMethod
public void BeforeMethod_TestCase()
{
    System.out.println("BeforeMethod: This should be run before every test case");
}

@Test(enabled =true)
public void BookFlight_RoundTrip_TC1()
{
      System.out.println("BookFlight_RoundTrip-Test case 1");
}

@Test
public void BookFlight_RoundTrip_TC2()
{
      System.out.println("BookFlight_RoundTrip-Test Case2");
}

@Test
public void BookFlight_OneWay_TC1()
{
      System.out.println("BookFlight_OneWay-Test Case1");
}

@Test(dependsOnMethods={"BookFlight_RoundTrip_TC1"})
public void BookFlight_OneWay_TC2()
{
        System.out.println("BookFlight_OneWay-Test Case2");
}

@AfterTest
public void AfterTest_TestCase()
{
    System.out.println("AfterTest: This should be last");
}

@AfterMethod
public void AfterMethod_TestCase()
{
    System.out.println("AfterMethod : This should be run after every test case");
}

}
