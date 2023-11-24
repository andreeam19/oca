package ArraysEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person1 {

    public static void main(String[] args) {
        Persons p1=new Persons(1920825);
        Persons p2=new Persons(2940219);

        Map<Persons,String> map=new HashMap<>();
        map.put(p1,"Andrei");
        map.put(p2,"Andreea");

        System.out.println(map.size());

        System.out.println("\nPrint map");
        for(Map.Entry<Persons,String>e:map.entrySet()){
            System.out.println(e.getKey().hashCode()+" "+e.getValue());
        }


    }

}
class Persons{
    int cnp;
    static int i=0;

    public Persons(int cnp){
        this.cnp=cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons persons = (Persons) o;
        return cnp == persons.cnp;
    }

    @Override
    public int hashCode() {
        return i++;
    }
}
