package com.test.oop;

public class Person {
    //first name , surname,,phoneNumber
    private String firstName;
    private String surname;
    private String phoneNumber;

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        if(firstName == null || firstName.length() < 2) {
            throw new RuntimeException("Ti-ai batut joc, animala!");
        }
        this.firstName=firstName;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        if(surname == null || surname.length() < 2) {
            System.out.println("Nu e in parametrii ceruti");
        }
        this.surname=surname;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber( String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public Person(String firstName, String surname){
        if(firstName == null || firstName.length() < 2 ) {
            throw new RuntimeException("Nu e in parametrii ceruti!");
        }
        if(surname == null || surname.length() < 2) {
            throw new RuntimeException("Nu e in parametrii ceruti");
        }
        this.firstName=firstName;
        this.surname=surname;
    }
    public Person(String firstName, String surname, String phoneNumber){
        if(firstName == null || firstName.length() < 2 ) {
            throw new RuntimeException("Nu e in parametrii ceruti!");
        }
        if(surname == null || surname.length() < 2) {
            System.out.println("Nu e in parametrii ceruti");
        }
        if(phoneNumber ==null ||phoneNumber.length()!=10){
            throw new RuntimeException("Nu e de dimensiunea ceruta");
        }
        this.firstName=firstName;
        this.surname=surname;
        this.phoneNumber=phoneNumber;

    }
    public void print(){
        System.out.println(getFirstName()+ " "+getSurname()+" / "+ getPhoneNumber());
    }
    public void printInitials(){
        System.out.println(firstName.substring(0,1)+"."+surname.substring(0,1)+". ");
    }

    //getShortDetails
    public String getShortDetails(){
        return firstName+phoneNumber;
    }
    public static void areInTheSameNetwork(Person p1, Person p2){
        if(p1.getPhoneNumber().substring(0,3).equals(p2.getPhoneNumber().substring(0,3))){
            System.out.println("They are in the same network");
        }else{
            System.out.println("They have different network");
        }
    }
}
