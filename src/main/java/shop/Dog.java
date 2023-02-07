package shop;

// adauga campul: id
public class Dog {

    private int id;
    private String nume;
    private int varsta;
    private String talie;
    private String tipBlana;


    public Dog() {

    }

    public Dog( int id, String nume, String talie, int varsta, String tipBlana) {
        this.id=id;
        this.nume = nume;
        this.talie = talie;
        this.varsta = varsta;
        this.tipBlana = tipBlana;
    }

    public void printDogDetails() {
        System.out.println(id+ "-"+nume + " - " + varsta + " " + talie + " " + tipBlana);
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setTalie(String talie) {
        this.talie = talie;
    }

    public void setTipBlana(String tipBlana) {
        this.tipBlana = tipBlana;
    }

    public String getNume() {
        return nume;
    }

    public String getTalie() {
        return talie;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getTipBlana() {
        return tipBlana;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}
