package com.test.teme.tema1;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int x = in.nextInt();

        System.out.println("Input second number: ");
        int y = in.nextInt();

        if (x == y) {
            System.out.println("Numbers should not be equal!");
        }
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        if (x % 2 == 1) {
            x += 1;
        }
        int count = 0;
        int numbersPerLine = 0;

        for (int i = x; i <= y; i += 2) {
            System.out.print(i + " ");
            count++;
            if (y - x > 50) {
                numbersPerLine = 10;
            } else {
                numbersPerLine = 5;
            }
            if (count % numbersPerLine == 0) {
                System.out.println();
            }

        }


    }

}



