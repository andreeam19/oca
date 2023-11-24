package ArraysEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAndHashSet {
    public static void main(String[] args) {
      List<Integer> names=new ArrayList<>();
    names.add(1);
    names.add(2);
    names.add(3);
    names.add(2);
    names.add(1);

        System.out.println(names);
        Set<Integer>namesList=new HashSet<>(names);

        System.out.println(namesList);
    }
}
