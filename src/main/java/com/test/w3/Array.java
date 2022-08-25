package com.test.w3;

import java.util.Arrays;

public class Array {
    //1. Write a Java program to sort a numeric array and a string array.
    public static void ex1() {

    }

    public static void ex1rep() {
        int[] my_array1 = {1524, 2584, 5255, 54554, 5545, 1243, 15245, 255, 5555, 9572, 1243};
        String[] my_array2 = {"Java", "Python", "PHP", "C#", "C Programming"};

        System.out.println("Original numeric array:" + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric arrays:" + Arrays.toString(my_array1));

        System.out.println("Original numeric array:" + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted numeric array:" + Arrays.toString(my_array2));
    }//2. Write a Java program to sum values of an array

    public static void ex2() {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
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
        char[][] a = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void ex3bkp() {
        int[][] a = new int[4][4];
        int counter = 0;

        //put values
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = counter++;
            }
        }

        //print matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\n Print diagonala:");
        for (int i = 0; i < 4; i++) {

            System.out.print(a[i][i] + " ");

        }


    }

    //array il declar eu val si printeaza toate valorile din array
    public static void ex3bkp2() {

        String[] ingrediente = {"lapte", "oua", "zahar", "faina", "esenta"};
        int[] cantitate = {500, 5, 300, 300, 1};
        System.out.println(" Pentru clatite ai nevoie de :");
        System.out.println(cantitate[2] + " grame " + ingrediente[2]);

        System.out.println("ingrediente :" + ingrediente.length);
        String s = "abc";
        s.length();
    }
    //creez un array si pun val de la 1 pana la 5 si il pun de mana
    //printeaza

    public static void ex3bkp3() {
        String[] cumparaturi = new String[4];
        cumparaturi[0] = "rochii";
        cumparaturi[1] = "pantofi";
        cumparaturi[2] = "accesorii";

        System.out.println("Andreea are nevoie de urmatoarele cumparaturi:");
        System.out.println("->" + cumparaturi[0]);
        System.out.println("->" + cumparaturi[1]);
        System.out.println("->" + cumparaturi[2]);

        for (int i = 0; i < cumparaturi.length; i++) {
            System.out.println(cumparaturi[i]);
        }

    }

    public static void ex3bkp4() {
        int[] numere = new int[6];
        numere[0] = 12;
        numere[1] = 13;
        numere[2] = 14;
        numere[3] = 15;
        numere[4] = 16;
        numere[5] = 17;
        System.out.println("Inainte :");
        for (int i = 0; i < numere.length; i++) {
            System.out.print(numere[i] + " ");
        }
        System.out.println();

        System.out.println("Inapoi");
        for (int i = numere.length - 1; i >= 0; i--) {
            System.out.print(numere[i] + " ");
        }
    }

    //4. Write a Java program to calculate the average value of array elements.
    public static void ex4() {
        int num[] = new int[]{10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            //average

        }
        double average = sum / num.length;
        System.out.println("Average value of the array elements is:" + average);
    }

    public static void ex4bkp() {

        int numero[] = {5, 6, 7, 8, 9};

        int sum = 0;
        int i = 0;
        for (; i < numero.length; ) {
            sum = sum + numero[i];
            i++;
        }
        double average = sum / numero.length;
        System.out.println("media este: " + average);
    }

    //5. Write a Java program to test if an array contains a specific value.
    public static void ex5() {
        int a[] = {5, 6, 7, 9};
        boolean found7 = false;
        boolean found8 = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 7) {
                found7 = true;
            }
            if (a[i] == 8) {
                found8 = true;
            }
        }
        System.out.println(found7 && found8 ? "gasit" : "negasit");


    }

    public static void main(String[] args) {
        ex5();
    }

}
