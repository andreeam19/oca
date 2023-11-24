package com.test.w3;

import java.util.Scanner;

public class Recapitulare {

    public static void main(String[] args) {


    }
    //1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. (read temperature from console.
    //formula:    celsius = (5 * (fah-32))/9)
    //test data:   212 fah = 100 celsius


    public static void ex1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number:");
        int fah = in.nextInt();

        int celsius = ((5 * (fah - 32)) / 9);

        System.out.printf(fah + " Fahrenhait are %.2f", celsius);

    }

    // 1234
    // 1234 % 10 = 4
    // 1234 / 10 = 123
    // 123 % 10 = 3
    // 123 / 10 = 12
    //2. Write a Java program that reads an integer between 0 and 100000 and adds all the digits in the integer.

    public static void ex2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number:");
        int num = in.nextInt();
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        System.out.println("the sum of the digits is: " + sum);
    }
    //

    //2bkp-> fa cu o metoda
    public static void ex2bkp() {
        int[] array = {123, 234, 345};
        for (int i = 0; i < array.length; i++) {
            sumOfDigits(array[i]);
        }
    }

    public static void sumOfDigits(int value) {
        int sum = 0;
        int val = value;
        while (value > 0) {
            int lastDigit = value % 10;
            sum += lastDigit;
            value = value / 10;
        }
        System.out.println("Sum of the digits for" + val + " = " + sum);
    }

    //3. Write program that prints an array without the first and last element.
    // int[] array = {1,2,3,4,5,6};
    public static void ex3() {
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }

    ///4. Take three numbers from the user and print the greatest number.
    //citesti de la tastatura fiecare nr si apoi compari intr-un bloc mare
    public static void ex4() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the 1-st number:");
        int num1 = in.nextInt();

        System.out.println("Input the 2-nd number:");
        int num2 = in.nextInt();

        System.out.println("Input the 3-rd number:");
        int num3 = in.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The greatest is" + num1);
            } else {
                System.out.println("The greatest is " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("The greatest is" + num2);
            } else {
                System.out.println("The greatest is " + num3);
            }
        }
    }

    //4bkp1-> fa cu metoda compare
    public static void ex4bkp1() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the 1-st number:");
        int num1 = in.nextInt();

        System.out.println("Input the 2-nd number:");
        int num2 = in.nextInt();

        System.out.println("Input the 3-rd number:");
        int num3 = in.nextInt();

        System.out.println(" The greatest is:" + compare(num1, compare(num2, num3)));

    }

    public static int compare(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    ////5. Write a Java program that reads a floating-point number
    //    // and prints "zero" if the number is zero.
    //    //Otherwise, print "positive" or "negative". Add "small" if the
    //    // absolute value of the number is less than 1,or "large" if it exceeds 1,000,000.
    public static void ex5() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your number:");
        double num = in.nextDouble();

        if (num == 0) {
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


    ////SET 2!!!!!!!!!!

    //1. Write a program to print all odd numbers from 10 to 30.
    public static void ex6(){
        for(int i=9;i<=30;i++){
           if(i%2==0){
               System.out.print(i+" ");
           }
        }
    }

    //2. Write a program that reads a number from input and adds all numbers up to it.
    public static void ex7(){
        Scanner in=new Scanner(System.in);
        System.out.println("Input your number:");
        int num= in.nextInt();
        int sum=0;

        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println("The sum is: "+sum);
    }
    //3. Write a program that reverses a String input.

    public static void ex8(){
        String str="1234567";
        char[] array= str.toCharArray();
        char[] array2=new char[array.length];
        for(int i=array.length-1;i>=0;i--){
            array2[i]=array[i];
            System.out.print(array2[i]);
        }
    }

    //4. Write a program that prints the elements of next array int array[] = {1,2,3,4,5,5,6,7,8,9};
    public static void ex9() {
        int array[] = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        int []newArray=new int[array.length];

        for(int i=array.length-1;i>=0;i--){
            newArray[i]=array[i];
            System.out.print(newArray[i]+" ");
        }
    }

    //5. Write a program that prints the sum of all elements of next array: int array[] = {1,2,3,4,5,5,6,7,8,9};
    public static void ex10(){
        int array[] = {1,2,3,4,5,5,6,7,8,9};
        int sum=0;

        for(int i=0;i<=array.length-1;i++){
            sum+=array[i];
        }
        System.out.println("suma este egala cu:"+sum);
    }

}
