package com.test.w3.exercises;

import java.util.Arrays;

public class Array {
    //fac o metoda :calculeaza si primeste 2 nr int si un string . String reprezinta metoda. IN functie
    //
    public static int calculeaza(int a, int b, String operatie) {
        if (operatie.equals("adunare")) {
            return adunare(a, b);
        }
        if (operatie.equals("scadere")) {
            return scadere(a, b);
        }
        return -1;

    }

    public static int adunare(int a, int b) {
        return a + b;
    }

    public static int scadere(int a, int b) {
        return a - b;
    }





    public static int[] delete(int n, int[] array) {
        int array1[] = {1, 2, 3, 2, 4, 2};

        int array2[] = new int[array1.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {

            if (array1[i] != 2) {
                array2[j] = array1[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(array2));
        return array2;
    }

    public static int[] removeLast() {
        int array1[] = {1, 2, 3, 4, 5, 6, 7};
        int removeArray[] = {2, 4};
        int array2[] = new int[7];
        int j = 0;

        System.out.println("Original Array: " + Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == removeArray[0] || array1[i] == removeArray[1]) {
                array1[i] = 0;

            }

        }
        System.out.println("New array:" + Arrays.toString(array1));
        return array2;
    }


    public static void exreset() {
        int num[] = {5, 1, 9, 56, 43, 19, 33, 23};
        System.out.println("Original array : " + Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[i] = 0;
            }
        }
        System.out.println("Original array : " + Arrays.toString(num));

    }


    //1. Write a Java program to sort a numeric array and a string array.
    public static void ex1() {

        int num[] = {5, 1, 9, 56, 43, 19, 33, 23};

        String arr[] = {"python", "colagen", "variabila", "index", "volum"};

        System.out.println("Original numeric array: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Stringul numeric sortat: " + Arrays.toString(num));

        System.out.println("Original String array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Stringul String sortat: " + Arrays.toString(arr));
    }

    //2. Write a Java program to sum values of an array.
    public static void ex2() {
        int arr[] = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Suma este: " + sum);
    }

    public static void ex2bkp() {
        int arr[] = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int sum = 0;

        for (int i : arr)
            sum += 1;
        System.out.println("Suma este: " + sum);
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
    public static void ex() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print("-");
            }
            System.out.println();
        }


    }

    public static void exNou() {
        int arr[] = {1, 2, 3, 4, 2, 6, 7, 8, 2, 10};
        int count = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 0) {
                count += 1;


            }

        }
        System.out.println(" 0 se repeta de :" + count + "ori");
    }

    //dau un array si un nr. verific daca arrayul contine numarul respectiv
    public static boolean cautare(int arr[], int num) {

        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] == num) {
                return true;

            }

        }
        return false;
    }


    public static void ex4() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];

        }
        double average = sum / arr.length;
        System.out.println("Media este: " + average);
    }

    //5. Write a Java program to test if an array contains a specific value.
    public static boolean contain( int array[], int item){
        for(int n:array){
            if(item==n){
                return true;
            }
        }
        return  false;

    }
    //System.out.println(contain(array,5));
    //        System.out.println(contain(array,19));

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Index position of 5 is"+ findIndex(array,5));

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
        }return -1;
    }
}
