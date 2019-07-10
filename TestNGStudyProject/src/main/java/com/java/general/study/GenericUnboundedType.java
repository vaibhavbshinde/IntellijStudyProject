package com.java.general.study;

public class GenericUnboundedType<T> {

    public static void main(String[] args) {

        GenericUnboundedType<Integer> unobj1 = new GenericUnboundedType<>();
        System.out.println("This is unbounded class type parameter as here we are not using:"+unobj1.getClass().getName());

        GenericUnboundedType<String> unobj2 = new GenericUnboundedType<>();
        System.out.println("This is unbounded class type parameter as here we are not using"+unobj2.getClass().getName());
    }

}
