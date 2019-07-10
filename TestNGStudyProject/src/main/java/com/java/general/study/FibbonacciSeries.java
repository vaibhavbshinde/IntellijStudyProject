package com.java.general.study;

import org.testng.annotations.Test;

public class FibbonacciSeries {

    @Test(alwaysRun = true)
    void printFibbonaciSeries() {
    //public static void main(String[] args){
        System.out.println("Printing the Fibbonacci Serries");
        System.out.print("0 1 ");
        int firstNum = 0, secondNum = 1;
        int temp;
        for (int i = 2; i < 10; i++) {
            temp = firstNum + secondNum;
            System.out.print(temp + " ");

            //swapping the number values for next
            firstNum = secondNum;
            secondNum = temp;
        }
    }

}
