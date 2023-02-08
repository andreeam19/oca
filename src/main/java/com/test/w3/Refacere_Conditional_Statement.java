package com.test.w3;

import java.util.Scanner;

public class Refacere_Conditional_Statement {

    public static void main(String[] args) {
        ex30();
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
    //6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to
    // three decimal places. Go to the editor
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

    public static void ex8() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input an alphabet: ");
        String letter = in.next();


    }


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
    public static void ex10() {
        System.out.println("The first 10 natural numbers are: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

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
    public static void ex11() {
        int sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Input number:");
        int n = in.nextInt();

        System.out.println("The first  nnatural numbers are : " + n);
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of Natural Number up to n termis: " + sum);
    }

    //12. Write a program in Java to input 5 numbers from keyboard and find their sum and average. Go to the editor
    //
    //Test Data
    //Input the 5 numbers : 1 2 3 4 5
    //Expected Output :
    //
    //Input the 5 numbers :
    //1
    //2
    //3
    //4
    //5
    //The sum of 5 no is : 15
    //The Average is : 3.0
    public static void ex12() {

        Scanner in = new Scanner(System.in);

        int sum = 0;
        double average;

        System.out.println("Input the 5 numbers");

        for (int i = 0; i < 5; i++) {
            sum += in.nextInt();
        }
        average = sum / 5;
        System.out.println("The sum of 5 no is:" + sum);
        System.out.println("The average is :" + average);

    }

    //13. Write a program in Java to display the cube of the number upto given an integer. Go to the editor
    //
    //Test Data
    //Input number of terms : 4
    //Expected Output :
    //
    //Number is : 1 and cube of 1 is : 1
    //Number is : 2 and cube of 2 is : 8
    //Number is : 3 and cube of 3 is : 27
    //Number is : 4 and cube of 4 is : 64
    public static void ex13() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of terms:");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Number is : " + i + " and the cube of " + i + " is " + (i * i * i));
        }

    }
    //14. Write a program in Java to display the multiplication table of a given integer. Go to the editor
    //
    //Test Data
    //Input the number (Table to be calculated) : Input number of terms : 5
    //Expected Output :
    //
    //5 X 0 = 0
    //5 X 1 = 5
    //5 X 2 = 10
    //5 X 3 = 15
    //5 X 4 = 20
    //5 X 5 = 25

    public static void ex14() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of terms: ");
        int n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    //15. Write a program in Java to display the n terms of odd natural number and their sum. Go to the editor
//
//Test Data
//Input number of terms is: 5
//Expected Output :
//
//The odd numbers are :
//1
//3
//5
//7
//9
//The Sum of odd Natural Number upto 5 terms is: 25
    public static void ex15() {

        int sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Input number of terms: ");
        int n = in.nextInt();

        //System.out.println("The odd numbers are: ");
//        for(int i=1;i<=n*2;i+=2){
//            System.out.println(i);
//            sum+=i;
//        }
        int x = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(x);
            sum += x;
            x += 2;

        }
        System.out.println("suma " + sum);
        //System.out.println("The Sum of odd Natural number up to "+ n+ "terms is: "+ sum );
    }
    //16. Write a program in Java to display the pattern like right angle triangle with a number. Go to the editor
    //
    //Test Data
    //Input number of rows : 10
    //Expected Output :
    //
    //1
    //12
    //123
    //1234
    //12345
    //123456
    //1234567
    //12345678
    //123456789
    //12345678910

    public static void ex16() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input numbers of rows:");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);


            }
            System.out.println(" ");
        }
    }
    //17. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows : Go to the editor
    //
    //1
    //22
    //333
    //4444
    //Click me to see the solution

    public static void ex17() {

        Scanner in = new Scanner(System.in);

        System.out.println(" Input number of rows: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");


        }

    }

    //18. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like : Go to the editor
    //
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    public static void ex18() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input nr of rows:");
        int n = in.nextInt();
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x++);

            }
            System.out.println("");
        }
    }

//19. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row. Go to the editor
//
//       1
//      2 2
//     3 3 3
//    4 4 4 4


    //20. Write a program in Java to print the Floyd's Triangle. Go to the editor
    //
    //Test Data
    //Input number of rows : 5
    //Expected Output :
    //
    //Input number of rows :  5
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15

    public static void ex20() {
        Scanner in = new Scanner(System.in);

        System.out.println(" input nr of rows:");
        int n = in.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println("");
        }
    }
//21. Write a program in Java to display the pattern like a diamond. Go to the editor
//
//Test Data
//Input number of rows (half of the diamond) : 7
//Expected Output :
//
//
//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//*************
// ***********
//  *********
//   *******
//    *****
//     ***
//      *
    //22. Write a Java program to display Pascal's triangle. Go to the editor
    //
    //Test Data
    //Input number of rows: 5
    //Expected Output :
    //
    //Input number of rows: 5
    //      1
    //     1 1
    //    1 2 1
    //   1 3 3 1
    //  1 4 6 4 1

    //30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
    // "All numbers are different" if all three numbers are different and
    // "Neither all are equal or different" otherwise. Go to the editor
    //
    //Test Data
    //Input first number: 2564
    //Input second number: 3526
    //Input third number: 2456
    //Expected Output :
    //
    //All numbers are different
    public static void ex30() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number:");
        int x = in.nextInt();

        System.out.println("Input the second number:");
        int y = in.nextInt();

        System.out.println("Input the third number: ");
        int z = in.nextInt();

        if (x == y && y == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && y != z && z != x) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

