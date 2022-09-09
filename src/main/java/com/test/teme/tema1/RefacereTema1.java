package com.test.teme.tema1;

import java.util.Random;
import java.util.Scanner;

public class RefacereTema1 {
    public static void main(String[] args) {
        exZaruri();
    }

    //1. Create a class called Exercise1 with the main() method which:
    //- asks user to insert 2 numbers and prints out all the even numbers between them
    //- if numbers are equal, show the message: "Numbers should not be equal!" and end the program
    //- if the interval has more than 50 numbers, prin them 10 per row or else 5 per row
    public static void exercise1() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = in.nextInt();

        System.out.println("Input the second number: ");
        int y = in.nextInt();

        if (x == y) {
            System.out.println("Numbers should not be equal!");
        }
        if (y < x) {
            int temp = x;
            x = y;
            y = temp;
        }
        if (x % 2 == 1) {
            x += 1;
        }
        int count = 0;
        int printPerLine=0;
        for (int i = x; i <= y; i += 2) {
            System.out.print(i + " ");
            count++;
            if (y - x >= 50) {
                printPerLine = 10;
            } else {
                printPerLine = 5;
            }
            if (count % printPerLine == 0) {
                System.out.println();
            }
        }

    }
    //2. Create a class called Exercise2 with the main() method which:
    //- allows user to insert from terminal his name, age
    //- if name is under 2 chars then the user will asked to reenter the name
    //- if age is under 18 or over 90 chars then the user will asked to reenter his age

    public static void exercise2() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();

        while (name.length() <= 2) {
            System.out.println("Input your name: ");
            name = in.nextLine();
        }

        System.out.println("Input your age: ");
        int age = in.nextInt();

        while (age < 18 || age > 90) {
            System.out.println("Input your age:");
            age = in.nextInt();
        }
        System.out.println(" Your name is " + name + " and you have " + age + " years");
    }

    //3. 0-100, pana la 50 sa printeze cate 10 pe rand, dupa 50 sa printeze cate 5 pe rand
    public static void exercise3() {
        int counter = 0;
        int numbersPerLine = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            counter++;
            if (counter > 50) {
                numbersPerLine = 5;
            } else {
                numbersPerLine = 10;
            }
            if (counter % numbersPerLine == 0) {
                System.out.println();
            }
        }
    }

    //4. Blackjack
    //- give user a random number between 1 and 11
    //- ask him if he wants one more? (if he says 0 then stop, if he says something else give him another number)
    //- add user numbers to see if they are equal to 21
    public static void exercise4() {
        Random rand = new Random();

        String raspuns = "";
        int sum = 0;
        boolean playerLost = false;
        do {
            sum += 1 + rand.nextInt(10);
            System.out.println("Valoarea mainii tale este " + sum);

            if (sum > 21) {
                System.out.println("Ai pierdut! ");
                playerLost = true;
                break;
            }
            System.out.println("Mai vrei o carte? ");

            Scanner in = new Scanner(System.in);
            raspuns = in.nextLine();

        } while (raspuns.equals("da"));

        int casa = 0;
        boolean casaAPierdut = false;
        if (!playerLost) {
            do {
                casa += 1 + rand.nextInt(10);
                if (casa > 21) {
                    System.out.println("Casa a pierdut!");
                    casaAPierdut = true;
                    break;
                }
                System.out.println("Valoarea mainii casei este " + casa);
            } while (casa < sum);

            if (!casaAPierdut) {
                if (sum > casa) {
                    System.out.println("Ai castigat!");
                } else if (sum < casa) {
                    System.out.println("Casa a castigat");
                } else {
                    System.out.println("Egalitate");
                }
            }
        }


    }

    ////5.Afisez toate nr impare dar nu sunt div cu 5 intre 0-100
    ////in afara de cele intre 30 si 40
    ////in afara de cele care se termina in 3;
    public static void exercise5() {
        for (int i = 1; i <= 100; i += 2) {
            if (i == 31) {
                i = 41;
            }
            if (i % 5 != 0 && i % 10 != 3)
                System.out.print(i + " ");
        }
    }
    //6//sa printeze numerele de la 1 la 20 de 3 ori

    public static void exercise6() {

        int counter = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
            if (i == 20) {
                counter++;
                i = 0;
                System.out.println();

                if (counter == 3) {
                    break;
                }
            }
        }
    }
    ////mai intai te intreaba: Vrei sa joci?
    ////daca da: 2 rantomuri si le afisez
    ////joaca si pt calculator
    ////iti spune daca ai gastigat sau ai pierdut si te intreaba daca mai vrei sa dai cu zarul

    public static void exZaruri(){
        Random rand= new Random();
        String raspunsulMeu=" ";
        int x=0;
        int y=0;
        System.out.println("Vrei sa joci?");
        Scanner in= new Scanner(System.in);
        raspunsulMeu= in.nextLine();

        while(raspunsulMeu.equals("da")){
            x=1+ rand.nextInt(5);
            y=1+ rand.nextInt(5);

            int sum1=x+y;
            System.out.println("Rezultatul meu!");
            System.out.println("Primul zar are valoarea "+ x+ " si al doilea zar are valoarea "+y+"\nSuma lor este:"+sum1);

            System.out.println();
            int a=1+rand.nextInt(5);
            int b=1+ rand.nextInt(5);

            int sum2=a+b;
            System.out.println("Rezultat robot !");
            System.out.println("Primul zar are valoarea "+a+"\nAl doilea zar are valoarea "+b+"\nSuma lor este "+sum2);

            if(sum1<sum2){
                System.out.println("Robotul a castigat");
            }else if(sum1>sum2){
                System.out.println("Ai castigat!");
            }else{
                System.out.println("Egalitate!");
            }
            System.out.println("Vrei sa mai joci");
            raspunsulMeu= in.nextLine();
        }
    }
}