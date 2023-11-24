package com.test.w3;

import java.util.Scanner;

public class ExercitiiSet1 {
    public static void main(String[] args) {
        ex5();
    }

    //1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. (read temperature from console.
    //formula:    celsius = (5 * (fah-32))/9)
    //test data:   212 fah = 100 celsius

    public static void ex1() {
        Scanner in= new Scanner(System.in);

        System.out.println("Input your Fahrenheit number:");
        int fah=in.nextInt();

        int celsius=((5*(fah-32))/9);

        System.out.println( fah+ " Fahrenheit are "+ celsius+ " celsius degree");

    }

    // 1234
    // 1234 % 10 = 4
    // 1234 / 10 = 123
    // 123 % 10 = 3
    // 123 / 10 = 12
    //2. Write a Java program that reads an integer between 0 and 100000 and adds all the digits in the integer.
    public static void ex2() {
        Scanner in=new Scanner(System.in);

        System.out.println("Input a integer between 0 and 100000");
        int num= in.nextInt();
        int sum=0;

        while (num>0){
            int lastDigit=num%10;
            sum+=lastDigit;
            num=num/10;

        }
        System.out.println("The sum is: "+sum);

    }


   //3. Write program that prints an array without the first and last element.

    public static void ex3() {
        int[] array = {1, 2, 3, 4, 5, 6};
        for(int i=1;i<array.length-1;i++){
            System.out.println(array[i]);
        }
    }
    //
    //4. Take three numbers from the user and print the greatest number.
    public static void ex4() {
        Scanner in=new Scanner(System.in);

        System.out.println("Input 1-st number:");
        int num1= in.nextInt();

        System.out.println("Input 2-nd number: ");
        int num2= in.nextInt();

        System.out.println("Input 3-rd number: ");
        int num3= in.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("The greatest is "+num1);
            }else{
                System.out.println("The greatest is "+num3);
            }
        }else{
            if(num2>num3){
                System.out.println("The greatest is "+num2);
            }else{
                System.out.println("The greatest is "+num3);
            }
        }


    }

    //5. Write a Java program that reads a floating-point number
    // and prints "zero" if the number is zero.
    //Otherwise, print "positive" or "negative". Add "small" if the
    // absolute value of the number is less than 1,or "large" if it exceeds 1,000,000.
    public static void ex5() {

        Scanner in=new Scanner(System.in);

        System.out.println("Input a number:");
        int num= in.nextInt();

        if(num==0){
            System.out.println("zero");
        }
        if(num>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
        if(Math.abs(num)<1){
            System.out.println("less");
        }else if(Math.abs(num)>1000000){
            System.out.println("large");
        }


    }
}
