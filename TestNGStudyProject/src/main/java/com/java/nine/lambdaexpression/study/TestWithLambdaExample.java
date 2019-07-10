package com.java.nine.lambdaexpression.study;


public class TestWithLambdaExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		/* Benifits :
		 * it creates the implementation of interface
		 * On the fly it creates instance of object of implementation class
		*/
        Drawable d3 = ()->System.out.println("Drawing with Lambda");
        d3.draw();

        Sayable s1 = ()->System.out.println("Saying with Lambda with sayable interface");
        s1.say();

        //Based on the rule which dont have return type
        Sayable2 s2 =name->System.out.println("Saying with Lambda : "+name);
        s2.say("vaibhav");


        //Based on the rule which has return type
        Sayable3 s3 =name->name;
        System.out.println(s3.say("vaibhav"));

      /*
       * Addable a1 = (a, b)->System.out.println("Adding values of (a+b) :"+(a+b));
       * a1.add(10, 20);
       */

        Addable a1 = (a, b)->a+b;
        System.out.println("Adding values WITH of (a+b) :"+a1.add(10, 20));

    }
}

