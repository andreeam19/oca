package com.test.daily.done;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    private String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getFirstName(){
        return getName().split(" ")[0];
    }



}
