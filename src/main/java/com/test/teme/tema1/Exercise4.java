package com.test.teme.tema1;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Random rand = new Random();
        String raspuns = "";
        int sum = 0;
        boolean playerLost = false;

        do {
            sum += 1 + rand.nextInt(10);
            System.out.println("valoarea mainii este " + sum);
            if (sum > 21) {
                System.out.println("Ai pierdut!");
                playerLost = true;
                break;
            }

            System.out.println("Mai vrei o carte? ");

            Scanner in = new Scanner(System.in);
            raspuns = in.nextLine();


        } while (raspuns.equals("da"));

        int casa = 0;
        boolean houseLost = false;
        if (!playerLost) {

            do {
                casa += 1 + rand.nextInt(10);
                if (casa > 21) {
                    System.out.println("Casa a pierdut");
                    houseLost = true;
                    break;
                }
                System.out.println("Valoarea mainii casei este " + casa);

            } while (casa < sum);
            if (!houseLost) {
                if (sum > casa) {
                    System.out.println("Ai castigat!");
                } else if (sum < casa) {
                    System.out.println("Casa a castigat!");
                } else {
                    System.out.println("Egalitate");
                }

            }

        }
    }
}