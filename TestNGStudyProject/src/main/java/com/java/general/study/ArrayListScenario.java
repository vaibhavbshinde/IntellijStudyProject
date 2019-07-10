package com.java.general.study;
import java.util.*;

public class ArrayListScenario {

    public static void main(String args[])
    {

        ArrayList al =  new ArrayList();
        al.add(0,"abc");
        al.add(1,"def");
        al.add(2,"ghi");


        System.out.println("size of the arraylist is :"+ al.size());

        System.out.println(al);

        for(int i=0; i<al.size();i++) {
            System.out.println(al.get(i));
         //   al.remove(i);
        }

         // Using the Iterator
        System.out.println("Using iterator");
        Iterator iterator =  al.iterator();
        while(iterator.hasNext())
        {
             System.out.println(iterator.next());
        }



    }

}
