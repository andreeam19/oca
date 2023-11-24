package com.test.w3;

import java.util.Scanner;

public class ExercisesSet2 {

    public static void main(String[] args) {
        ex6();
    }
    //1. Write a program to print all odd numbers from 10 to 30.

    public static void ex1(){
        for(int i=9;i<=30;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    //
    //2. Write a program that reads a number from input and adds all numbers up to it.

    public static void ex2(){
        Scanner in=new Scanner(System.in);
        System.out.println("Input a number:");
        int num= in.nextInt();
        int sum=0;

        for(int i=0;i<=num;i++){
            sum+=i;

        }
        System.out.println("The sum is:"+sum);
    }

    //
    //3. Write a program that reverses a String input.

    public static void ex3(){
        String str="abcdef";
        char[] array=str.toCharArray();
        char[] array2=new char[array.length];
        for(int i=array.length-1;i>=0;i--){
            array2[i]+=array[i];
            System.out.print(array2[i]);
        }
    }

    //
    //4. Write a program that prints the elements of next array in reverse order: int array[] = {1,2,3,4,5,5,6,7,8,9};
    public static void ex4(){
        int array[] = {1,2,3,4,5,5,6,7,8,9};
        int[] newArray=new int[array.length];

        for(int i= array.length-1;i>=0;i--){
            newArray[i]=array[i];
            System.out.print(newArray[i]+" ");
        }

    }
    //
    //5. Write a program that prints the sum of all elements of next array: int array[] = {1,2,3,4,5,5,6,7,8,9};

    public static void ex5(){
        int array[] = {1,2,3,4,5,5,6,7,8,9};

        int sum=0;

        for(int i= array.length-1;i>=0;i--){
            sum+=array[i];
        }
        System.out.println("suma este egala cu :"+sum);
    }
    //printeaza doar 20% din array
    public static void ex6(){
        int array[] = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
       int len=(int)(0.2* array.length);

       for(int i=0;i<len;i++){
           System.out.print(array[i]+" ");
       }
    }
}
