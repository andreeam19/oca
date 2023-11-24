package com.test.w3;

import java.util.Arrays;
import java.util.Scanner;

public class RepetaSet2N {
    //# Exercises set 2
    public static void main(String[] args) {
        ex3bkp();
    }

    //1. Write a program to print all odd numbers from 10 to 30.
    public static void ex1() {
        for (int i = 10; i <= 30; i ++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
    public static void ex1bkp(){
        for(int i=11;i<=29;i+=2){
            System.out.print(i+" ");
        }
    }
    public static void ex1bkp2(){
        int num=11;
        while(num<=29){
            System.out.print(num+" ");
            num+=2;
        }
    }

    //
    //2. Write a program that reads a number from input and adds all numbers up to it.
    public static void ex2(){
        Scanner in=new Scanner(System.in);
        System.out.println("Input your number:");
        int num= in.nextInt();
        int sum=0;

        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println("the sum is "+sum);
    }
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
    public static void ex3bkp(){
        String str="abcdef";

        StringBuffer reversed=new StringBuffer(str).reverse();

        System.out.println(reversed);
    }
    //4. Write a program that prints the elements of
    // next array in reverse order:
    // int array[] = {1,2,3,4,5,5,6,7,8,9};
    //
    public static void ex4(){
        int[] array= {1,2,3,4,5,5,6,7,8,9};
        for(int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
    public static void ex4bkp1(){
        int[] array= {1,2,3,4,5,5,6,7,8,9};
        int i= array.length-1;
        while(i>=0){
            System.out.print(array[i]+" ");
            i--;
        }
    }
    //5. Write a program that prints the sum of all elements of next array: int array[] = {1,2,3,4,5,5,6,7,8,9};
    public static void ex5(){
        int array[] = {1,2,3,4,5,5,6,7,8,9};

        int sum=0;

        for(int i= array.length-1;i>=0;i--){
            sum+=array[i];
        }
        System.out.println("Suma este egala cu "+sum);
    }
    public static void ex5bkp(){
        int array[] = {1,2,3,4,5,5,6,7,8,9};
        int sum=0;
        for(int num:array){
            sum+=num;
        }
        System.out.println("The sum is:"+sum);
    }



}
