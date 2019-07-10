package com.java.general.study;

public class AbstractClassConstructorImplementation extends AbstractClassConstructor{

     int age ;
    public AbstractClassConstructorImplementation(String name,int rollno , int age){
         super(rollno,name);
         this.age=age;
        System.out.println("AbstractClassConstructorImplementation class constructor method :" + this.hashCode());
    }

    @Override
    void doMessageTesting() {
        System.out.println("AbstractClassConstructorImplementation.doMessageTesting-- In the Child Class");
    }
}
