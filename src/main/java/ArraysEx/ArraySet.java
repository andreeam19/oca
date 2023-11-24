package ArraysEx;

import java.util.*;

public class ArraySet {
    public static void main(String[] args) {

        Set<String> names=new LinkedHashSet<>();
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        System.out.println(names);

        List<Integer> numberLIst=new ArrayList<>();
        numberLIst.add(1);
        numberLIst.add(2);
        numberLIst.add(3);
        numberLIst.add(2);
        numberLIst.add(1);

        System.out.println(numberLIst);

        Set<Integer> numberSet=new TreeSet<>(numberLIst);
        System.out.println(numberSet);
    }
}
