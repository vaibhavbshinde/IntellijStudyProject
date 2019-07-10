package com.java.general.study;

public class Employee {

    private int eid;
    private String ename;


    Employee(int id , String  name){
        this.eid =id;
        this.ename =name;
    }

    public int get_eid(){
        return this.eid;
    }

    public String get_ename(){
        return this.ename;
    }

    @Override
    public String toString() {

       return "Employee{" +
                "name='" + ename + '\'' +
                ", id=" + eid +
                '}';
    }
}
