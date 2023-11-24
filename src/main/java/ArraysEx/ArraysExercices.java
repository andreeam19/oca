package ArraysEx;

//https://www.w3resource.com/java-exercises/array/index.php

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArraysExercices {
    //1. Write a Java program to sort a numeric array and a string array.
    public static void ex1() {
        int[] array1 = {56, 84, 34, 3, 965, 358, 457, 55};
        String[] array2 = {"Phyton", "Java", "PHP", "C#", "C Programming", "C++"};


        System.out.println("Original numeric array: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array: " + Arrays.toString(array1));

        System.out.println("Original String array: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String array:" + Arrays.toString(array2));
    }

    //2. Write a Java program to sum values of an array.
    public static void ex2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            sum = sum + array[i];
        }
        System.out.println("The sum is:" + sum);
    }

    //3. Write a Java program to print the following grid.
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
        int[][] a = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }
    }
    //
    //String str = "abcgmail.com";
    //        boolean findaround=false;
    //        boolean finddot=false;
    //        for (int i = 0; i <= str.length() - 1; i++) {
    //
    //            if (str.charAt(i) == '@'){
    //                findaround=true;
    //            }
    //            if(str.charAt(i) == '.'){
    //                finddot=true;
    //            }
    //
    //        }
    //        if(!findaround&&finddot){
    //            System.out.println("Wrong email adress");
    //        }


    //4. Write a Java program to calculate the average value of array elements.
    public static void ex4() {
        int sum = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i <= array.length - 1; i++) {
            sum = sum + array[i];
        }
        double average = sum / array.length;
        System.out.println("Media este: " + average);
    }

    //5. Write a Java program to test if an array contains a specific value
    public static void ex5() {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println(contains(array, 5));
        System.out.println(contains(array, 7));
    }

    public static boolean contains(int[] array, int num) {
        for (int i : array) {
            if (num == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains2(int[] array, int n) {
        for (int i : array) {
            if (i == n) {

                return true;
            }
        }
        return false;
        //in main:
        //int[] array={1,2,3,4,5,6,7};
        //        System.out.println(contains2(array,5));
    }

    //6. Write a Java program to find the index of an array element.
    public static int findIndex(int n, int[] array) {

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }


    //7. Write a Java program to remove a specific element from an array.
    public static void removeElement(int removeIndex, int[] array) {
        System.out.println("Original array:" + Arrays.toString(array));

        for (int i = removeIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        System.out.println("After removing the second element:" + Arrays.toString(array));
    }

    //8. Write a Java program to copy an array by iterating the array.
    public static void ex8(int[] array) {
        int[] new_array = new int[8];

        System.out.println("Original array" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            new_array[i] = array[i];
        }
        System.out.println("New Array: " + Arrays.toString(new_array));

    }

    //9. Write a Java program to insert an element (specific position) into an array.
    public static void ex9(int index, int n, int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (i == index) {
                array[i] = n;
                break;
            }
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //10. Write a Java program to find the maximum and minimum value of an array
    public static void ex10(int[] array) {
        int min = 0;
        int max = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimul e: " + min);
        System.out.println("Maximul e: " + max);
    }

    //11. Write a Java program to reverse an array of integer values.
    public static void reverseArray(int[] array) {
        int[] newArray=new int[array.length];

        int j=0;
        for(int i= array.length-1;i>=0;i--){
            newArray[j]=array[i];
            j++;
        }
        printArray(newArray);
    }
    //12. Write a Java program to find duplicate values in an array of integer values.
    public static void duplicates(int[] array){

        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]==array[j] &&i!=j){
                    System.out.println("Duplicates"+ array[j]);
                }
            }
        }
    }
    //13. Write a Java program to find duplicate values in an array of string values.
    public static void ex13(String[] array){

        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i].equals(array[j])&&i!=j){
                    System.out.println("Duplicates are: "+array[j]);
                }
            }
        }
    }

    //14. Write a Java program to find common elements between two arrays (string values)
    public static void ex14(){
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
       HashSet<String> set=new HashSet<>();

       for(int i=0;i< array1.length;i++){
           for(int j=0;j< array2.length;j++){
               if(array1[i].equals(array2[j])){
                   set.add(array1[i]);
               }
           }
       }
        System.out.println("The duplicates are:"+set);
    }
    //15. Write a Java program to find common elements between two integer arrays
    public static void ex15(){

        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        System.out.println("First Array: "+Arrays.toString(array1));
        System.out.println("Second Array: "+Arrays.toString(array2));
        for(int i=0;i< array1.length;i++){
            for(int j=0;j< array2.length;j++){
                if(array1[i]==(array2[j])){
                    System.out.println("Common element is: "+array1[i]);
                }
            }
        }
    }
    //16. Write a Java program to remove duplicate elements from an array.
    public static void ex16(){
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        Arrays.sort(array1);
        for(int i=0;i<array1.length-2;i++){
            if (array1[i] == array1[i+1]) {
                array1[i+1]=array1[i+2];
            }
        }
        System.out.println(Arrays.toString(array1));
    }
    //17. Write a Java program to find the second largest element in an array.
    public static void ex17(){
        int[] my_array = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        Arrays.sort(my_array);

        System.out.println("Original array:"+Arrays.toString(my_array));
        int secondLargest=0;
        for(int i=0;i<my_array.length;i++){
            if(my_array[i]>secondLargest){
                secondLargest=my_array[i];
            }
        }
        System.out.println("Second largest is: "+secondLargest);
    }
    //18. Write a Java program to find the second smallest element in an array.
    public static void ex18_simple(){
        int[] my_array = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        Arrays.sort(my_array);
        int second_smallest=my_array[1];
    }
    public static void ex18_normal(){
        int[] my_array = {-1, 4, 0, 2, 7, -3};

        System.out.println("Original array: "+Arrays.toString(my_array));

        int min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;

        for(int i=0;i<my_array.length;i++){
            if(my_array[i]==min){
                second_min=my_array[i];
            }else if(my_array[i]<min){
                second_min=min;
                min=my_array[i];
            }else if(my_array[i]<second_min){
                second_min=my_array[i];
            }
        }
    }
    //cum cauti, cum stergi si adaugi

    //20. Write a Java program to convert an array to an ArrayList.
    public static void ex20(){
        String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
        //System.out.println(Arrays.toString(my_array));

        List<String> mylist = Arrays.asList(my_array);
        ArrayList<String> list=new ArrayList<>();

        System.out.println(list);
    }
    //21. Write a Java program to convert an ArrayList to an array.
    public static void ex21(){
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("mno");
        list.add("pqr");

        String[] my_array=new String[list.size()];
        list.toArray(my_array);

        for(String string:my_array){
            System.out.print(string+" ");
        }

    }



    public static void main(String[] args) {
       // int[] array = {0, 1, 2, 3, 4, 2, 6, 7};
       // String[] newArray={"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};



        //System.out.println(findIndex(5,array));
        // removeElement(5,array);
        //ex8(array);
        // ex9(2,10,array);
        // ex10(array);
       // reverseArray(array);
        //duplicates(array);
        //ex13(newArray);
        //ex14();
        //ex15();
        //ex16();
        //ex17();
        //ex20();
        ex21();
    }
}
