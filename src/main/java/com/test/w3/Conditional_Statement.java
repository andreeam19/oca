package com.test.w3;

import java.util.Scanner;

public class Conditional_Statement {


    //1. Write a Java program to get a number from the user and print whether it is positive or negative
    //Test Data
    //Input number: 35
    //Expected Output :
    //Number is positive
    public static void ex1() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number:");
        int num = in.nextInt();

        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");

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
        Scanner in = new Scanner(System.in);

        System.out.println(" Input first number: ");
        double a = in.nextDouble();

        System.out.println("Input second number: ");
        double b = in.nextDouble();
        System.out.println("Input third number: ");
        double c = in.nextDouble();

        double result = b * b - 4 * a * c;
        if (result > 0.00) {
            double r1 = -b + Math.pow(result, 0.5) / (2.0 * a);
            double r2 = -b - Math.pow(result, 0.5) / (2.0 * a);
            System.out.println(" The roots are " + r1 + "and" + r2);

        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is" + r1);
        } else {
            System.out.println("The equation is not ok");

        }
    }

    public static double pow(double e, double x) {
        double result = 1;
        while (x > 0) {
            result = result * e;

            x--;
        }
        return result;


    }

    public static int factorial(int x) {
        int result = 1;
        while (x > 0) {
            result = result + x * (x - 1);
            x = x - 2;

        }
        return result;
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

        System.out.println("Input the 1st number:");
        int num1 = in.nextInt();

        System.out.println("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.println("Input the 3rd number:");
        int num3 = in.nextInt();

        if (num1 > num2)
            if (num1 > num3) {
                System.out.println("The greatest :" + num1);
            }
        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest :" + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest :" + num3);
    }

    public static void ex3bkp1() {
        double num1 = 5.6;
        int num2 = 3;

        System.out.println("The largest number of the two numbers is " + Math.max(num1, num2));
    }
//How to find largest number in an array in Java?


    public static void ex3bkp2() {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 1; i < n; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum value in the array is:" + max);
    }

    public static void ex3bkp3() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the 1st number:");
        int num1 = in.nextInt();

        System.out.println("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.println("Input the 3rd number:");
        int num3 = in.nextInt();

        if (num1 > num2) {
            if (num1 > num3)
                System.out.println("The greatest number is:" + num1);
        } else {
            if (num2 > num3) {
                System.out.println("The greatest number is:" + num2);
            } else {
                System.out.println("The greatest number is" + num3);
            }


        }
    }

    public static void ex3bkp4() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the 1st number:");
        int a = in.nextInt();

        System.out.println("Input the 2nd number: ");
        int b = in.nextInt();

        System.out.println("Input the 3rd number:");
        int c = in.nextInt();

        int max = 0;
        int mid = 0;
        int min = 0;

        if (a > b) {
            if (a > c) {
                System.out.println("The greatest number is: " + a);
                max = a;
            } else {
                System.out.println("The greatest number is: " + c);
                max = c;
            }
        } else if (b > c) {
            System.out.println("The greatest number is: " + b);
            max = b;
        } else {
            System.out.println("The greatest number is : " + c);
            max = c;
        }

        if (max == a) {


            if (b > c) {
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        }
        if (max == b) {
            if (a > c) {
                mid = a;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        }
        if (max == c) {
            if (a > b) {
                mid = a;
                min = b;
            } else {
                mid = b;
                min = a;

            }
        }
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);

    }

    public static void ex3bkp5() {
        int x = 7, y = 3, temp;

        System.out.println("Before: " + x + " , " + y);

        temp = x;
        x = y;
        y = temp;
        System.out.println("After: " + x + " , " + y);
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

        System.out.println("Input a number:");
        float nr = in.nextFloat();

        if (nr > 0) {
            System.out.println("Nr is positive");
            if (nr < 1) {
                System.out.println("pozitiv small number");
            } else if (nr > 1000000) {
                System.out.println("pozitiv large number");
            } else {
                System.out.println("pozitiv number");
            }

        } else if (nr < 0) {
            if (Math.abs(nr) < 1) {
                System.out.println("Negative small number");
            } else if (Math.abs(nr) > 1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative");
            }
        } else {
            System.out.println("Zero");
        }

    }

    //SwitchCases
    public static void ex5bkp1() {
        int day = 3;

        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        }
    }

    public static void ex5bkp2() {
        int day = 3;
        String dayName = "";

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
            case 3:
                System.out.println("Tuesday");
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = " Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day range";

        }
    }

    //6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places. Go to the editor
//
//Test Data
//Input floating-point number: 25.586
//Input floating-point another number: 25.589
//Expected Output :
//They are different
    public static void ex6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input floating-point number:");
        double x = in.nextDouble();

        System.out.println("Input floating-point another number:");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y) {
            System.out.println("They are the same up to three decimal plases");
        } else {
            System.out.println("They are different");
        }
    }

    //7. Write a Java program to find the number of days in a month. Go to the editor
//
//Test Data
//Input a month number: 2
//Input a year: 2016
//Expected Output :
//February 2016 has 29 days
    public static void ex7() {

        Scanner in = new Scanner(System.in);

        int number_of_daysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.println("Input a month number:");
        int month = in.nextInt();

        System.out.println("Input a year: ");
        int year = in.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_of_daysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_of_daysInMonth = 29;
                } else {
                    number_of_daysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_of_daysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_of_daysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_of_daysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_of_daysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_of_daysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_of_daysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_of_daysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_of_daysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_of_daysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_of_daysInMonth = 31;
        }
        System.out.println(MonthOfName + " " + year + "has" + number_of_daysInMonth + "days\n");
    }
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

        System.out.println("Input an alphabet:");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowel = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");

        if (input.length() != 1) {
            System.out.println(" Error. It is not a caracter");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter. Please insert a  uppercase or a lowercase");
        } else if (vowel) {
            System.out.println("Input letter is a vowel");

        } else {
            System.out.println("Input letter is a consonant");
        }


    }


    //9.Write a Java program that takes a year from user and print whether that year is a leap year or not.
    public static void ex9() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input the year: ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is not a leap year");
        }


    }

    //metoda care primeste un int=varsta , daca e sub 18 ani copil, intre 19 si 63 matur , peste 64 inclusiv-pensionar
    public static void varsta() {


        Scanner in = new Scanner(System.in);

        System.out.println("Introdu varsta : ");
        int varsta = in.nextInt();

        if (varsta < 18) {
            System.out.println("copil");

        } else if (varsta < 64) {
            System.out.println("matur");
        } else {
            System.out.println("pensionar");
        }

    }

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

        Scanner in = new Scanner(System.in);

        System.out.println("The first 10 natural numbers are :");


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
        int n;
        int sum = 0;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Input a number: ");
            n = in.nextInt();
        } while (n < 0);

        System.out.println("The first n natural numbers are: " + n);

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number upto n terms :" + sum);

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
        int sum = 0;
        int num = 0;
        Scanner in = new Scanner(System.in);
        System.out.println(" Input the 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            num = in.nextInt();
            sum += num;
        }
        double average = sum / 5;
        System.out.println("The sum is : " + sum + " and the average is " + average);
    }

    public static void ex12bkp() {
        //for cu citire in conditii

        int n = -1;

        for (Scanner scanner = new Scanner(System.in); n < 0; n = scanner.nextInt()) {
            System.out.println("Current n=" + n + ". Insert positive n!!");
        }
        System.out.println("final n=" + n);
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
        int i, n;

        Scanner in = new Scanner(System.in);

        System.out.println(" Input number of the terms: ");
        n = in.nextInt();

        for (i = 0; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Number is : " + n + "and the cube of " + n + " is : " + cube);
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


        System.out.println("Input the number(Table to be calculated): Input number of terms : ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
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

        System.out.println("Input number of terms :");
        int n = in.nextInt();
        System.out.println("The odd numbers are : ");

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                sum += i;
            }

        }
        System.out.println("The Sum of odd Natural Number upto " + n + "terms is:" + sum);
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
        int i, j, n;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows : ");
        n = in.nextInt();

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }

    }

    public static void ex16bkp() {
        int i, n;
        String x = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows: ");
        n = in.nextInt();

        for (i = 1; i <= 10; i++) {
            x += i;
            System.out.println(x);

        }
    }

    //17. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number
    // in a row.The pattern is as follows :
    //
    //1
    //22
    //333
    //4444
    public static void ex17() {
        int n, i, j;

        Scanner in = new Scanner(System.in);

        System.out.print("Input number of n: ");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);


            }
            System.out.println();
        }
    }

    //18. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like : Go to the editor
    //
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    public static void ex18() {
        int i, j;
        int num = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Input numbers of rows: ");
        int n = in.nextInt();


    }

    //19. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row. Go to the editor
    //
    //       1
    //      2 2
    //     3 3 3
    //    4 4 4 4
    public static void ex19() {

        int i;

        Scanner in = new Scanner(System.in);
        System.out.println("Input number of rows :");
        int n = in.nextInt();

        for (i = 2; i >= 0; i--) {
            int k = 3;
            for (int j = i; j > 0; j--) {

                System.out.print("*");
            }
            for (int x = k - 2; x <= 3; x++) {
                System.out.print(k - i);
            }

            System.out.println();
        }

    }

    public static void ex19bkp() {
        int n, i, j, s;

        Scanner in = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        n = in.nextInt();

        s = n - 1;
        for (i = 1; i <= n; i++) {
            for (int x = s; x != 0; x--) {
                System.out.print("*");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + "*");

            }
            System.out.println();
            s--;
        }
    }


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

        System.out.println("Input number of rows :");
        int numberofRows = in.nextInt();
        int number = 1;
        for (int row = 1; row <= numberofRows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
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
    public static void ex21() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows(half of the diamond): ");
        int size = in.nextInt();

        int whitespaces = size - 1;
        int stelute = 1;

        //pune toate randurile
        for (int x = 0; x < size; x++) {
            //pune spatiile
            for (int i = 0; i <= whitespaces; i++) {
                System.out.print(" ");
            }

            //pune stelute
            for (int j = 0; j < stelute; j++) {
                System.out.print("*");
            }
            System.out.println();
            whitespaces--;
            stelute = stelute + 2;
        }
        for (int x = size; x >= 0; x--) {
            //pune spatii
            for (int i = 0; i <= whitespaces; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stelute; j++) {
                System.out.print("*");
            }
            System.out.println();
            whitespaces++;
            stelute = stelute - 2;
        }


    }

    //23. Write a java program to generate a following *'s triangle. Go to the editor
    //
    //Test Data
    //Input the number: 6
    //Expected Output :
    //
    //******
    // *****
    //  ****
    //   ***
    //    **
    //     *
    public static void ex23() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input the number: ");
        int n = in.nextInt();

        for (int i = n; i > 0; i--) {
            //pune spatii
            for (int x = n - i; x > 0; x--) {
                System.out.print(" ");
            }
            //pune stelute
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //24. Write a java program to generate a following @'s triangle. Go to the editor
    //
    //Test Data
    //Input the number: 6
    //Expected Output :
    //
    //      @
    //     @@
    //    @@@
    //   @@@@
    //  @@@@@
    // @@@@@@
    public static void ex24() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input the number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            //pune spatii
            for (int x = n - i; x > 0; x--) {
                System.out.print(" ");
            }
            //pune stelute
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    //27. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
    //
    //Test Data
    //Input a number: 7
    //Expected Output :
    //
    //Number is positive

    public static void ex27() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number : ");
        int n = in.nextInt();

        if (n > 0) {
            System.out.println("Number is positive");

        } else if (n < 0) {
            System.out.println("Number is negative");

        } else {
            System.out.println("Number is zero");
        }
    }
//28. Write a Java program that reads a floating-point number. If the number is zero it prints "zero",
// otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
// or "large" if it exceeds 1,000,000. Go to the editor
//
//Test Data
//Input a number: -2534
//Expected Output :
//
//Negative

    public static void ex28() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int n = in.nextInt();

        if (n == 0) {
            System.out.println("zero");
        } else {
            if (n > 0) {
                System.out.println("pozitiv");
            } else {
                System.out.println("negativ");

            }
            if (Math.abs(n) < 1) {
                System.out.println("small");
            } else if (Math.abs(n) > 1000000) {
                System.out.println("large");
            }

        }


    }
    //29. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has. Go to the editor
    //
    //Test Data
    //Input an integer number less than ten billion: 125463
    //Expected Output :
    //
    //Number of digits in the number: 6

    public static void ex29() {
        // <10000
        // numara cate 2uri
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number which is less than 10.000 :");
        int counter = 0;
        int x = in.nextInt();

        if (x >= 10000) {
            System.out.println("Input another number which is LESS than 10.000 :");

        } else {
            while (x > 0) {
                if (x % 10 == 2) {
                    counter++;

                }
                x = x / 10;
            }
            System.out.println(counter);
        }

    }

    public static void ex29bkp() {
        int temp = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                temp = temp + i;

            }

        }
        System.out.println(temp);
    }

    // print 0 10 100..1 mil
    public static void bkp29() {
        System.out.println(0);
        for (int i = 10; i <= 1000000; i = i * 10) {
//            i++;
            System.out.println(i);
        }
    }

    //0-100 pe rannduri separate a cate 10 nr
    public static void bkp29n() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }

    //suma primelor 10 nr > 60 sau nu
    public static void bk29n2() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        if (sum > 60) {
            System.out.println("Suma primelor 10 nr este mai mare ca 60");
        } else {
            System.out.println("Suma primelor 10 nr este mai mica ca 60");
        }
    }
//30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
// "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
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
        System.out.println("Input first number :");
        int x = in.nextInt();

        System.out.println("Input second number: ");
        int y = in.nextInt();

        System.out.println("Input third number: ");
        int z = in.nextInt();

        if (x == y && x == z) {
            System.out.println("All numbers are equal\" if all three numbers are equal");
        } else if (x == y || y == z || z == x) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");

        }
    }

    //31. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order,
    // "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
    //
    //Test Data
    //Input first number: 1524
    //Input second number: 2345
    //Input third number: 3321
    //Expected Output :
    //
    //Increasing order
    public static void ex31() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number : ");
        int x = in.nextInt();

        System.out.println("Input second number: ");
        int y = in.nextInt();

        System.out.println("Input third number:");
        int z = in.nextInt();

        if (x > y && y > z) {
            System.out.println("decreasing order");
        } else if (x < y && y < z) {
            System.out.println("increasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

    }

    public static void ex31bkp() {

        Scanner in = new Scanner(System.in);
        int max = 0;
        int mid = 0;
        int min = 0;
        System.out.println("Input first number : ");
        int x = in.nextInt();

        System.out.println("Input second number: ");
        int y = in.nextInt();

        System.out.println("Input third number:");
        int z = in.nextInt();

        if (x > y && x > z) {
            max = x;
            if (y > z) {
                mid = y;
                min = z;
            } else {
                mid = z;
                min = y;
            }
        }
        if (y > x && y > z) {
            max = y;
            if (x > z) {
                mid = x;
                min = z;
            } else {
                mid = z;
                min = x;
            }
        }
        if (z > x && z > y) {
            max = z;
            if (x > y) {
                mid = x;
                min = y;
            } else {
                mid = y;
                min = x;
            }
        }
        System.out.println("max= " + max + "\nmid= " + mid + "\nmin= " + min);
    }
    //32. Write a Java program that accepts two floating point numbers and checks whether they are the same up to two decimal places.
    //
    //Test Data
    //Input first floating point number: 1235
    //Input second floating point number: 2534
    //Expected Output :
    //
    //These numbers are different.

    public static void ex32() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first floating point number: ");
        double num1 = in.nextDouble();

        System.out.println("Input second floating point number: ");
        double num2 = in.nextDouble();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("Numbers are the same");
        } else {
            System.out.println("Numbers are different");
        }

        // double dig1=num1%100;
        // double dig2=num2%100;

        // if (dig1==dig2){
        //     System.out.println("they are the same up to two decimal places");
        // }else{
        //     System.out.println("These numbers are different");
        //  }
    }

    //1. 0-20 care e mai mare? suma la divizorii cu 5 sau cu 4


    public static void div() {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 4 == 0) {
                sum1 = sum1 + i;
            }
            if (i % 5 == 0) {
                sum2 = sum2 + i;
            }


        }
        System.out.println("Suma div cu 4 este egala cu :" + sum1);
        System.out.println("Suma div cu 5 este egala cu :" + sum2);
        if (sum1 > sum2) {
            System.out.println("Suma divizorilor lui 4 este mai mare decat suma divizorilor cu 5");
        } else {
            System.out.println("Suma divizorilor lui 5 este mai mare decat suma divizorilor cu 4");
        }
    }
//input de la tastatura
    //sa imi ceara varsta
    //aplicatie pt creat buletine: cerinte : nume, varsta
    //conditie : Numele (3 sau mai multe litere)=>.....
    //varsta : min 14...110, daca nu e in interval=> reintrodu o varsta din interval
    //la sfarsit : Datele sunt,.....la varsta de x..sa revii sa iti faci buletinul

    public static void buletin() {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduceti varsta:");
        int varsta = in.nextInt();

        while (varsta < 14 || varsta > 110) {

            System.out.println("Introduceti o varsta din intervalul 14-110 ani: ");
            varsta = in.nextInt();

        }

        in = new Scanner(System.in);
        System.out.println("Introduceti numele:");
        String numele = in.nextLine();


        while (numele.length() <= 3) {
            System.out.println("Numele trebuie sa contina cel putin 3 caractere. \n Introduceti un nume corespunzator: ");
            numele = in.nextLine();
        }
        System.out.println("Datele dumneavoastra sunt:"+"\nNumele:"+numele+"\nVarsta :"+ varsta+ "\nva rugam sa reveniti pentru " +
                "reinnoire la varsta de :"+(varsta+10));

    }



    public static void main(String[] args) {
        buletin();


    }


}








