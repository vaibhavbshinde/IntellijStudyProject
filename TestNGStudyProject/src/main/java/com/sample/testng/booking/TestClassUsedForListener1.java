package com.sample.testng.booking;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassUsedForListener1 {

    @Test
    public void testCase1(){
        Assert.assertEquals("Hi","Hi");
    }

    @Test
    public void testCase2(){
        Assert.assertEquals("Hi","Hello");
    }
}
