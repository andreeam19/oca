package com.test.w3.person;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee(1,35.2, "Andrei", 31);
        e1.hello("Abc");

        Person p1=new Person("Andreea",19);
        p1.hello("ghi");
    }
}
