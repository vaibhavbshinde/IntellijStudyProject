package com.java.nine.lambdaexpression.study;


public class TestLambdaExpressionThread {
    public static void main(String[] args)
    {
		/*Runnable r= new  ThreadImpl();
		 * Thread t1 = new Thread(r);
		 * t1.start();
		 */

        Runnable r1 = ()->System.out.println("Hi.....");
        Thread t1 = new Thread(r1);
        t1.start();

        //Functional As a parameter i.e inline function
        new Thread(()->System.out.println("Hi...")).start();
    }

}
