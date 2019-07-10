package com.java.general.study;

public class MainMethodOverloading {

    /**
     * main method overloading verification, it can be overloaded , but by default everytime it is gets called
     *  public static void main(String[] args)
     * @param arg1
     */

    public static void main(String arg1) {
        System.out.println("main(String arg1)");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("main(String arg1, String arg2)");
    }
    public static void main(int args) {
        System.out.println("Main overloaded with INT : " +args);
    }

   //public static void main(String[] args){
   public static void main(String... args){ // Make note we can use varagrs instead of String[]
       System.out.println("This is the original test method");

       System.out.println("Here now calling overloaded methods");
       main("only single argument");
       main("argument1","argument2");
       main(10);
   }

}
