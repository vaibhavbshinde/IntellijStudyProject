package com.java.general.packagescope;

/**
 * here we cant define outer class as private , but inner class we can
 * this scope is applicable for inner class , variables, methods, interfaces , and constructor
 *
 */


public class PrivateScope {

    private void privateMethodScope(){
        System.out.println("here trying out method scope... its scope private so not accessible");
    }
}
