package com.test.JavaIntermediate;

//un contructor face obiecte
//daca tot ce e in jur sunt obiecte, putem programam orice obiect in calculator
public class Shirt {
    public   static String color;
    public static char size;


    Shirt(){}

    Shirt(String newColor, char newSize){
        color=color;
        size=size;

    }
    public static void putOn() {
        System.out.println("Shirt is on!");
    }

    public static void takeOff() {
        System.out.println("Shirt is off!");


    }
    public static void setColor(String newColor){
        color=newColor;
    }
    public static void setSize(char newSize){
        size=newSize;
    }
}
