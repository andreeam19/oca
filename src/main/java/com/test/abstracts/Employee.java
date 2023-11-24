package com.test.abstracts;

public abstract class Employee extends Person implements A {
    int id;
    int salary;
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }

}
