package com.test.teme.tema1;

import java.util.Random;
import java.util.Scanner;

//mai intai te intreaba: Vrei sa joci?
//daca da: 2 rantomuri si le afisez
//joaca si pt calculator
//iti spune daca ai gastigat sau ai pierdut si te intreaba daca mai vrei sa dai cu zarul
public class Zaruri {
    public static void main(String[] args) {
        Random rand = new Random();
        String raspunsulMeu = "";
        String raspunsRobot = "";

        int x = 0;
        int y = 0;
        System.out.println("Vrei sa joci?");
        Scanner in = new Scanner(System.in);
        raspunsulMeu=in.nextLine();

        while (raspunsulMeu.equals("da")) {

            x = 1 + rand.nextInt(5);
            y = 1 + rand.nextInt(5);
            int sum1 = x + y;
            System.out.println("REZULTATUL MEU");
            System.out.println("Primul zar are valoarea: " + x + "\nAl doilea zar are valoarea: " + y + "\nValoarea totala este: " + sum1);


            System.out.println();
            int a = 1 + rand.nextInt(5);
            int b = 1 + rand.nextInt(5);
            int sum2 = a + b;
            System.out.println("RASPUNS ROBOT :");
            System.out.println("Primul zar are valoarea:" + a + "\nAl doilea zar are valoarea " + b + "\nValoarea totala este:" + sum2);
            System.out.println();

            if (sum1 > sum2) {
                System.out.println("Ai castigat!");
            } else if (sum1 < sum2) {
                System.out.println("Ai pierdut!");
            } else {
                System.out.println("Egalitate!");
            }
            System.out.println("Vrei sa mai joci? ");
            raspunsulMeu = in.nextLine();
        }


    }


}
