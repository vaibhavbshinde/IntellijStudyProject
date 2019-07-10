package com.java.general.study;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimezoneConversionExample {

    public static void main(String[] args){

        Date today =  new Date();

        //displaying the date in timezone format
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:SS Z");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

        String IST =  df.format(today);
        System.out.println("Date in the Indian Timezone (IST)"+IST);

        df.setTimeZone((TimeZone.getTimeZone("America/New_York")));
        String EST = df.format(today);
        System.out.println("Date in the America Timezone (EST)"+EST);
    }
}
