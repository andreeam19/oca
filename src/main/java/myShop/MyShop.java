package myShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop {

    public static int id = 0;

    public static int generateId() {
        return id++;
    }

    public static void main(String[] args) {
        List<Dress> database = new ArrayList<>();
        Dress d1 = new Dress(generateId(), "cocktail dress", 'm', "blue", 7);
        Dress d2 = new Dress(generateId(), "summer dress", 's', "red", 10);
        Dress d3 = new Dress(generateId(), "wedding dress", 's', "white", 5);
        database.add(d1);
        database.add(d2);
        database.add(d3);


        boolean isProgramRunning = true;
        Scanner scanner = new Scanner(System.in);

        while (isProgramRunning) {
            showMenu();

            System.out.println("\nInput your option: (1, 2 or 3)");
            int optiune = scanner.nextInt();

            pickOption(database, optiune);

            isProgramRunning = isProgramStillRunning(isProgramRunning);


        }
        scanner.close();


    }

    private static boolean isProgramStillRunning(boolean isProgramRunning) {
        System.out.println("\n\nInsert 'exit' to leave program.Enter anything else to go back to menu,");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        if (response.equals("exit")) {
            isProgramRunning = false;
        }
        return isProgramRunning;
    }


    public static void showMenu() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("-------------------");
        System.out.println("----  MyShop  -----");
        System.out.println("-------------------\n\n");

        System.out.println("MENU");
        System.out.println("1.Listare haine:");
        System.out.println("2.Adauga haine");
        System.out.println("3.Sterge animal");
    }

    public static void addDress(List<Dress> database) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adaugare rochie: ");

        Dress dress = new Dress();

        dress.setId(generateId());

        System.out.println("Introdu nume");
        String nume = scanner.nextLine();
        dress.setNume(nume);

        System.out.println("Introdu marimea:");
        String result = scanner.nextLine();
        if (result.length() > 0) {
            dress.setSize(result.charAt(0));
        }
        System.out.println("Introdu culoarea:");
        String colour = scanner.nextLine();
        dress.setColour(colour);

        System.out.println("Introdu stoc:");
        int stoc = scanner.nextInt();
        dress.setStoc(stoc);

        database.add(dress);
    }
    //private int id;
    //    private String nume;
    //    private char size;
    //    private String colour;
    //    private int stoc;

    public static void pickOption(List<Dress> database, int optiune) {
        switch (optiune) {
            case 1:
                showAllDresses(database);
                break;
            case 2:
                addDress(database);
                break;
            case 3:
                removeDress(database);
                break;
            default:
                System.out.println("Optiune invalida.");

        }
    }

    public static void removeDress(List<Dress> database) {
        Scanner sc1 = new Scanner(System.in);

        int response = sc1.nextInt();

        for (int i = 0; i < database.size(); i++) {

            Dress dress = database.get(i);
            if (dress.getId() == response) {
                database.remove(dress);
                return;
            }
        }
    }

    private static void showAllDresses(List<Dress> database) {
        System.out.println("===== LISTA ROCHII =====");
        for (Dress d : database) {
            d.printDressDetails();
        }
        System.out.println("\n");
    }
}
