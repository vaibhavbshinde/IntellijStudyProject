package com.java.general.study;

import java.time.LocalDate;

public class RuntimeDemo {

    public static void main(String args[]){

        Runtime r = Runtime.getRuntime();
        System.out.println("Total Available memory : "+ r.totalMemory());
        System.out.println("Available free memory : "+r.freeMemory());

        System.out.println("Creating the 80000 object to check the memory used");

        for(int i=1; i<=80000;i++ ){
            LocalDate d = LocalDate.now();
           // System.out.println(d);
            d = null;
        }
        System.out.println("Available free memory : "+r.freeMemory());
        r.gc();
        System.out.println("-------------- AFTER RUNNING GARBAGE COLLECTOR ----------------");
        System.out.println("Finding the Free Memory from runtime object : "+ r.freeMemory());

    }
}
