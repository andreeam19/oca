package com.test.test;

public class Person {

    static int ceva = 22;
    private String name;

    public Person(String name){
        this.name = name;
    }

    String getName() {
        return name;
    }

    public static int getCode() {
        return 11;
    }


    public static void main(String[] args) {
        Person p = new Person("Adi");
        p.getName();

        Person p2 = new Person("Andreea");
        p2.getName();

        Person.getCode();
    }
}
