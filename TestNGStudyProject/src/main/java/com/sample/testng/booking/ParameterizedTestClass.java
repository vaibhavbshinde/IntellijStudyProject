package com.sample.testng.booking;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestClass {
    @Parameters({"URL","UserName","Pwd"})
    @Test()
    public void readingParameterValuesFromTestNGxml(String url, String username, String pwd){
        System.out.println("URL is : "+url);
        System.out.println("UserName is : "+username);
        System.out.println("Password is : "+pwd);
    }

}
