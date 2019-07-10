package com.java.general.study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class RuntimeGCTest {

    public static void main (String[] args){
        Runtime r =  Runtime.getRuntime();
        System.out.println("Finding the Free Memory from runtime object : "+ r.freeMemory());
        System.out.println("Finding the Total Memory from runtime object : "+r.totalMemory());
        System.out.println("Finding the Max Memory from runtime object : "+r.maxMemory());
        System.out.println("Available Processor :"+r.availableProcessors());
        for(int i =1 ; i<=80000;i++){
            Date d = new Date();
            d = null;
        }
        System.out.println("Finding the Free Memory from runtime object : "+ r.freeMemory());
        r.gc();
        System.out.println("-------------- AFTER RUNNING GARBAGE COLLECTOR ----------------");
        System.out.println("Finding the Free Memory from runtime object : "+ r.freeMemory());

    }

}
