package shop;

public class Cat {
    private String nume;
    private int varsta;
    private String rasa;

    public void printCatDetails(){
        System.out.println(nume+" "+varsta+" "+rasa+" ");
    }

    public Cat(String nume, int varsta, String rasa) {
        this.nume = nume;
        this.varsta = varsta;
        this.rasa = rasa;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getNume() {
        return nume;
    }

    public String getRasa() {
        return rasa;
    }

    public int getVarsta() {
        return varsta;
    }
}
