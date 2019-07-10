package com.java.nine.defaultANDstaticMethodInterface;

@FunctionalInterface
public interface Closable {

    // this is the abstract method so as single method its get created as functional interface
    void close(String str);

    //Adding default method for testing
    default void logInClosable(String str){
     System.out.println(str + "This is the closable method added as default method in the interface");
    }

    static void dispClosableDetails(){
        System.out.println("!!! Method in the closeable details which is static method");
    }

}
