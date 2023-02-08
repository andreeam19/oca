package com.test.w3;

import java.util.Arrays;

public class RefachereArray {

    public static void main(String[] args) {
        ex16();
        // System.out.println("Index position of 25 is: " + findIndex(25));
        // System.out.println("Index position of 77 is: " + findIndex( 7));


    }

    ////2. Write a Java program to sum values of an array
    public static void ex2() {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        System.out.println("Suma este: " + sum);
    }

    public static void ex2bkp() {
        int[] my_array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : my_array) {
            sum += i;
        }
        System.out.println("Suma este:" + sum);

    }

    //cu while
    public static void ex2bkp2() {
        int[] a = {1, 20, 3, 4, 5};
        int sum = 0;
        int i = 0;
        while (i < a.length) {
            sum += a[i];
            i++;
        }
        System.out.println("Suma este:" + sum);
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

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //cu counter
    public static void ex3bkp() {
        int[][] b = new int[4][4];
        int counter = 0;
        //put values
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = counter++;

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n Print doagonala:");
        for (int i = 0; i < 4; i++) {
            System.out.print(b[i][i] + " ");
        }
    }


    //array il declar eu val si printeaza toate valorile din array
    public static void ex3bkp2() {
        String[] ingrediente = {"oua", "lapte", "faina", "bicarbonat", "zahar"};
        int[] cantitate = {5, 500, 300, 10, 100};
        System.out.println("Pentru clatite ai nevoie de:");
        System.out.println(cantitate[0] + " " + ingrediente[0]);

        System.out.println("ingrediente:" + ingrediente.length);
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
        cumparaturi[3] = "posete";


        System.out.println("Andreea are nevoie de urmatoarele cumparaturi:");
        System.out.println("->" + cumparaturi[0]);
        System.out.println("->" + cumparaturi[1]);
        System.out.println("->" + cumparaturi[2]);
        System.out.println("->" + cumparaturi[3]);

        for (int i = 0; i < cumparaturi.length; i++) {
            System.out.println(cumparaturi[i]);
        }
    }


    //creez un array int de dimensiune 6.
    //declar pe fiecare pozitie
    //apoi cer sa mi le printeze de la inceput la sfarsit si invers

    public static void exe3bkp4() {
        int[] numere = new int[6];
        numere[0] = 12;
        numere[1] = 13;
        numere[2] = 14;
        numere[3] = 15;
        numere[4] = 16;
        numere[5] = 17;

        System.out.println("Inainte:");
        for (int i = 0; i < numere.length; i++) {
            System.out.print(numere[i] + " ");
        }
        System.out.println();

        System.out.println("Inapoi:");
        for (int i = numere.length - 1; i > 0; i--) {
            System.out.print(numere[i] + " ");
        }
    }

    ////4. Write a Java program to calculate the average value of array elements.
    public static void ex4() {
        int num[] = new int[]{10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double average = sum / num.length;
        System.out.println("Average value of the array elements is" + average);
    }

    //5. Write a Java program to test if an array contains a specific value.
    public static void ex5() {
        int a[] = {5, 6, 7, 8};
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
    public static int findIndex(int x) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int i = 0;
        while (i < my_array.length) {
            if (my_array[i] == x) {
                return i;
            } else {
                i = i + 1;
            }

        }
        return -1;

    }

    ////7. Write a Java program to remove a specific element from an array
    //remove the second element(index->1, value->14) of the array
    public static void ex7() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array: " + Arrays.toString(my_array));

        //remove the second element( index->1, value 14)
        int removeIndex = 1;

        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }
        System.out.println("After removing the second element:" + Arrays.toString(my_array));
    }

    //8. Write a Java program to copy an array by iterating the array
    public static void ex8() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] new_array = new int[10];

        System.out.println("Original array:" + Arrays.toString(my_array));

        for (int i = 0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }
        System.out.println("New array: " + Arrays.toString(new_array));
    }

    ////9. Write a Java program to insert an element (specific position) into an array.
    public static void ex9() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};


        int Index_position = 2;
        int newValue = 5;

        System.out.println("Original array:" + Arrays.toString(my_array));

        for (int i = my_array.length - 1; i > Index_position; i--) {
            my_array[i] = my_array[i - 1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New array:" + Arrays.toString(my_array));

    }

    //10. Write a Java program to find the maximum and minimum value of an array.
    public static void max_min() {
        int[] number = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int max = number[0];
        int min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
            System.out.println("Minimul e:" + min);
            System.out.println("Max e:" + max);
        }
    }

    //11. Write a Java program to reverse an array of integer values.
    public static void ex11() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Original Array:" + Arrays.toString(my_array));

        for (int i = 0; i < my_array.length / 2; i++) {
            int temp = my_array[i];
            my_array[i] = my_array[my_array.length - i - 1];
            my_array[my_array.length - i - 1] = temp;

        }
        System.out.println("reverse array:" + Arrays.toString(my_array));

    }

    public static void ex11bkp() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Original Array:" + Arrays.toString(my_array));

        for (int i = my_array.length - 1; i >= 0; i--) {
            System.out.print(my_array[i] + " ");
        }
    }

    public static void ex11bkp2() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] new_array = new int[10];

        int j = new_array[0];

        System.out.println("Original array:" + Arrays.toString(my_array));
        for (int i = my_array.length - 1; i >= 0; i--) {
            new_array[i] = my_array[j];
            j++;
        }

        System.out.println("new array:" + Arrays.toString(new_array));
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
        System.out.println("avem atatea duplicate:" + count);
    }

    public static void ex13() {
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if (my_array[i].equals(my_array[j]) && (i != j)) {
                    System.out.println("duplicate elements is " + my_array[i]);
                }
            }
        }

    }

    //14.Write a Java program to find the common elements between two arrays (string values).
    public static void ex14() {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println("Common element: " + array1[i]);
                }
            }
        }

    }


    ////16.Write a Java program to remove duplicate elements from an array.
    public static void ex16() {
        int[] my_array = {1, 2, 3, 4, 4, 6};


        int len = my_array.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (my_array[i] == my_array[j]) {
                    my_array[i] = my_array[len - 1];
                    len--;
                }
            }
        }

        int[] new_array = new int[len];
        for (int j = 0; j <len; j++) {
            new_array[j] = my_array[j];
        }

        System.out.println("New array:" + Arrays.toString(new_array));

    }

}
