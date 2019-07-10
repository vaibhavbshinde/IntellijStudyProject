package com.java.general.study;

public class GenericTestColor <R, G, B> {
    R red;
    G green;
    B blue;

    public GenericTestColor(R red, G green, B blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public static void main(String[] args){

        GenericTestColor<String,String,String> obj1 = new GenericTestColor<>("DarkRedColor", "DarkGreenColor","DarkBlueColor");
        System.out.println("First Type Object : "+obj1.red);
        System.out.println("Second Type Object : "+obj1.green);
        System.out.println("Third Type Object : "+obj1.blue);

    }

}
