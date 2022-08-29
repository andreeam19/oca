package com.test.w3;

import java.util.Scanner;

public class Refacere_Conditional_Statement {
    public class Conditional_Statement {
        public static void main(String[] args) {
            ex4();
        }


        //1. Write a Java program to get a number from the user and print whether it is positive or negative
        //Test Data
        //Input number: 35
        //Expected Output :
        //Number is positive
        public static void ex1() {
            Scanner in = new Scanner(System.in);

            System.out.println("Input number: ");
            int number = in.nextInt();

            if (number > 0) {
                System.out.println("Number is pozitiv");
            } else {
                System.out.println("Number is negativ");
            }


        }

        //2. Write a Java program to solve quadratic equations (use if, else if and else). Go to the editor
        //
        //Test Data
        //Input a: 1
        //Input b: 5
        //Input c: 1
        //Expected Output :
        //The roots are -0.20871215252208009 and -4.7912878474779195
        public static void ex2() {

        }


        //3. Take three numbers from the user and print the greatest number.
        //
        //Test Data
        //Input the 1st number: 25
        //Input the 2nd number: 78
        //Input the 3rd number: 87
        //Expected Output :
        //The greatest: 87

        public static void ex3() {

            Scanner in = new Scanner(System.in);

            System.out.println("Input 1st number:");
            int a = in.nextInt();

            System.out.println("Input 2nd number: ");
            int b = in.nextInt();

            System.out.println("Input 3rd number: ");
            int c = in.nextInt();

            if (a > b && a > c) {
                System.out.println("The greatest : " + a);
            } else if (b > c && b > a) {
                System.out.println("The greatest : " + b);
            } else {
                System.out.println("The greatest: " + c);
            }
        }

        //4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
// Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
// or "large" if it exceeds 1,000,000.
//
//Test Data
//Input a number: 25
//Expected Output :
//Input value: 25
//Positive number
        public static void ex4() {
            Scanner in = new Scanner(System.in);

            System.out.println("Input a number: ");
            int num = in.nextInt();

            if (num == 0) {
                System.out.println("zero");
            }
            if (num > 0) {
                System.out.println("Pozitiv number");
            } else {
                System.out.println("Number is negativ");

            }
            if (Math.abs(num) < 1) {
                System.out.println("small");
            }
            if (Math.abs(num) > 1000000) {
                System.out.println("large");
            }

        }
        //6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places. Go to the editor
//
//Test Data
//Input floating-point number: 25.586
//Input floating-point another number: 25.589
//Expected Output :
//They are different


        //7. Write a Java program to find the number of days in a month. Go to the editor
//
//Test Data
//Input a month number: 2
//Input a year: 2016
//Expected Output :
//February 2016 has 29 days

        //8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant,
        // depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1,
        // print an error message.
        //
        //Test Data
        //Input an alphabet: p
        //Expected Output :
        //Input letter is Consonant


        //9.Write a Java program that takes a year from user and print whether that year is a leap year or not.


        //metoda care primeste un int=varsta , daca e sub 18 ani copil, intre 19 si 63 matur , peste 64 inclusiv-pensionar

        //10. Write a program in Java to display the first 10 natural numbers. Go to the editor
        //
        //Expected Output :
        //
        //The first 10 natural numbers are:
        //
        //1
        //2
        // ...
        //9
        //10


        //11. Write a program in Java to display n terms of natural numbers and their sum. Go to the editor
//
//Input number: 7
//The first n natural numbers are : 7
//1
//2
//3
//4
//5
//6
//7
//The Sum of Natural Number upto n terms : 28
}
