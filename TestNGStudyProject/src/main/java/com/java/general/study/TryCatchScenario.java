package com.java.general.study;

public class TryCatchScenario {

    public void doStuff()
    {
        System.out.println("in dostuff method");
        doMoreStuff();
    }

    public void doMoreStuff()
    {
        System.out.println("in domore stuff method");

        System.out.println("raising exception:"+ 10/0);
    }


}
