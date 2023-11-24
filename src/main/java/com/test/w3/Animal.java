package com.test.w3;

public class Animal {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    Animal(String name){
        this.name=name;
        System.out.println("I have an animal "+name);

    }
    Animal(){
    }
}

