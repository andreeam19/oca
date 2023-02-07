package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetShop {
    public static int id = 0;

    public static int generateId() {
        return id++;
    }

    public static void main(String[] args) {

        List<Dog> database = new ArrayList<>();
        Dog d2 = new Dog(generateId(), "Lola", "medie", 5, "scurta");
        Dog d3 = new Dog(generateId(), "Lulu", "mica", 5, "scurta");
        Dog d4 = new Dog(generateId(), "Grivei", "mare", 5, "scurta");
        database.add(d2);
        database.add(d3);
        database.add(d4);

        boolean isProgramRunning = true;
        Scanner scanner = new Scanner(System.in);

        while (isProgramRunning) {

            showMenu();

            System.out.println("\nIntroduce-ti optiunea aleasa: (1,2 sau 3)");
            int optiune = scanner.nextInt();

            pickOption(database, optiune);

            isProgramRunning = isProgramStillRunning(isProgramRunning);

        }

        scanner.close();
    }

    private static boolean isProgramStillRunning(boolean isProgramRunning) {
        System.out.println("\n\nInsert 'exit' to leave program. Enter anything else to go back to menu.");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        if (response.equals("exit")) {
            isProgramRunning = false;
        }
        return isProgramRunning;
    }

    private static void pickOption(List<Dog> database, int optiune) {
        switch (optiune) {
            case 1:
                showAllDogs(database);
                break;
            case 2:
                addDog(database);
                break;
            case 3:
                removeDog(database);
                break;
            default:
                System.out.println("Optiune invalida.");
        }
    }

    private static void removeDog(List<Dog> database) {
        Scanner sc1 = new Scanner(System.in);
        int response = sc1.nextInt();
        for (int i = 0; i < database.size(); i++) {

            Dog dog = database.get(i);
            if (dog.getId()==response) {
                database.remove(dog);
                return;
            }
        }

        System.out.println("Dog not found");


        // TODO: Remove dog based on name
        // citesti de la tastatura numele
        // verifici daca exista in lista
        // stergi din lista

    }

    private static void showAllDogs(List<Dog> database) {
        System.out.println("==== LISTA CATEI ====");
        for (Dog d : database) {
            d.printDogDetails();
        }
        System.out.println("\n");
    }

    public static void showMenu() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("---------------------");
        System.out.println("---  PetShop 1.0  ---");
        System.out.println("---------------------\n\n");

        System.out.println("MENU");
        System.out.println("1. Listare animale");
        System.out.println("2. Adauga animal");
        System.out.println("3. Sterge animal");
    }

    //    String nume;
//    public int varsta;
//    private String talie;
//    private String tipBlana;
    private static void addDog(List<Dog> database) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ADAUGARE DOG:");
        Dog dog = new Dog();

        dog.setId(generateId());

        System.out.println("Introdu numele...");
        String nume = scanner.nextLine();
        dog.setNume(nume);

        System.out.println("Introdu talie:");
        String talie = scanner.nextLine();
        dog.setTalie(talie);

        System.out.println("Introdu tipul de blana:");
        String tipBlana = scanner.nextLine();
        dog.setTipBlana(tipBlana);

        System.out.println("Introdu varsta");
        int varsta= scanner.nextInt();
        dog.setVarsta(varsta);

        // TODO: set other fields

        database.add(dog);
    }


//    public static void oldCode() {
//        Dog d1 = new Dog("Azorel", "medie", 5, "scurta");
//        d1.printDogDetails();
//
//        Cat c = new Cat("Tom", 4, "metis");
//        c.printCatDetails();
//
//        Dog d2 = new Dog("Lola", "medie", 5, "scurta");
//        Dog d3 = new Dog("Lulu", "mica", 5, "scurta");
//        Dog d4 = new Dog("Grivei", "mare", 5, "scurta");
//
//        ArrayList<Dog> list = new ArrayList<>();
//        list.add(d1);
//        list.add(d2);
//        list.add(d3);
//        list.add(d4);
//
//        for (Dog d : list) {
//            d.printDogDetails();
//        }
//    }
}
