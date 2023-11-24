package com.test.daily;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        ex1();
    }
    //# Exercises set 1
    //1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. (read temperature from console.
    //formula:    celsius = (5 * (fah-32))/9)
    //test data:   212 fah = 100 celsius
    //
    public static void ex1(){
        Scanner in=new Scanner(System.in);
        double fah=in.nextDouble();

        double celsius=((5*(fah-32))/9);

        System.out.printf( fah +" fahrenheit are:  %.2f celsius",celsius);
    }
    //2. Write a Java program that reads an integer greater than 0 and adds all the digits in the integer.
    //Do this for an array of numbers and save results into a new array. Then print that array
    //TEST DATA: int[] array={123,345,567,111111111, 22222, 9090, 1 ,0}


    //4. Write program that prints an array without the midle element.
    //int[] array = {1,2,3,4,5,6};

    public static void ex4(){
        int[] array = {1,2,3,4,5,6};

    }
    //
    //5. Take three numbers from the user and print the greatest number.
    //TODO: use function    int greatest(int n1, int n2)
    public static void ex5(){

    }
    //
    //6. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    //Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,or "large" if it exceeds 1,000,000.
}
