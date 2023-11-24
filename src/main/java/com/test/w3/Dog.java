package com.test.w3;

public class Dog extends Animal {
    private int teeth;

    Dog() {
        super();
        System.out.println("I am a dog");
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }
    Dog(int teeth, String name){
        super(name);
        this.teeth=teeth;
        System.out.println("Created a dog named "+name+" and he has "+teeth+"teeths");
    }


}
