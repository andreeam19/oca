package com.test.oop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class Main {
    //first name , surname,,phoneNumber
    public static void main(String[] args) {
        Person p1 = new Person("Andreea", "Munteanu", "0756456768");

        Person p2 = new Person("Andrei", "Aioanei", "0938475739");


        p1.printInitials();
        System.out.println(p1.getShortDetails());

        Person.areInTheSameNetwork(p1,p2);
    }


}
