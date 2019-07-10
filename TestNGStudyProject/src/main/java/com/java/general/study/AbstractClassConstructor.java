package com.java.general.study;

abstract public class AbstractClassConstructor {
    int rollno ;
    String name ;

    public AbstractClassConstructor (int rno ,String name ){
        this.rollno = rno;
        this.name = name;
        System.out.println("AbstractClassConstructor constructor of parent class"+ this.hashCode());
    }

    abstract void doMessageTesting();


}
