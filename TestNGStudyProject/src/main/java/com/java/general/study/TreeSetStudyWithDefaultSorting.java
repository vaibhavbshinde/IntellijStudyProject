package com.java.general.study;

import java.util.TreeSet;

public class TreeSetStudyWithDefaultSorting {

   public static void main(String[] args){
       TreeSet treeSet =  new TreeSet();
       treeSet.add("10");
       treeSet.add("0");
       treeSet.add("15");
       treeSet.add("20");
       treeSet.add("20");

       System.out.println(treeSet);

       TreeSet treeSet1 =  new TreeSet();
       treeSet1.add("Z");
       treeSet1.add("B");
       treeSet1.add("A");
       treeSet1.add("C");
       treeSet1.add("a");

       System.out.println(treeSet1);

   }
}

/*
 *Here Expected out is : [0,10,15,20]
 * As per the treeset rule ,by default ascending order in caseof number  and duplicates are not allowed
 * As per the treeset rule ,by default alphabetical order in case of characters and duplicates are not allowed,
 * please note while doing alphabetical sorting it is considering its hashcode value. so "A" is 65, and "a" is 97.
 */