package QueuesNStuff;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BBQ {
    public static void main(String[] args) {
//        Queue<String> bbqLine=new LinkedList<String>() ;
//        bbqLine.add("Jackson");
//        bbqLine.add("Tyreek");
//        bbqLine.add("Susan");
//
//        System.out.println( bbqLine.peek());
//
//
//        System.out.println(bbqLine );


        Queue<String> q=new LinkedList<>();
        q.add("A");
        q.add("B");
        q.add("C");

        //q.poll();
        //System.out.println(q.poll());
        System.out.println(q.peek());

        //q.size();

        //System.out.println(q.contains("G"));

//p[oti sa il convertesti intr-un array si poti cere un anumit element din el de pe un anumit indx

        System.out.println(q.toArray()[1]);
        //cele mai importante sunt:
        //-poll(iti returneaza cine este primul la rand)

        //sau poti sa faci un peek la o persoana




    }
}
