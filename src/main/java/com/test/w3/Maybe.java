package com.test.w3;

import java.util.Scanner;

public class Maybe {
    public static void main(String[] args) {

    }

    public static void ex2bkp(){
        int[] array={123, 234, 345};

        for(int i=0;i< array.length-1;i++){

        }
    }
    public static void sumOfDigits(int value){
        int sum=0;
        int val=value;

        while(value>0){
            int lastDigit=value%10;
            sum+=lastDigit;
            value=value/10;

        }
        System.out.println("The sum of digits for "+val+" = "+sum);
    }
    public static void ex4bkp( ){
        int num=1;
        Scanner in=new Scanner(System.in);

        int greatest=0;

        while (num>0){
            System.out.println("input your number:");
            num=in.nextInt();
            if(num>greatest){
                greatest=num;
            }
        }

        System.out.println("Cel mai mare este:"+greatest);
    }
}
