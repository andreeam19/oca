package ArraysEx;

public class Array {
    public static void main(String[] args) {
        String [] cars={"Bmw","Audi","Volvo","Camaro"};

        cars[1]="VW";

       // System.out.println(cars[3]);

        String[] makeup=new String[3];

        makeup[0]="fundation";
        makeup[1]="mascara";
        makeup[2]="pencil";

        for(int i=0;i< makeup.length;i++){
            System.out.println(makeup[i]);
        }
    }
}
