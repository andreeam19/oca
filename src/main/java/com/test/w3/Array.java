package com.test.w3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Array {
    //1. Write a Java program to sort a numeric array and a string array.

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

        //print diagonala
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

    //6. Write a Java program to find the index of an array element.
    public static int findIndex(int my_arr[], int x) {
        if (my_arr == null) return -1;
        int len = my_arr.length;
        int i = 0;
        while (i < len) {
            if (my_arr[i] == x) return i;
            else i = i + 1;
        }
        return -1;

    }
//int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        System.out.println("Index position of 25 is: "+findIndex(my_array,25));
//        System.out.println("Index position of 77 is: "+findIndex(my_array,77));

    //7. Write a Java program to remove a specific element from an array

    public static void ex7() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array: " + Arrays.toString(my_array));

        //remove the second element(index->1, value->14) of the array
        int removeIndex = 1;

        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }
        //avand in vedere ca nu putem modifica marimea unui array, in acest caz, ultimul element din array se va repeta

        System.out.println("After removing the second element: " + Arrays.toString(my_array));

    }

    //8. Write a Java program to copy an array by iterating the array
    public static void ex8() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] new_array = new int[10];

        System.out.println("Source Array: " + Arrays.toString(my_array));

        for (int i = 0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }
        System.out.println("New Array: " + Arrays.toString(new_array));
    }

    //9. Write a Java program to insert an element (specific position) into an array.
    public static void ex9() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        //insert an element in 3rd position of the array (index-2, valuie-5)
        int Index_position = 2;
        int newValue = 5;

        System.out.println("Original Arrray: " + Arrays.toString(my_array));

        for (int i = my_array.length - 1; i > Index_position; i--) {
            my_array[i] = my_array[i - 1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New Array: " + Arrays.toString(my_array));
    }
    //10. Write a Java program to find the maximum and minimum value of an array.

    public static void max_min() {
        int[] number = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max, min;

        max = number[0];
        min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);


    }

    //11. Write a Java program to reverse an array of integer values.
    public static void ex11() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Original Array :" + Arrays.toString(my_array));

        for (int i = 0; i < my_array.length / 2; i++) {

            int temp = my_array[i];
            my_array[i] = my_array[my_array.length - i - 1];
            my_array[my_array.length - i - 1] = temp;

        }
        System.out.println("reverse array:" + Arrays.toString(my_array));
    }

    public static void ex11bkp() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Original Array :" + Arrays.toString(my_array));

        for (int i = my_array.length - 1; i >= 0; i--) {
            System.out.print(my_array[i] + " ");

        }
    }


    //12. Write a Java program to find the duplicate values of an array of integer values
    public static void ex12() {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

        Arrays.sort(my_array);
        int count = 0;
        for (int i = 0; i < my_array.length - 1; i++) {
            if (my_array[i] == my_array[i + 1]) {
                count += 1;
                System.out.println("Duplicate:" + my_array[i]);
            }
        }
        System.out.println("avem atatea duplicate: " + count);

    }

    public static void ex13() {
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if (my_array[i].equals(my_array[j]) && (i != j)) {
                    System.out.println("duplicate element is " + my_array[j]);
                }
            }
        }
    }



    //14.Write a Java program to find the common elements between two arrays (string values).
    public static void ex14() {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    set.add(array1[i]);
                }
            }
        }
        System.out.println("Common element: " + (set));

    }

    public static void ex14bkp() {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("Common element: " + array1[i]);
                }


            }
        }
    }

    //16.Write a Java program to remove duplicate elements from an array.
    public static void ex16() {
        int[] my_array = {0, 1, 2, 3, 4, 4, 6};
        int len = my_array.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (my_array[i] == my_array[j]) {
                    my_array[i] = my_array[len - 1];
                    len--;
                }
            }
        }
        System.out.println("Unique values :" + Arrays.toString(my_array));
    }

    //17.Write a Java program to find the second largest element in an array.
    public static void ex17() {
        int[] my_array = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Original numeric Array :" + Arrays.toString(my_array));

        Arrays.sort(my_array);

        int index = my_array.length - 1;

        while (my_array[index] == my_array[my_array.length - 1]) {
            index--;
        }
        System.out.println("Second largest value:" + my_array[index]);
    }

    //18.Write a Java program to find the second smallest element in an array.
    public static void ex18() {
        int[] my_array = {-1, 4, 0, 2, 7, -3};

        Arrays.sort(my_array);

        System.out.println("Second Smallest element is: " + my_array[1]);

    }

    //25. Write a Java program to find common elements from three sorted (in non-decreasing order) arrays
    public static void ex25() {
        ArrayList<Integer> common = new ArrayList<Integer>();
        int array1[] = {2, 4, 8};
        int array2[] = {2, 3, 4, 8, 10, 16};
        int array3[] = {4, 8, 14, 40};

        int x = 0, y = 0, z = 0;
        while (x < array1.length && y < array2.length && z < array3.length) {
            if (array1[x] == array2[y] && array2[y] == array3.length) {
                common.add(array1[x]);
                x++;
                y++;
                z++;
            } else if (array1[x] < array2[y])
                x++;
            else if (array2[y] < array3[z])
                y++;
            else
                z++;
        }
        System.out.println("Common elements from three sorted ");
    }

    //27. Write a Java program to find the number of even and odd integers in a given array of integers.
    public static void ex27() {
        int[] array_nums = {5, 7, 2, 4, 9};
        System.out.println("Original Array:" + Arrays.toString(array_nums));
        int counter = 0;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] % 2 == 0)
                counter++;
        }

        System.out.println("Number of even numbers: " + counter);
        System.out.println("Number of odd numbers: " + (array_nums.length - counter));
    }

    //28. Write a Java program to get the difference between the largest
    // and smallest values in an array of integers. The length of the array
    // must be 1 and above.

    public static void ex28() {
        int[] array_nums = {5, 7, 2, 4, 9};
        System.out.println("Original Array: " + Arrays.toString(array_nums));
        int max = array_nums[0];
        int min = array_nums[0];

        for (int i = 1; i < array_nums.length; i++) {
            if (array_nums[i] > max) {
                max = array_nums[i];
            } else if (array_nums[i] < min)
                min = array_nums[i];
        }
        System.out.println("MIn is" + min);
        System.out.println("Max is" + max);
        System.out.println("Difference is :" + (max - min));

    }

    //29. Write a Java program to compute the average value of an array of
    // integers except the largest and smallest values.
    public static void ex29() {
        int[] array_nums = {5, 7, 2, 4, 9};
        System.out.println("Original Array: " + Arrays.toString(array_nums));
        int max = array_nums[0];
        int min = array_nums[0];
        double sum = array_nums[0];

        for (int i = 1; i < array_nums.length; i++) {
            sum += array_nums[i];
            if (array_nums[i] > max)
                max = array_nums[i];
            else if (array_nums[i] < min)
                min = array_nums[i];
        }
        double x = ((sum - max - min) / (array_nums.length - 2));
        System.out.println("Compute the average value of an array of integers except the largest and smallest values :" + x);
        System.out.print("\n");

    }

    public static void ex29bkp() {
        int[] array_nums = {5, 7, 2, 4, 9};
        float sum = 0;
        Arrays.sort(array_nums);
        for (int i = 1; i < array_nums.length - 1; i++) {
            sum += array_nums[i];
        }
        float average = sum / (array_nums.length - 2);
        System.out.println("Average" + average);
    }

    public static void main(String[] args) {
        ex29bkp();
    }


}
