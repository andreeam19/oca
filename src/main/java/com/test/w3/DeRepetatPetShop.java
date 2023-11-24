package com.test.w3;

import shop.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeRepetatPetShop {
    //afiseaza meniul
    //apoi apasa enter sa dai exit
    public static int id = 0;

    public static int generateId() {
        return id++;
    }

    public static void main(String[] args) {
        List<Dog> database = new ArrayList<>();

        Dog d1 = new Dog(generateId(), "Azorel", "medie", 2, "scurta");
        Dog d2 = new Dog(generateId(), "Lola", "mica", 3, "lunga");
        Dog d3 = new Dog(generateId(), "Lilica", "mare", 5, "scurta");
        Dog d4 = new Dog(generateId(), "Ronica", "mica", 6, "medie");
        database.add(d1);
        database.add(d2);
        database.add(d3);
        database.add(d4);

        boolean isProgramRunning = true;
        Scanner in = new Scanner(System.in);

        while (isProgramRunning) {
            showMenu();

            System.out.println("Input you option: (1, 2 sau 3)");
            int option = in.nextInt();

            pickOption(database, option);
        }

    }

    public static void pickOption(List<Dog> database, int optiune) {
        switch (optiune) {
            case 1:
                showAllDogs(database);
                break;
            case 2:
                addDog(database);
                break;
            default:
                System.out.println("Introdu o optiune valida");
        }
    }

    public static void showAllDogs(List<Dog> database) {
        System.out.println("LISTA CATEI:");
        for (Dog d : database) {
            d.printDogDetails();

        }
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void showMenu() {
        System.out.println("----------------");
        System.out.println("--- Pet shop ---");
        System.out.println("----------------\n\n");


        System.out.println("MENU");
        System.out.println("1.Listare animale");
        System.out.println("2.adauga animal");
        System.out.println("3.Sterge animal");

    }

    //adauga dog (creaza dog), apoi adauga : id, nume, talie varsta=> adauga dog
    public static void addDog(List<Dog> database){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ADAUGA DOG:");
        Dog dog=new Dog();


        dog.setId(generateId());

        System.out.println("Introdu nume");
        String nume= scanner.nextLine();
        dog.setNume(nume);

        System.out.println("Introdu talie:");
        String talie= scanner.nextLine();
        dog.setTalie(talie);

        System.out.println("Introdu varsta:");
        int varsta=scanner.nextInt();
        dog.setVarsta(varsta);

        System.out.println("Introdu tipul taliei:");
        String tipBlana=scanner.nextLine();
        dog.setTipBlana(tipBlana);

        database.add(dog);

    }

}