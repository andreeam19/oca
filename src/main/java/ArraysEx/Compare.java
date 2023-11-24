package ArraysEx;

import java.time.Instant;
import java.util.*;

public class Compare {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> number1 = new ArrayList<>();
        Set<Integer>  number2=new HashSet<>();
        for(int i=1;i<=1000000;i++){
            number1.add(i);
            number2.add(i);
        }

        Instant start=Instant.now();
        number1.contains(999999);
        Instant stop=Instant.now();

        long time1 = stop.toEpochMilli()-start.toEpochMilli();
        System.out.println(time1);

        Thread.sleep(1000);

        start=Instant.now();
        number1.contains(999998);
        stop=Instant.now();

        long time2 = stop.toEpochMilli()-start.toEpochMilli();
        System.out.println(time2);
    }

}

