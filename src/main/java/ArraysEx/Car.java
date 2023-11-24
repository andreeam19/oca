package ArraysEx;

public class Car {
    private String marca;
    private String model;
    private int caiPutere;

    Car(String marca, String model,int caiPutere){
        this.marca=marca;
        this.model=model;
        this.caiPutere=caiPutere;
    }

    public String toString(){
        return "Marca: "+marca+", model: "+model+", cai putere: "+caiPutere;
    }
    public String getMarca(){
        return marca;
    }
    public String getModel(){
        return model;
    }
    public int getCaiPutere(){
        return caiPutere;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setCaiPutere(int caiPutere){
        this.caiPutere=caiPutere;
    }

    public static void main(String[] args) {
        Car c1=new Car("Audi","A6",170);
        System.out.println(c1);
    }

}
