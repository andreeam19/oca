package myShop;


public class Dress {

    // id, nume, marime, culoare, int stoc

    private int id;
    private String nume;
    private char size;
    private String colour;
    private int stoc;

    public Dress(){

    }
    public Dress(int id, String nume){
        this.id=id;
        this.nume=nume;

    }
    public Dress( int id, String nume,char size,String colour,int stoc){
        this.id=id;
        this.nume=nume;
        this.size=size;
        this.colour=colour;
        this.stoc=stoc;

    }
    public void printDressDetails(){
        System.out.println(id+"-"+nume+" - "+size+" - "+colour+ " - "+stoc+" - ");
    }

    public void setId(int id){
        this.id=id;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public void setSize(char size){
        this.size=size;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public void setStoc(int stoc){
        this.stoc=stoc;
    }

    public int getId() {
        return id;
    }
    public String getNume(){
        return nume;
    }
    public char getSize(){
        return size;
    }
    public String getColour(){
        return colour;
    }

    public int getStoc() {
        return stoc;
    }
}
