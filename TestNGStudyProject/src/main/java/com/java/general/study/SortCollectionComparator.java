package com.java.general.study;

import java.util.Comparator;

public class SortCollectionComparator implements Comparator {

    public int compare(Object o1, Object o2) {

       String i1 = (String) o1;
        String i2 = (String) o2;
        return o1.toString().compareToIgnoreCase(o2.toString());

        //in case of default sorting order (Ascending order
   //     return -i1.compareToIgnoreCase(i2);
        //return i1.compareTo(i2);

        //in case of descending order
        //    return -i1.compareTo(i2);

        //incase of desending order with by comparing with i2 instead of i1
        //   return i2.compareTo(i1);

        //in case of ascending order by comparing with -i2 with i1
        //   return -i2.compareTo(i1);

        //is possible with insertion order as it is (which is ideally not possible)
        //   return +1;

        // always reverse order
        //    return -1;

        //duplicates are not allowed scenearios
        //   return 0;




    }
}


