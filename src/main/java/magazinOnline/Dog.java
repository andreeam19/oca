package magazinOnline;

public class Dog {
    public String nume;
    public String talie;
    public int varsta;
    public String tipBlana;

    Dog(String nume, String talie, int varsta, String tipBlana){
        this.nume=nume;
        this.talie=talie;
        this.varsta=varsta;
        this.tipBlana=tipBlana;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }
    public void setTalie(String talie){
        this.talie=talie;
    }
    public void setTipBlana(String tipBlana){
        this.tipBlana=tipBlana;
    }
    public String getNume(){
        return nume;
    }
    public String getTalie(){
        return talie;
    }
    public int getVarsta(){
        return  varsta;
    }
    public String getTipBlana(){
        return tipBlana;
    }
}
