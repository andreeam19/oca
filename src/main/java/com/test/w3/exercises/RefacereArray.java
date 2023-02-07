package com.test.w3.exercises;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class RefacereArray {

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,2,7};
        //System.out.println(cautare(arr,2));
       // System.out.println( ex5(arr,5));
        System.out.println("Index position of 5 is "+findIndex(array,5));
    }

    //1. Write a Java program to sort a numeric array and a string array.
    public static void ex1() {
        String arr1[] = {"mama", "tata", "bunica", "strabunica", "tot neamul"};
        int arr2[] = {1673, 37756, 368, 23679, 4782, 5637};

        System.out.println("Original string array: " + Arrays.toString(arr1));
        System.out.println("Original numeric array: " + Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Sorted string array:" + Arrays.toString(arr1));
        System.out.println("Sorted numeric array: " + Arrays.toString(arr2));
    }

    //2. Write a Java program to sum values of an array.
    public static void ex2() {
        int arr[] = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("Suma este egala cu :" + sum);
    }

    //3. Write a Java program to print the following grid. Go to the editor
    //
    //Expected Output :
    //
    //- - - - - - - - - -
    //- - - - - - - - - -
    //- - - - - - - - - -
    //- - - - - - - - - -
    //- - - - - - - - - -
    //- - - - - - - - - -
    //- - - - - - - - - -
    //- - - - - - - - - -
    //- - - - - - - - - -
    //- - - - - - - - - -
    public static void ex3() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(" - ");
            }
            System.out.println();
        }
    }

    //de cate ori se repeta un nr
    public static void repetari() {
        int arr[] = {1, 2, 3, 4, 2, 6, 7, 8, 2, 10};

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                count += 1;
            }
        }
        System.out.println("o se repeta de " + count + " ori");
    }

    //dau un array si un nr. verific daca arrayul contine numarul respectiv
    public static boolean cautare(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    //4. Write a Java program to calculate the average value of array elements

    public static void ex4() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        System.out.println("media este: " + average);
    }

    //5. Write a Java program to test if an array contains a specific value.
    public static boolean ex5(int array[], int item) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int n : arr) {
            if(item==n){
                return true;
            }
        }
        return false;
    }
    //6. Write a Java program to find the index of an array element.
    public static int findIndex(int array[], int x){
        int len=array.length;
        int i=0;
        while(i<len){
            if(array[i]==x){
                return i;

            }else{
                i=i+1;
            }
        }
        return -1;
    }
}