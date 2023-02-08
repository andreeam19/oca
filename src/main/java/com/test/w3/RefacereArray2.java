package com.test.w3;

public class RefacereArray2 {
    public static void main(String[] args) {
        //int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        ex3bkp3();

    }

    ////2. Write a Java program to sum values of an array
    public static void ex2() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int sum = 0;

        for (int i : my_array) {
            sum += i;

        }
        System.out.println("Suma este: " + sum);
    }

    //3. Write a Java program to print the following grid. Go to the editor
//
//Expected Output :
//
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
    public static void ex3() {
        char[][] a = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //cu counter
    public static void ex3bkp() {
        int[][] b = new int[4][4];
        int counter = 0;

        //put values
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = counter++;
            }
        }
        //print matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n Print diagonala:");
        for (int i = 0; i < 4; i++) {
            System.out.print(b[i][i] + " ");
        }
    }

    //array il declar eu val si printeaza toate valorile din array
    public static void ex3bkp2() {
        String[] ingrediente = {"lapte", "oua", "zahar", "faina", "esenta"};
        int[] cantitate = {500, 5, 300, 300, 1};
        System.out.println("Pentru clatite ai nnevoie de :");
        System.out.println(cantitate[2] + " grame" + ingrediente[2]);

        System.out.println("ingrediente:" + ingrediente.length);
        String s = "abc";
        s.length();
    }

    //creez un array si pun val de la 1 pana la 5 si il pun de mana
    //printeaza
    public static void ex3bkp3() {
        String[] cumparaturi = new String[4];
        cumparaturi[0] = "rochii";
        cumparaturi[1] = "pantofi";
        cumparaturi[2] = "cercei";

        System.out.println("Andreea are nevoie de urmatoarele cumparaturi:");
        System.out.println("->" + cumparaturi[0]);
        System.out.println("->" + cumparaturi[1]);
        System.out.println("->" + cumparaturi[2]);

        for (int i = 0; i < cumparaturi.length; i++) {
            System.out.println(cumparaturi[i]);
        }
    }
    //creez un array int de dimensiune 6.
    //declar pe fiecare pozitie
    //apoi cer sa mi le printeze de la inceput la sfarsit si invers
    public static void ex3bkp4(){
        int[] numere=new int[6];
        numere[0]=12;
        numere[1]=13;
        numere[2]=14;
        numere[3]=15;
        numere[4]=16;
        numere[5]=17;

        System.out.println("Inainte:");
        for(int i=0;i< numere.length;i++){
            System.out.println(numere[i]+" ");
        }
        System.out.println();

        System.out.println("Inapoi:");
        for(int i= numere.length-1;i>0;i--){
            System.out.println(numere[i]+" ");
        }

    }
    ////4. Write a Java program to calculate the average value of array elements.
    public static void ex4(){
        int num[]=new int[]{10,20,30,40,50};

        int sum=0;

        for(int i=0;i< num.length;i++){
            sum=sum+num[i];

        }
        double average=sum/ num.length;
        System.out.println("Average value of the array elements is:"+average);
    }

    //5. Write a Java program to test if an array contains a specific value.
    public static void ex5(){
        int a[]={5,6,7,8};
        boolean found7=false;
        boolean found8=false;

        for(int i=0;i<a.length;i++){
            if(a[i]==7){
                found7=true;
            }
            if(a[i]==8){
                found8=true;

            }
        }
        System.out.println(found7 && found8 ?"gasit":"negasit");
    }

    //6. Write a Java program to find the index of an array element.


////7. Write a Java program to remove a specific element from an array
    //remove the second element(index->1, value->14) of the array


    //8. Write a Java program to copy an array by iterating the array


    //9. Write a Java program to insert an element (specific position) into an array.

    //10. Write a Java program to find the maximum and minimum value of an array.

    ////11. Write a Java program to reverse an array of integer values.
}
