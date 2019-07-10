package com.java.general.study;

import java.util.*;

public class TestHashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> v = new HashMap<>();
        System.out.println("intially size : "+v.size());
        v.put(101,"Vaibhav");
        v.put(1,"vishal");
        v.put(110,"Amit");
        v.put(3,"Sandy");
        v.put(2,"Shivraj");
        v.put(null,null); /// can be inserted null as key only once
        v.put(322,null); // values can be updated multiple times


        System.out.println(v.put(110,"Pachore"));  // it will return old value as key is already present. new value replaced with new value

        System.out.println(v);

        // Now here updating the NUll Key value
        v.put(null,"HA-HA-Added-to-NULL");

        System.out.println("Returning value from using key "+ v.get(101));

        System.out.println("Checking whether Map is empty or not : "+v.isEmpty());
        System.out.println("Checking Size of Map before removing key#3 : "+v.size());
        //removing the object using object key
        v.remove(3);  /// here "sandy" object is gets removed

        System.out.println("Checking Size of Map : "+v.size());


        System.out.println("ContainsKey Value result : "+v.containsKey(101));


        //Collection views of Map
        System.out.println("====================================================");
        Set s =  v.keySet();
        System.out.println("Returning the  only Keys (which is known collection views of map)"+s);

        Collection c= v.values();
        System.out.println("Returning the  only values (which is known collection views of map )"+c);

        Set s1 = v.entrySet();
        System.out.println("Returning the  entry set (which is known collection views of map)"+s1);

        System.out.println("====================================================");


        Set s2 = v.entrySet();
        Iterator itr =  s2.iterator();
        while(itr.hasNext()){
            //System.out.println(itr.next());
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey()+ " --- "+ m1.getValue());


             if(m1.getKey().equals(2))
            {
                m1.setValue("ChangedNameHere");
            }
        }

        System.out.println(v);

    }


}
