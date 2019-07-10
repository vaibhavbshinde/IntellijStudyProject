package com.java.general.study;

import java.util.*;

public class SortCollectionWithLinkedListObject {


    public static void main(String[] args) {
        List<Employee> emplist = new LinkedList<>(Arrays.asList(new Employee(901, "name901"), new Employee(501, "AAA"), new Employee(250, "ZZZ")));

        System.out.println("Before sorting LinkedList" + emplist);



        //Sorting on the Ascending order on Employee Id column
        Collections.sort(emplist,new SortCollectionLinkedListComparator());
        System.out.println("After sorting LinkedList on Employee EID" + emplist);

        // sorting the with STRING
        Collections.sort(emplist, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.get_ename().compareTo(o2.get_ename());
            }
        });

        System.out.println("After sorting LinkedList on EmpName" + emplist);
   }
}
