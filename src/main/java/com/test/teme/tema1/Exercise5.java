package com.test.teme.tema1;

//5.Afisez toate nr impare dar nu sunt div cu 5 intre 0-100
//in afara de cele intre 30 si 40
//in afara de cele care se termina in 3;
public class Exercise5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i += 2) {
            if(i==31){
                i=41;
            }
            if (i % 5 != 0  && i % 10 != 3)
                System.out.print(i + " ");
        }
    }

}
