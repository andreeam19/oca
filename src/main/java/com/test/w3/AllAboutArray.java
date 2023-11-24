package com.test.w3;

import java.util.Arrays;

public class AllAboutArray {
    public static void main(String[] args) {

    }

    //1. Write a Java program to sort a numeric
    // array and a string array
    public static void ex1() {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] my_array2 = {"Java", "Python", "PHP",
                "C#", "C Programming", "C++"};
        System.out.println("Original numeric array: " + Arrays.toString(my_array1));

        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array: " + Arrays.toString(my_array1));

        System.out.println("Original numeric array: " + Arrays.toString(my_array2));

        Arrays.sort(my_array2);
        System.out.println("Sorted numeric array: " + Arrays.toString(my_array2));

        ////SAU
        int[] arr = {5, -2, 23, 7, 87, -42, 509};
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    //2.Write a Java program to sum values of an array.
    public static void ex2() {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
    //4. Write a Java program to calculate the average value of array elements
    public static void ex4(){
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
        
    }
}



