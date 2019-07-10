package com.java.general.study;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest2 {


    public static void main(String[] args){

     //  System.setProperty("webdriver.gecko.marionette","E:\\GitRpo\\IntellijStudyProject\\webdrivers\\geckodriver.exe");
     // WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver","E:\\GitRpo\\IntellijStudyProject\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
/*
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("test-type");

        capabilities.setCapability("chrome.binary",
                "C:\\Users\\New\\Desktop\\chromedriver.exe");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
*/

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        driver.close();


    }

}
