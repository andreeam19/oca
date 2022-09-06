package com.test.teme.tema1;

//0-100, pana la 50 sa printeze cate 10 pe rand, dupa 50 sa printeze cate 5 pe rand
public class Exercise3 {
    public static void main(String[] args) {
        int numbersPerLine = 0;
        int counter = 0;

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
            counter++;
            if (counter>50) {
                numbersPerLine = 5;
                ;
            } else {
                numbersPerLine = 10;
            }
            if(counter %numbersPerLine==0){
                System.out.println( );
            }
        }
    }
}
