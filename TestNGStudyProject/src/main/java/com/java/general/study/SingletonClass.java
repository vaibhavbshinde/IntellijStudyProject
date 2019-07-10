package com.java.general.study;


public class SingletonClass {

    private static SingletonClass myobj;

    static {
        myobj = new SingletonClass();
    }

    private SingletonClass() {
        // Empty Constructor here it is marked as private
    }

    public static SingletonClass getInstanceId() {
        return myobj;
    }

    public void readObjDetails(){
        System.out.println("created object instance is : "+ myobj.getClass().hashCode());
     }

     public static void main(String[] args){
         SingletonClass s1 = new SingletonClass();
         s1.readObjDetails();

         SingletonClass s2 = new SingletonClass();
         s2.readObjDetails();
     }

}
