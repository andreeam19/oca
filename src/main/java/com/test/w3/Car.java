package com.test.w3;

public class Car extends Vehicle {
    private int numSeats;

    Car(int numSeats,String make, String model, int year,double price){
        super(make, model, year, price);
        this.numSeats=numSeats;
        System.out.println("Constructing a car: number of seats: "+numSeats+" ,made by "+make+", model: "+model+",from "+ year+", price"+price);
    }
    public int getNumSeats(){
        return numSeats;
    }
    public void setNumSeats(int numSeats){
        this.numSeats=numSeats;
    }
    Car(){
        System.out.println("Constructing car");
    }
}
