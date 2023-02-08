package com.test.test;

public class Fabrica {
    public String marca;
    public int pret;

    public Fabrica(String marca, int pret) {
        this.marca = marca;
        this.pret = pret;
    }

    public String descriere(){
        return marca +" "+pret;

    }
    public static String material(){
        return "fer";
    }

    public static void main(String[] args) {
        Fabrica m1 = new Fabrica("Audi", 12);
        Fabrica m2 = new Fabrica("BMW", 11);

        System.out.println(m1.descriere());
        System.out.println(Fabrica.material());

        Person.getCode();


    }
}
