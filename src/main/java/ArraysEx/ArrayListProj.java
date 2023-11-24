package ArraysEx;

import java.util.ArrayList;

public class ArrayListProj {
    public static void main(String[] args) {
        String[] fruits=new String[3];
        fruits[0]="MAngo";
        fruits[1]="Apple";
        fruits[2]="Strawberry";
        System.out.println(fruits[1]);

        ArrayList fruitList=new ArrayList();
        fruitList.add("mango");
        fruitList.add("apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");
        fruitList.remove("mango");
        System.out.println(fruitList.contains("Strawberry"));
        System.out.println(fruitList.isEmpty());

        fruitList.clear();
        System.out.println(fruitList.isEmpty());
        System.out.println(fruitList);
    }

}
