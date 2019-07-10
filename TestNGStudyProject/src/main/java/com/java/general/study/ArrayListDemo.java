package com.java.general.study;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args){
      ArrayList<Object> al = new ArrayList<>();
      al.add("vaibhav");  //String Object
      al.add("vishal");
      al.add(10);  // Integer object
      al.add(null);
      System.out.println(al);
      al.remove(2);
      System.out.println(al);
      al.add(2,"patil");
      al.add("alpha");
      al.set(3,"UpdatedNULL");
      System.out.println(al);


        ListIterator li = al.listIterator();
        while(li.hasNext()){
          System.out.println(li.next());
        }
    }
}
