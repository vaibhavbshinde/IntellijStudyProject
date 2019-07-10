package com.java.nine.lambdaexpression.study;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;


public class LocalDateExample {

    public static void main(String[] args){


        // Finding the current date using the new LocalDate class
        LocalDate localdate = LocalDate.now();
        System.out.println("Today's date is :"+localdate);

        //to set the 1st date of month and year
        LocalDate l1 =  LocalDate.of(2018, Month.MARCH,01);
        System.out.println(l1);

        //passing invalid date, so checking validation
        // LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
        // System.out.println("Specific Date= "+feb29_2014);

        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Specific Date= "+todayKolkata);

        //Exception when you pass invalid zoneid
        //Exception in thread "main" java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        //at java.time.zone.ZoneRulesProvider.getProvider(Unknown Source)
//    LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));
//    System.out.println("Specific Date= "+todayIST);

        //Getting Date from the Base date i.e. 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("Specific Date= "+dateFromBase);

        //Getting Date from yearday
        LocalDate hunderdDay2014 = LocalDate.ofYearDay(2014,100);
        System.out.println("100th day of 2014= "+hunderdDay2014);



    }


}
