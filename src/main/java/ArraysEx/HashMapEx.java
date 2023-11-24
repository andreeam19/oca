package ArraysEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    //Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void ex1(){
        HashMap<Integer,String> hash_map=new HashMap<>();
        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Black");
        hash_map.put(4,"White");
        hash_map.put(5,"Blue");

        for(Map.Entry x: hash_map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
    //2. Write a Java program to count the number of key-value (size) mappings in a map.
    public static void ex2(){
        HashMap<Integer,String>hash_map=new HashMap<Integer,String>();
    hash_map.put(1,"Red");
    hash_map.put(2,"Green");
    hash_map.put(3,"Black");
    hash_map.put(4,"White");
    hash_map.put(5,"Blue");
    //check if the map is empty
    boolean result= hash_map.isEmpty();
    //check the result
        System.out.println("Is the map empty: "+result);
        //removing all the elements from the linked map
        hash_map.clear();
        //check if map is empty
        result=hash_map.isEmpty();
        System.out.println("Is hash map empty: "+result);


        //System.out.println("Size of the hash map: "+hash_map.size());
        //hash_map.clear();
        //System.out.println("New map has the size:"+hash_map.size());

    }
    public static void ex3(){
        HashMap<Integer,String> hash_map1=new HashMap<Integer,String>();
        HashMap<Integer,String> hash_map2=new HashMap<Integer,String>();

        hash_map1.put(1,"Red");
        hash_map1.put(2,"Green");
        hash_map1.put(3,"Black");
        System.out.println("\nValues in first map: "+hash_map1);

        hash_map2.put(4,"White");
        hash_map2.put(5,"BLue");
        hash_map2.put(6,"Orange");

        System.out.println("\nValues in second map: "+hash_map2);

        //putt all values in second map

        hash_map2.putAll(hash_map1);

        System.out.println("\nNow ");

    }
    public static void ex6(){
        HashMap<Integer,String>hashMap=new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "White");
        hashMap.put(5, "Blue");

        //print the map
        System.out.println("The original map: "+hashMap);
        HashMap<Integer,String> newHashMap=new HashMap<>();
        newHashMap=(HashMap)hashMap.clone();
        System.out.println("Cloned map: "+newHashMap);
    }
    public static void ex7(){

    }
    public static void main(String[] args) {
        ex6();
    }


}
