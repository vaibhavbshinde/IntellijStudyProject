package com.java.nine.defaultANDstaticMethodInterface;
@FunctionalInterface
public interface Openable {

    //this is the functional interface method
    void open(String Str);

    // this is the default method in the interface which i can used its implmented class
    default void logInOpenable(String str){
        System.out.println("This is the method in the Openable interface: "+str);
    }

    //static method in the interface
    static void dispOpenableDetails(String str){
        System.out.println("*!*   Created Static method in the Openable interface which i can access directly from implementation class");
    }

}
