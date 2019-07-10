package com.java.general.packagescope;

/**
 * This class has been created to test the default scope of the class
 * default scope is applicable for all inner , outer classes, variables, methods and blocks
 * Its scope is only same package level. you cant access outside of the package
 *
 */

class DefaultScope {

    void defaultScope(){
        System.out.println("This method created for to check default scope, it cannot be accessed outside of the package");
    }
}

