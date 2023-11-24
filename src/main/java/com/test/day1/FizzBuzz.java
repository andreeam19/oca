package com.test.day1;

//FizzBuzz: Write a program that prints the numbers from 1 to 100. But for multiples of three, print "Fizz" instead
// of the number, and for the multiples of five, print "Buzz". For numbers which are multiples of both three and five,
// print "FizzBuzz".

//FizzBuzz: Scrieți un program care imprimă numerele de la 1 la 100. Dar pentru multipli de trei, tipăriți „Fizz” în
// loc de număr, iar pentru multiplii de cinci, tipăriți „Buzz”. Pentru numerele care sunt multipli de trei și
// cinci, tipăriți „FizzBuzz”.

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 16; i++) {
            System.out.print(i + " - ");
            if(i%3==0){
                System.out.print("Fizz");
            }
            if(i%5==0) {
                System.out.print("Buzz");
            }
            System.out.println();
        }

    }
    public static void Fizz1(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }


}
