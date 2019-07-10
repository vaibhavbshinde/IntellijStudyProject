package com.java.general.study;

public class PrintTriangle {

    public static void drawPyramidPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /**
   Output :
          *
         * *
        * * *
       * * * *
      * * * * *
**/


    public static void drawPyramidPattern1() {
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/**
 Output :
 *
 * *
 * * *
 * * * *
 * * * * *

 **/


public static void drawPyramidPattern2() {
    for (int i =0;i<5;i++){
        for (int j =5;j>i; j--){
            System.out.print("* ");
        }
        System.out.println();
    }

}
/**
     Output :
     * * * * *
     * * * *
     * * *
     * *
     *

**/

    public static void main(String[] args){
        //drawPyramidPattern();
        //drawPyramidPattern1();
        drawPyramidPattern2();
    }
}
