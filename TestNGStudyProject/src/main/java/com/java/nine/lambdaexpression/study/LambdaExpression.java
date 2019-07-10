package com.java.nine.lambdaexpression.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaExpression {

    public static void main(String[] args) {

        List<String> list =  new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        //print arraylist by using basic forloop/enhance for loop/iterator
        // Basic for loop
        //	for(int i=0;i<list.size();i++){
        //	    System.out.println(list.get(i));
        //	}


        // Enhance for loop
        //		for(String s : list){
        //			System.out.println(s);
        //		}


       // list.forEach(System.out::println);
        /// Lambda Expression
        list.forEach(n->System.out.println(n));

        Map hm = new HashMap();
        hm.put(1, "Kedar");
        hm.put(2, "Kedar2");
        hm.put(3, "Kedar3");
        hm.forEach((k,v)->System.out.println(k +" "+v));

    }
}
