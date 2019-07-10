package com.java.general.study;

public class GenericStudy <T>{

    T obj;

    GenericStudy(T obj){
        this.obj = obj;
    }

    public  void show(){
        System.out.println("The type of object : "+ obj.getClass().getName());
    }

   public T getObj()
   {
       return this.obj;
   }
}
