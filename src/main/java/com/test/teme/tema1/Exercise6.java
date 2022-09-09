package com.test.teme.tema1;

public class Exercise6 {
    public static void main(String[] args) {

        //sa printeze numerele de la 1 la 20 de 3 ori
        int counter = 0;
        for (int i = 1; i <= 20; i++) {

            System.out.print(i + " ");
            if (i == 20) {
                counter += 1;
                i=0;
                System.out.println();
            }
            if (counter == 3) {
                break;
            }
        }
    }
}

