package com.onlinecheckin;

import org.testng.annotations.Test;

public class CheckInOnline {
    @Test
    public void checkInOnline(){
        System.out.println("CheckInOnline.checkInOnline -- method is on com.onlinecheckin package");
    }
    @Test(groups = "JetAirwaysRegression")
    public void onBoardInFlight(){
        System.out.println("Yes .. finally i have onboard into flight");
    }
}
