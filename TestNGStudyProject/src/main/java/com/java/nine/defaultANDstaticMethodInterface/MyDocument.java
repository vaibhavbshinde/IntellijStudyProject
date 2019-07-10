package com.java.nine.defaultANDstaticMethodInterface;

public class MyDocument implements Openable,Closable {

    @Override
    public void close(String str) {
        System.out.println(str+"This is method from closable interface implemented in the implementation class");

    }

    @Override
    public void open(String str) {
        System.out.println(str+"This is method from Openable interface implemented in the implmentation class");
    }

    public static void main(String args[]){
        MyDocument m1 = new MyDocument();
        m1.open("Calling Openable implemmented Method");
        m1.close("Calling Closeable implmented method");
        m1.logInOpenable("Openable");
        m1.logInClosable("Closeable");
        Openable.dispOpenableDetails("Static Display method from Openable Interface");
    }
}
