package com.test.w3;

public class Polygon {
    protected int sides;

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    Polygon(int sides) {
        this.sides = sides;
        System.out.println("Constructing a polygon");
    }

    public String toString() {
        return "polygon " +sides + " sides";

    }

}
