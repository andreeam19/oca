package com.test.w3.exercises;

/**
 * RAMAS LA pag. 161 , StringBuilder append
 */
public class Practica {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
    }

    public static void ex1() {
        int y = 10;
        final int x;
        if (y > 5) {
            x = 2 * y;
            System.out.println(x);
        } else {
            x = 3 * y;
            System.out.println(x);
        }
    }

    public static void ex2() {
        int y = 10;
        int x = (y > 5) ? (2 * y) : (3 * y);

    }
}
