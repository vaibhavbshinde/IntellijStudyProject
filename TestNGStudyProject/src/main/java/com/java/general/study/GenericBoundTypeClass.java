package com.java.general.study;

public class GenericBoundTypeClass <T extends Number> {
    public static void main(String[] args){


        GenericBoundTypeClass<Integer> unobj1 = new GenericBoundTypeClass<>();
        System.out.println("This is bounded class type parameter as here we are not using:"+unobj1.getClass().getName());


        /*
         * Expected complie time error for Below line
         * Error:(10, 31) java: type argument java.lang.String is not within bounds of type-variable T
         * As String is not bound with Number type
         */
        //GenericBoundTypeClass<String> unobj2 = new GenericBoundTypeClass<>();
        //System.out.println("This is unbounded class type parameter as here we are not using"+unobj2.getClass().getName());
    }
}
