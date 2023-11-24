# Exercises set 1
1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. (read temperature from console.  
formula:    celsius = (5 * (fah-32))/9) 
test data:   212 fah = 100 celsius

2. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

3. Write a Java program to convert minutes into a number of years and days.

5. Take three numbers from the user and print the greatest number. 
TODO: use function    int greatest(int n1, int n2)

6. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,or "large" if it exceeds 1,000,000.

# Exercises set 2
1. Write a program to print all odd numbers from 10 to 30.

2. Write a program in Java to display n terms of natural numbers and their sum.

3. Write a program that reverses a String input.

4. Write a program that prints the elements of next array in reverse order: int array[] = {1,2,3,4,5,5,6,7,8,9};

5. Write a program that prints the sum of all elements of next array: int array[] = {1,2,3,4,5,5,6,7,8,9};


Exemple mostenire
1.com.test.Person
public class com.test.Person {
protected String name;
protected int age;

public class Employee extends com.test.Person {
private int id;
private double salary;

@Override
public String toString() {
return name +" "+ age +" "+ salary;

2.Vehicle

public class Vehicle {
private String make;
private String model;
private int year;
private double price;

public class Employee extends com.test.Person {
private int id;
private double salary;

@Override
public String toString() {
return name +" "+ age +" "+ salary;

public class Bike extends Vehicle{
private boolean hasPedals;
private int numGears;

public class com.test.Car extends Vehicle {
private int numSeats;

3.Polygon
public class Polygon {
protected int sides;

public class Square extends Polygon{
Square(){
super(4);
System.out.println("Costructing a square");
}
public String toString(){
return "patratul e patrat";
}

4.Animal

public class Animal {
private String name;

public class Dog extends Animal {
private int teeth;

public class Pudel extends Dog{
public Pudel(){
super();
System.out.println("I am a super pudel");
}
