package com.test.teme.tema1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "";
        do {
            System.out.println("Input your name : ");
            name = in.nextLine();
        } while (name.length() < 3);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        while (age < 18 || age > 90) {
            System.out.println("Input your age again: ");
            age = in.nextInt();
        }
        System.out.println("Your name is " + name + " and you have " + age + " years");
    }
}
