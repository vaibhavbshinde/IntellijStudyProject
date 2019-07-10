package com.java.nine.lambdaexpression.study;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LocalTime today = LocalTime.now();
        System.out.println("Current Date ="+today);

        //Creating localTime By providing input arguments
        LocalTime specificTIme = LocalTime.of(12,20, 25, 40);
        System.out.println("Specific Date= "+specificTIme);

        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalTime todayKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST= "+todayKolkata);
    }

}
