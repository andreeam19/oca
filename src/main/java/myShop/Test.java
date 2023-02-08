package myShop;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        String nume="Andreea";
        printUpperCase(nume);
        printFirstLetter(nume);
        printCharacter(nume.charAt(1));
    }

    public static void printUpperCase(String nume){
        System.out.println(nume.toUpperCase());

    }

    public static void printFirstLetter(String nume){
        System.out.println(nume.charAt(0));
    }

    public static void printCharacter( char caracter){
        System.out.println(caracter);
    }
}
