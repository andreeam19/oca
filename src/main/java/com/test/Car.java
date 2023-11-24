package com.test;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public String name;
    public static final int speedLimit = 100;

    Car() {

    }

    Car(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "com.test.Car " + name + ", speedLimit = " + speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        Car c2 = new Car("Audi");
        Car c3 = new Car();

        List<Car> cars = new ArrayList<>();
        swap(c1,  c2);
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        for (Car c : cars) {
            System.out.println(c);
        }

        System.out.println(add(1,2,3,4,5));


    }
    static void swap(Car c1,Car c2){
        String temp=c1.getName();
        c1.setName(c2.getName());
        c2.setName(temp);
    }

    static int add(int ...a) {
        int sum=0;
        for(int i : a) {
            sum+=i;
        }
        return sum;
    }

}

