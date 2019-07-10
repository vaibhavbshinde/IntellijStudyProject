package com.java.general.packagescope;

/**
 * this class created as singleton object class by making its consturctor as private
 *
 *
 */
public class SingleToneObjectClass {

    private static SingleToneObjectClass single_instance = null;


    private  SingleToneObjectClass(){
        System.out.println("Instance is same for all creating instances :"+this.getClass().hashCode());
    }


    public static SingleToneObjectClass getInstance()
    {
        if (single_instance == null)
            single_instance = new SingleToneObjectClass();
       return single_instance;
    }

    public static void main(String[] args){
        SingleToneObjectClass x = new SingleToneObjectClass();
        SingleToneObjectClass y = new SingleToneObjectClass();
        SingleToneObjectClass z = new SingleToneObjectClass();
   }


}
