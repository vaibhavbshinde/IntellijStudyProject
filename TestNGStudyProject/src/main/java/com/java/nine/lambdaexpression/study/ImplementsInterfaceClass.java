/*
 * Lambda Expression Using here for testing
 */
package com.java.nine.lambdaexpression.study;

public class ImplementsInterfaceClass{

public static void main(String[] args){
    //This is the implementation of lambda expression
    InterfaceStudy i1 = (a,b) -> a+b;
    System.out.println("Lambda expression testing with sample study : "+i1.calculate(10,20) );
}

}
