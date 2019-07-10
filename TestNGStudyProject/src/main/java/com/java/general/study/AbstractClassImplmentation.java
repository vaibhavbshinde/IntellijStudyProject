package com.java.general.study;

public class AbstractClassImplmentation extends AbstratTestScenario{

    public int testcount(int x , int y)
    {
        System.out.println("test count is : "+(x+y));
        return x+y;
    }


     void displayChildMethod()
    {
        System.out.println("AbstractClassImplmentation.displayChildMethod");
    }


   /*  here i am commenting the code which i added to test whether can we override final method or not
    public int parentMethodCantOverride(int z)
    {
        System.out.println("here overriding the final method .. trying to understand");
        return z;
    }
    */

    /* expected Result :
     * here when i trying to overrider the "parentMethodCantOverride" method which is on final on the parent class.
     * then compile time error should be get displayed as "Error:(17, 16) java: parentMethodCantOverride(int) in com.java.general.study.AbstractClassImplmentation cannot override parentMethodCantOverride(int) in com.java.general.study.AbstratTestScenario
  overridden method is final"
     */
    public static void main(String[] args)
    {
        AbstractClassImplmentation obj1 =  new AbstractClassImplmentation();
        obj1.displayMessage();
        obj1.testcount(10,20);
        obj1.displayChildMethod();

    }

}
