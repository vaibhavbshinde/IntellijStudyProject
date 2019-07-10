package com.java.general.study;

import java.util.Comparator;

public class SortCollectionLinkedListComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2){
        if(e1.get_eid()<e2.get_eid()){
            return -1;
        }else{
            return 1;
        }
    }
}
