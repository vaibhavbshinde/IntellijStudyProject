package com.java.general.study;

public class TestGenericStudy {

    public static void main(String[] args){

       // Generic study with String object
        GenericStudy<String> g1 = new GenericStudy<String>("vaibhav");
        g1.show();
        System.out.println(g1.getObj());

      //generic study with INT object
        GenericStudy<Integer> g2 = new GenericStudy<Integer>(10);
        g2.show();
        System.out.println(g2.getObj());

        //generic study with Double object
        GenericStudy<Double> g3 = new GenericStudy<Double>(10.5);
        g3.show();
        System.out.println(g3.getObj());

    }
}
