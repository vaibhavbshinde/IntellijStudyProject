package com.sample.testng.booking;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestClass {

    @DataProvider(name = "myData1")
    public Object[][] myDataProvider() {
        Object[][] obj = new Object[4][2];
        obj[0][0] = "user1";
        obj[0][1] = "pwd1";
        obj[1][0] = "user2";
        obj[1][1] = "pwd2";
        obj[2][0] = "user3";
        obj[2][1] = "pwd3";
        obj[3][0] = "user4";
        obj[3][1] = "pwd4";
        return obj;
    }

    @Test(dataProvider = "myData1")
    public void usingDataProvider(String uname, String password){
        System.out.println("Test case should be run for 4 set of users");
        System.out.println(uname);
        System.out.println(password);
    }
}
