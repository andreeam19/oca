package ArraysEx;

import java.util.HashMap;

public class Map_HashMap {
    public static void main(String[] args) {
       HashMap<String, Integer>empIds=new HashMap<>();
       empIds.put("John",12345);
       empIds.put("Paul",54321);
       empIds.put("Brian",5467384);

        System.out.println(empIds);

        System.out.println(empIds.containsKey("Paul"));
        System.out.println(empIds.containsKey("Tim"));

        System.out.println(empIds.containsValue(54321));

        System.out.println(empIds.get("John"));
        System.out.println(empIds.putIfAbsent("Mark",536748));

        System.out.println(empIds);

        empIds.remove("Mark");

        System.out.println(empIds);
    }
}
