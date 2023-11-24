package Poly;

public class Birdy {
    public String getName(){
        return "Unknown";
    }
    public void displayInformation(){
        System.out.println("The bird name is: "+getName());
    }
    public static void main(String[] args) {
        Birdy birdy=new Peacock();
        birdy.displayInformation();
    }
}
class Peacock extends Birdy{
    public String getName(){
        return "Peacock";
    }
}
