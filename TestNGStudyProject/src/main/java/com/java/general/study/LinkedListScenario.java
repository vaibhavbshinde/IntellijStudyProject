package com.java.general.study;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListScenario {

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.add(0,"1231");
        ll.add(1,"vishal");
        ll.addFirst("amit131312");
        ll.addLast("jevan3543543");
        ll.removeLast();

        ListIterator li = ll.listIterator();

        while(li.hasNext())
        {
            System.out.println(li.next());
            if(li.next().equals("vaibhav")){
               // li.remove();
            }
        }

    }
}
