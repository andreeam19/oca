package com.test.teme.tema1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class RefacereTema1secondPart {
    public static void main(String[] args) {
        ex3();
    }
    //1. Create a class called Exercise1 with the main() method which:
    //- asks user to insert 2 numbers and prints out all the even numbers between them
    //- if numbers are equal, show the message: "Numbers should not be equal!" and end the program
    //- if the interval has more than 50 numbers, prin them 10 per row or else 5 per row

   public static void ex1(){

        Scanner in= new Scanner(System.in);

       System.out.println("Input first number:");
       int x=in.nextInt();

       System.out.println("Input the second number:");
       int y=in.nextInt();

       if(x==y){
           System.out.println("Numbers should not be equal!");
       }
       if(x>y){
           int temp=x;
           x=y;
           y=temp;

       }
       if(x%2==1){
           x+=1;
       }
       int counter=0;
       int numbersPerRows=0;
        for(int i=x;i<=y;i+=2){
            System.out.print(i+" ");
            counter++;
             if(y-x>50){
                 numbersPerRows=10;
             }else{
                 numbersPerRows=5;
             }
            if(counter%numbersPerRows==0){
                System.out.println();
            }
        }
   }


//2. Create a class called Exercise2 with the main() method which:
//- allows user to insert from terminal his name, age
//- if name is under 2 chars then the user will asked to reenter the name
//- if age is under 18 or over 90 chars then the user will asked to reenter his age
//
    public static void ex2(){
        Scanner in=new Scanner(System.in);

        System.out.println(" Input your name: ");
        String name=in.nextLine();

        while(name.length()<3){
            System.out.println("Input your name");
            name=in.nextLine();
        }
        System.out.println("Input your age:");
        int age= in.nextInt();

        while( age<18 ||age>90){
            System.out.println("Input your age:");
            age= in.nextInt();
        }
        System.out.println("your name is"+name+ " and you have "+ age+ " years");
    }
//3. 0-100, pana la 50 sa printeze cate 10 pe rand, dupa 50 sa printeze cate 5 pe rand

    public static void ex3(){
        int numbersPerRaw=0;
        int counter=0;
        for (int i=0;i<=100;i++){
            System.out.print(i+" ");
            counter++;
            if(counter>50){
                numbersPerRaw=10;
            }else{
                numbersPerRaw=5;
            }
            if (counter%numbersPerRaw==0){
                System.out.println();
            }
        }
    }
//4. Blackjack
//- give user a random number between 1 and 11
//- ask him if he wants one more? (if he says 0 then stop, if he says something else give him another number)
//- add user numbers to see if they are equal to 21
    public static void ex4(){
        Random rand=new Random();
        String raspuns="";
        int sum=0;
        boolean playerLost=false;
        do {
            sum+=1+ rand.nextInt(10);
            System.out.println("Valoarea mainii este"+sum);

            if(sum>21){
                System.out.println("ai pierdut");
                playerLost=true;
                break;
            }
            System.out.println(" Mai vrei o carte?");

            Scanner in=new Scanner(System.in);
            raspuns=in.nextLine();

        }while(raspuns.equals("da"));

    }
//
//5.Afisez toate nr impare dar nu sunt div cu 5 intre 0-100
//in afara de cele intre 30 si 40
//in afara de cele care se termina in 3;
//
//6//sa printeze numerele de la 1 la 20 de 3 ori
//
//7.Zaruri
//   -mai intai te intreaba: Vrei sa joci?
//   -daca da: 2 rantomuri si le afisez
//   -joaca si pt calculator
//   -iti spune daca ai gastigat sau ai pierdut si te intreaba daca mai vrei sa dai cu zarul
}
