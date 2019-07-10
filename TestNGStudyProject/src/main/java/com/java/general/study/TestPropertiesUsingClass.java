package com.java.general.study;

import java.util.Properties;

public class TestPropertiesUsingClass {

    public static void main(String[] args){
        Properties p = System.getProperties();
        p.list(System.out);

        System.out.println( "User Name property Value is : "+p.getProperty("user.name"));

    }
}
