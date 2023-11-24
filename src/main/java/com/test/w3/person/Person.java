package com.test.w3.person;

public class Person {
    protected String name;
    protected int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
       // System.out.println(" I am a person.My name is "+name+" and I am "+age+" years old");

    }
    Person(){
        System.out.println("Constructing person");
    }

    public void hello(String user){
        System.out.println("Salut "+ user);
    }
}
