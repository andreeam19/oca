package com.test.w3.exercises;

import java.util.Scanner;

public class Test {
    //citesc de la tastaTURA 1 nr . daca e par sa se termine citirea, daca e impar, sa se incerce iar
    public static void main(StringExercices[] args) {
         StringBuilder sb = new StringBuilder("animals");
         sb.insert(7, "-"); // sb = animals
         sb.insert(0, "-"); // sb = -animals
         sb.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb);
    }

    //1. 2 nr tastatura. afisez nr pare din interval
    //2.  iei de la tastatura nume si varsta si daca nu sunt valite, le reintroduci
    public static void interval() {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int a = in.nextInt();

        System.out.println("Input second number: ");
        int b = in.nextInt();

        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % 2 == 1) {
            a++;
        }
        for (int i = a; i <= b; i+=2) {
            System.out.print(i + " ");
        }
    }
    public static void prezentare(){

        Scanner in= new Scanner(System.in);

        System.out.println("Input the name:");
        String name= in.next();

        while(name.length()<3){
            System.out.println("Input another name. This is too short");
            name=in.next();
        }
        System.out.println("Input your age:");
        int age= in.nextInt();


        while(isNotActive(age)){
            System.out.println("Input another number");
            age=in.nextInt();
        }
        System.out.println("Your name is :"+name+ " and you have : "+ age+ " years");


    }
    public static boolean isNotActive( int age){
        return age<18 || age>64;

    }


}


