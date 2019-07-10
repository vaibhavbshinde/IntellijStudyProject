package com.sample.testng.booking;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassUsedForListener2 {
    @Test
    public void createdForFailing(){
        Assert.assertEquals(10,15);
    }
}
