package com.test.w3;

public class Bike extends Vehicle{
    private boolean hasPedals;
    private int numGears;

    Bike(String make, String model, int year, double price,boolean hasPedals,int numGears){
        super(make,model, year,price);
        this.hasPedals=hasPedals;
        this.numGears=numGears;
        System.out.println("Constructing a bike: Pedals- "+hasPedals+" and has "+numGears+" gears");
    }
    public boolean getHasPedals(){
        return hasPedals;
    }
    public void setHasPedals(boolean hasPedals){
        this.hasPedals=hasPedals;
    }
    public int getNumGears(){
        return  numGears;
    }
    public void setNumGears(int numGears){
        this.numGears=numGears;
    }
    Bike(){
        System.out.println("Constructing bike");
    }

}
