package ArraysEx;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person(1,"Ionel",33);
        Person p2=new Person(2,"Mirel",29);
        Person p3=new Person(3,"Gigel",21);
        Person p4=new Person(4,"Marcel",35);
        Person p5=new Person(5,"Dumitrel",38);

        HashMap<Integer,Object> hashMap=new HashMap<>();
        hashMap.put(p1.getId(),p1);
        hashMap.put(p2.getId(),p2);
        hashMap.put(p3.getId(),p3);
        hashMap.put(p4.getId(),p4);
        hashMap.put(p5.getId(),p5);


        System.out.println(hashMap.get(3));


       // boolean result=hashMap.isEmpty();
        //System.out.println("IT is empty: "+result);
    }
}
