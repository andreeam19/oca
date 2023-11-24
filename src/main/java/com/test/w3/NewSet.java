package com.test.w3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class NewSet {
    public static void main(String[] args) {
        ex2bkp2();
    }

    /*
    1.Write a program that reverses a String input and returns the reverted String.
    2. Write program that prints an array without the midle element.
            int[] array = {1,2,3,4,5,6};
     */
    public static void ex1(){
        String str="A B C D E F";

        StringBuilder str1=new StringBuilder();

        str1.append(str);

        str1.reverse();

        System.out.println(str1);

    }


    public static void ex2(){
        int[] array = {1,2,3,4,5,6,7};
        List<String> list = new ArrayList(Arrays.asList("1","2","3","4","5","6","7"));

        int mid= array.length/2;

        System.out.println("MId index:"+mid);
        list.remove(mid);

        System.out.println(list);
    }
    public static void ex2bkp(){
        int[] array = {1,2,3,4,5,6};
        System.out.println("Original array:"+Arrays.toString(array));

        int removeMiddle= array.length/2;

        for(int i=removeMiddle;i< array.length-1;i++){
            array[i]=array[i+1];

        }
        System.out.println("After removing the midle element: "+Arrays.toString(array));
        System.out.println();

        int[] newArray= new int [array.length-1];
        for(int i=0;i< array.length-1;i++){
            newArray[i]=array[i];
        }
        System.out.println(" New Array is: "+Arrays.toString(newArray));

    }
    //if i++
    public static void ex2bkp2(){
        int[] array = {1,2,3,4,5,6};
        int[] newArray=new int[array.length-1];
        System.out.println("Original array:"+Arrays.toString(array));
        int mid= array.length/2;

        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length-1;j++){
                if(i==mid){
                    newArray[i]=

                    i++;
                }
            }
        }
        System.out.println("New Array: "+Arrays.toString(array));

    }


}
