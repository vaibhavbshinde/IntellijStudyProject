package com.java.general.study;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.*;


public class SortCollection {
    public static void main(String args[]){
        // Sorting of ArrayyList using collections
        ArrayList<String> al = new ArrayList<>();
    //    ArrayList al = new ArrayList();
        al.add("Vaibhav");
        al.add("Abhi");
        al.add("Amit");
        al.add("Prakash");
        al.add("AAAi");

        //al.add(10); // When we add hetrogenous object then we getting class cast exception
        /**
         * Exception in thread "main" Print values in arraylist[Vaibhav, Abhi, Amit, Prakash, 10]
         java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
         at java.lang.Integer.compareTo(Integer.java:52)
         at java.util.ComparableTimSort.binarySort(ComparableTimSort.java:262)
         at java.util.ComparableTimSort.sort(ComparableTimSort.java:189)
         at java.util.Arrays.sort(Arrays.java:1312)
         at java.util.Arrays.sort(Arrays.java:1506)
         at java.util.ArrayList.sort(ArrayList.java:1454)
         at java.util.Collections.sort(Collections.java:141)
         at com.java.general.study.SortCollection.main(SortCollection.java:23)
         */


       System.out.println("Print values in arraylist"+al);   //[Vaibhav, Abhi, Amit, Prakash]
       //using Collections sort method
        //Collections.sort(al);

       //using collections sort method with MyComparator
       //Collections.sort(al,new SortCollectionComparator());


        //sorting through the sort method of arraylist
        al.sort(new SortCollectionComparator());
        System.out.println("Print values in arraylist After Arraylist"+al); //[Abhi, Amit, Prakash, Vaibhav]


    }



}


