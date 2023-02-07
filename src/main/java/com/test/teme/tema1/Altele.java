package com.test.teme.tema1;

public class Altele {
    public static void main(String[] args) {
ex2();

    }
    public static void ex2(){
        int i=20;
        while(true){
            System.out.print(i+" ");
            i++;
            if(i==31){
                i=1;
                System.out.println();
            }
            if(i==11){
                break;
            }
        }
    }

    public static void ex1(){
        int count=0;
        for(int i=20;i<=30;i++){
            System.out.print(i+ " ");
            if(i==30){
                i=0;
                System.out.println();

            }
            if(i==10){
                break;
            }
        }

        System.out.println();
    }

}
