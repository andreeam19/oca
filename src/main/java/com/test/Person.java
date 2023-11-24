package com.test;


import static com.test.Car.speedLimit;

public class Person {

    public String name;
    public static int CASS;

    Person(String name){
        this.name=name;
    }

    static {
        CASS=100;
    }


    public static void main(String[] args) {
        CASS=564;
        Person p1=new Person("Aurel");
        Person p2=new Person("Mirel");
        Person p3=new Person("Ionel");

        System.out.println(speedLimit);
    }

    public String toString(){
        return "name "+name+", CASS "+CASS;
    }
    public String getName(){
        return name;
    }
}
