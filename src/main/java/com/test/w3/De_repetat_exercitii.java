package com.test.w3;

import java.util.Scanner;

public class De_repetat_exercitii {
    public static void main(String[] args) {
        ex5();
    }

    //1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. (read temperature from console.
    //formula:    celsius = (5 * (fah-32))/9)
    //test data:   212 fah = 100 celsius

    public static void ex1() {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a degre in Fahrenheit:  ");
        double fahrenheit = input.nextDouble();

        double celsius = ((5 * (fahrenheit - 32)) / 9);

        System.out.println(fahrenheit + "degree in Fahrenheit is equal to " + celsius + " celsius");

    }


    // 1234
    // 1234 % 10 = 4
    // 1234 / 10 = 123
    // 123 % 10 = 3
    // 123 / 10 = 12
    //2. Write a Java program that reads an integer between 0 and 100000 and adds all the digits in the integer.
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer betweeen 0 and 1000:");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }

        System.out.println("The sum of all digits in " + number + " is " + sum);
    }


    //3. Write a Java program to convert minutes into a number of years and days.
    public static void ex3() {
        double minutesInYear = 60 * 24 * 365;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your number of minutes: ");
        double min = scanner.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) ((min / 60 / 24) % 365);

        System.out.println((int) min + "minutes is approximately " + years + " years and " + days + " days");
    }


    //
    //4. Take three numbers from the user and print the greatest number.
    public static void ex4() {
        Scanner in = new Scanner(System.in);

        System.out.println("Imput the 1st number: ");
        int num1 = in.nextInt();

        System.out.println("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.println("Input the 3rd number: ");
        int num3 = in.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The greatest :" + num1);
            } else {
                System.out.println("The greatest :" + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("The greatest :" + num2);
            } else {
                System.out.println("The greatest :" + num3);
            }
        }


        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("The greatest : " + num2);
            }
        }
        if (num3 > num1) {
            if (num3 > num2) {
                System.out.println("The greatest : " + num3);
            }
        }
    }

    //5. Write a Java program that reads a floating-point number
    // and prints "zero" if the number is zero.
    //Otherwise, print "positive" or "negative". Add "small" if the
    // absolute value of the number is less than 1,or "large" if it exceeds 1,000,000.
    public static void ex5() {


        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = in.nextInt();

        if (num == 0) {
            System.out.println("zero");
        }

        if (num > 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }

        if (Math.abs(num) > 1000000) {
            System.out.println("large");
        }
        if (Math.abs(num) < 1) {
            System.out.println("small");
        }

    }
}
