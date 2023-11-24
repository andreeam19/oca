package com.test.w3;

import java.util.Scanner;

public class RepetaSet1N {
    public static void main(String[] args) {
        ex6();
    }
    //# Exercises set 1
    //1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. (read temperature from console.
    //formula:    celsius = ((5 * (fah-32))/9)
    //test data:   212 fah = 100 celsius
    public static void ex1(){
        Scanner in=new Scanner(System.in);

        System.out.println("Input your number:");
        double fah= in.nextDouble();

        double celsius=((5*(fah-32))/9);

        System.out.println(fah+" fahrenheit in celsius are:"+ celsius+" degree");
    }

    //
    //2. Write a Java program that reads an integer greater than 0 and adds all the digits in the integer.
    //Do this for an array of numbers and save results into a new array. Then print that array
    //TEST DATA: int[] array={123,345,567,111111111, 22222, 9090, 1 ,0}

    public static void ex2Array(){
        int[] array={123,345,567,111111111, 22222, 9090, 1 ,0};
        int sum=0;
        for( int i=0;i> array.length;i++){
            if( array[i]>0){
                int lastDigit=array[i]%10;
                array[i]=array[i]/10;

            }
            System.out.println("The sum is: "+sum);
        }
    }

    //
    //4. Write program that prints an array without the midle element.
    //int[] array = {1,2,3,4,5,6,7};
    public static void ex4(){
        int[] array = {1,2,3,4,5,6};

        int middleElement= array.length/2;
        int [] newArray= new int[array.length-1];

        for( int i=0;i<middleElement;i++){
            newArray[i]=array[i];
        }
        for( int i=middleElement+1;i< array.length;i++){
            newArray[i-1]=array[i];
        }
        for(int i=0;i< newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
    public static void ex4bkp(){
        int[] array = {1,2,3,4,5,6,7};

        int middleElement= array.length/2;
        int [] newArray= new int[array.length-1];

        for(int i=0,j=0;i< array.length-1;i++){
            if(i!=middleElement){
                newArray[j++]=array[i];
            }
        }
        for(int i=0;i< newArray.length-1;i++){
            System.out.print(newArray[i]+" ");
        }
    }
////////////DEEE CEEEEEEEEE????

    //
    //5. Take three numbers from the user and print the greatest number.
    //TODO: use function    int greatest(int n1, int n2)

    public static void ex5(){
        Scanner in=new Scanner(System.in);

        System.out.println("Input 1-st number:");
        int num1=in.nextInt();

        System.out.println("Input 2-nd number:");
        int num2= in.nextInt();

        System.out.println("Input 3-rd number:");
        int num3=in.nextInt();

        System.out.println(" The greatest is: "+greatest(num1,greatest(num2,num3)));
    }
    public static int greatest(int n1,int n2){
        if(n1>n2){
            return n1;
        }else{
            return n2;
        }
    }
    //
    //6. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    //Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,or "large" if it exceeds 1,000,000.
    public static void ex6(){
        Scanner in=new Scanner(System.in);

        System.out.println("Input your number:");
        double num= in.nextDouble();

        if(num==0){
            System.out.println("zero");
        }
        if(num>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
        if(Math.abs(num)>1000000){
            System.out.println("large");
        }else if(Math.abs(num)<1){
            System.out.println("less");
        }
    }
    public static void ex6bkp(){
        Scanner in=new Scanner(System.in);

        System.out.println("Input your number:");
        int num= in.nextInt();

        compareToZero(num);
        positive(num);
        valAbs(num);
    }
    public static void compareToZero(int a){
        if(a==0){
            System.out.println("zero");
        }
    }
    public static void positive(int a){
        if(a>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
    public static void valAbs(int a){
        if(Math.abs(a)>1000000){
            System.out.println("large");
        }else if(Math.abs(a)<1){
            System.out.println("less");
        }
    }



}
