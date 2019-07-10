package com.java.general.packagescope;

public class TestingScope {

    public static void main(String[] args){

        // Testing the private scope methods,
        // as we never declared outer class as private we can access in the package but its method cant
        PrivateScope prvscope =  new PrivateScope();
        //prvscope.privateMethodScope(); // will get compile time error as method has privateaccess scope


        // Testing the default access scope method
        DefaultScope defascope = new DefaultScope();
        defascope.defaultScope(); // this will get access as it is within package.. same class i have copied in "general.study" package where we cant

        //Testing the protected scope
        // this will get access as it is within package.. same class i have copied in "general.study" package where we can as i have inherited class from this class
        ProtectedScope protectedScope = new ProtectedScope();
        protectedScope.testProtectedScope();

    }
}
