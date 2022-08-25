package com.test.w3;

import java.util.Scanner;

public class DataTypes {
    //1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
    //Test Data
    //Input a degree in Fahrenheit: 212
    //Expected Output:
    //212.0 degree Fahrenheit is equal to 100.0 in Celsius
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

         System.out.println("Input first floating number: ");
         float x= in.nextFloat();

        System.out.println("Input second floating number :");
        float y=in.nextFloat();


        // read two floating point numbers from input and show the absolute difference between them, with 2 decimals after .

        //Scanner in= new Scanner(System.in);

       // System.out.println("Input first floating number: ");
       // float x= in.nextFloat();

        //System.out.println("Input second floating number :");
       // float y=in.nextFloat();

       // System.out.printf("Difference between the numbers is %.2f: ", Math.abs (x-y) );


    }

    public static void ex1() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a degree in Fahrenheit: ");
        double fahrenheit = in.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is egual to " + celsius + " in celsius");
    }

    //2. Write a Java program that reads a number in inches, converts it to meters.
    //Note: One inch is 0.0254 meter.
    //Test Data
    //Input a value for inch: 1000
    //Expected Output :
    //1000.0 inch is 25.4 meters
    public static void ex2() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a value for inch :");
        double inch = in.nextDouble();

        double meters = inch * 0.0254;

        System.out.println(inch + " inch is " + meters + " meters");

    }

    //3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
    //
    //Test Data
    //Input an integer between 0 and 1000: 565
    //Expected Output :
    //The sum of all digits in 565 is 16
    public static void ex3() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input an integer between 0 and 1000: ");
        int num = in.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourDigit = remainingNumber % 10;
        int sum = thirdDigit + secondDigit + firstDigit + fourDigit;

        System.out.println("The sum of all digits in " + num + " is " + sum);
    }

    public static void ex3bkp() {
        Scanner in = new Scanner(System.in);
        int sum = 0;


        System.out.println("Input an integer between 0 and 1000: ");
        int num = in.nextInt();

        while (num != 0) {
            sum += num % 10;
            num = num / 10;

        }
        System.out.println("Sum of number is:" + sum);
    }

    public static void ex3bkp2() {
        Scanner in = new Scanner(System.in);
        int sum;

        System.out.println("Input an integer between 0 and 1000: ");
        int num2 = in.nextInt();

        for (sum = 0; num2 > 0; num2 = num2 / 10) {
            sum = sum + num2 % 10;

        }
        System.out.println("Sum of number is:" + sum);
    }

    //4. Write a Java program to convert minutes into a number of years and days. Go to the editor
    //
    //Test Data
    //Input the number of minutes: 3456789
    //Expected Output :
    //3456789 minutes is approximately 6 years and 210 days
    public static void ex4() {
        long minutesInYear = 60 * 24 * 365;

        Scanner in = new Scanner(System.in);

        System.out.println(" Input number of mintes:");
        double min = in.nextDouble();

        long years = (long) min / minutesInYear;
        int days = (int) ((min / 60 / 24) % 365);
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }

    //6. Write a Java program to compute body mass index (BMI). Go to the editor
    //
    //Test Data
    //Input weight in pounds: 452
    //Input height in inches: 72
    //Expected Output:
    //Body Mass Index is 61.30159143458721

    public static void ex6() {
        Scanner in = new Scanner(System.in);

        System.out.println(" Input weight in pounds: ");
        int weight = in.nextInt();

        System.out.println(" Input height in inches: ");
        int inches = in.nextInt();

        //double BMI= weight
        //double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        //System.out.print("Body Mass Index is " + BMI+"\n");
    }
//7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds),
// and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
//
//Test Data
//Input distance in meters: 2500
//Input hour: 5
//Input minutes: 56
//Input seconds: 23
//Expected Output :
//Your speed in meters/second is 0.11691531
//Your speed in km/h is 0.42089513
//Your speed in miles/h is 0.26158804

    public static void ex7() {
        Scanner in = new Scanner(System.in);

        float timeSeconds;
        float mps, kph, mph;

        System.out.println("Input distance in meters:");
        float distance = in.nextFloat();

        System.out.println("Input hour:");
        float hr = in.nextFloat();

        System.out.println("Input minutes: ");
        float min = in.nextFloat();

        System.out.println("Input seconds: ");
        float sec = in.nextFloat();

        timeSeconds = (hr * 3600) + (min * 60) + sec;
        mps = distance / timeSeconds;
        kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
        mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is" + mps);
        System.out.println("Your speed in km/h is " + kph);
        System.out.println("Your speed in miles/h is" + mph);

        in.close();
    }

    //9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers). Go to the editor
//
//Test Data
//Input 1st integer: 25
//Input 2nd integer: 5
//Expected Output :
//Sum of two integers: 30
//Difference of two integers: 20
//Product of two integers: 125
//Average of two integers: 15.00
//Distance of two integers: 20
//Max integer: 25
//Min integer: 5
    public static void ex9() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 1st integer:");
        int firstInteger = in.nextInt();

        System.out.println("Input 2nd integer: ");
        int secondInteger = in.nextInt();

        System.out.printf("Summ of two integers:%d%n", firstInteger + secondInteger);
        System.out.printf("Distance of two integers : %d%n", Math.abs(firstInteger - secondInteger));
        System.out.printf("Max integer: %d%n", Math.max(firstInteger, secondInteger));
    }

    //12. Write a Java program to compare two given signed and unsigned numbers.
    public static void ex12() {
        int in1 = Integer.MIN_VALUE;
        int in2 = Integer.MAX_VALUE;
        System.out.println("Signed integers: " + in1 + "," + in2);
        System.out.println("--------------------------------------");
        int compare_Signed_num = Integer.compare(in1, in2);
        System.out.println("Result of comparing signed numbers: " + compare_Signed_num);
        int compare_Unsigned_num = Integer.compareUnsigned(in1, in2);
        System.out.println("Result of comparing unsigned numbers:" + compare_Unsigned_num);
    }


    public static void ex12bkp() {

        int val1 = -10;
        int val2 = 7;
        int max;


        if (Math.abs(val1) > Math.abs(val2)) {
            max = val1;
        } else {
            max = val2;
        }
        System.out.println("Maximul dintre numere este: " + max);

    }

    //13. Write a Java program to compute the floor division and the floor modulus of the given dividend and divisor.
    public static void ex13() {
        int x = -3578;
        int y = 123;
        System.out.println("Floor division using '/' operator:" + (x / y));
        System.out.println("Floor division using floorDiv() method is :" + Math.floorDiv(x, y));
        System.out.println("Floor modulus using '%' operator : " + (x % y));
        System.out.println("Floor modulus using floorMod() method is: " + Math.floorMod(x, y));


    }

}