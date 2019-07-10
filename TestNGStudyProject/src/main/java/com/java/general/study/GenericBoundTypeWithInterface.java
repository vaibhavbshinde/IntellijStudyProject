package com.java.general.study;

public class GenericBoundTypeWithInterface <T extends Runnable> {

    public static void  main(String[] args){

        GenericBoundTypeWithInterface<Thread> t1 = new GenericBoundTypeWithInterface<>();
        System.out.println("Valid bound type :"+t1.getClass().getName());

        GenericBoundTypeWithInterface<Runnable> r1 = new GenericBoundTypeWithInterface<>();
        System.out.println("Valid bound type :");

        //GenericBoundTypeWithInterface<String> s1 =  new GenericBoundTypeWithInterface<>();
        // Expected Error is
        //  Error:(13, 39) java: type argument java.lang.String is not within bounds of type-variable T

    }
}
