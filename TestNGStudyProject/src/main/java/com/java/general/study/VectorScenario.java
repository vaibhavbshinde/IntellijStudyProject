package com.java.general.study;

import java.util.Enumeration;
import java.util.Vector;

public class VectorScenario {

    public static void main(String[] args){
        Vector vector = new Vector();
        vector.addElement("vaibhav");
        vector.addElement("vishal");
        vector.addElement(10);
        vector.addElement("vaibhav");

        // Get Enumeration of Vector elements
        Enumeration en = vector.elements();
        System.out.println("Vector Elements are : ");
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

    }
}
