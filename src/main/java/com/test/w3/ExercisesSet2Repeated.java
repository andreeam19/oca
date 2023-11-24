package com.test.w3;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ExercisesSet2Repeated {


    public static void main(String[] args) {
        ex5();
    }

    //1. Write a program to print all odd numbers from 10 to 30.
    public static void ex1() {
    }
    //
    //2. Write a program that reads a number from input and adds all numbers up to it.

    public static void ex2() {
    }

    //
    //3. Write a program that reverses a String input.

    public static void ex3() {
        String str="abcdef";
        char[] array=str.toCharArray();
        char[] newArray=new char[array.length];

        for(int i= array.length-1;i>=0;i--){
            newArray[i]+=array[i];
        }
    }

    //
    //4. Write a program that prints the elements of next array in reverse order: int array[] = {1,2,3,4,5,5,6,7,8,9};
    public static void ex4() {
        int array[] = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        int newArray[]=new int[array.length];

        for(int i= array.length-1;i>=0;i--){
            newArray[i]=array[i];
        }


    }

    //
    //5. Write a program that prints the sum of all elements of next array: int array[] = {1,2,3,4,5,5,6,7,8,9};
    public static void ex5() {
        int array[] = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};

        int len=(int)(0.2* array.length);
        for( int i=0;i<=len;i++){
            System.out.print(array[i]);

        }

    }

}

