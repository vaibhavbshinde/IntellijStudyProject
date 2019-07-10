package com.java.general.study;

abstract public class AbstratTestScenario {

    public void displayMessage(){
        System.out.println("This is the displayed method");
    }

     abstract public int testcount(int x , int y);

     final public int parentMethodCantOverride(int z)
     {
         System.out.println("this is method in the parent class with Final Modifier "+ z);
         return z;
     }

}
