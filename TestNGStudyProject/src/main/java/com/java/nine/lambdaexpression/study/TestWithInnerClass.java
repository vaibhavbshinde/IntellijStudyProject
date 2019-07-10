package com.java.nine.lambdaexpression.study;


public class TestWithInnerClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Drawable d1 = new Drawable(){
            public void draw()
            {
                System.out.println("Drawing with Annonymus Inner class");
            }
        } ;
        d1.draw();
    }

}
