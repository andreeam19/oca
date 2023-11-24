package com.test.w3.person;

public class Employee extends Person {
    private int id;
    private double salary;

    @Override
    public String toString() {
        return name +" "+ age +" "+ salary;
    }

    Employee(int id, double salary, String name, int age) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.age = age;

        //System.out.println("Constructing employee " + name + " \n age" + age + "\n id " + id + "\nSalary " + salary + "lei");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void hello(String user,int n){
        System.out.println("Salut employee "+ user);
    }
}
