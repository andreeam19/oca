package magazinOnline;

public class Dresses {
    public  String color;
    public  String model;
    public  char size;



    Dresses( String color, String model, char size){
        color=color;
        size=size;
        model=model;

    }
    public void setColor(String color){
        this.color=color;
    }
    public void setSize(char size){
        this.size=size;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getColor(){
        return color;
    }
    public  String getModel(){
        return  model;
    }

    public char getSize(){
        return  size;
    }
}
