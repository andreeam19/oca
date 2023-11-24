package ArraysEx;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ExceptionHandling {
//o exceptie este un eveniment nedorit care intrerupe flow-ul normal al programului
    public static void main(String[] args) {
        System.out.println(printANumber());
    }

    private static int printANumber(){
        try{
            return 3;
        }
        catch (Exception e){
            return 4;
        }
        finally {
            return 5;
        }
    }
    public static void getInt(){
        try{
            int myInt=Integer.parseInt("1");
            System.out.println("After parsing pants");
        }
        catch (NumberFormatException | NullPointerException   e){
            System.out.println("Hey dude, you can't make an int from that");
        }
        finally {
            System.out.println("in the finally block");
        }
        System.out.println("End here");
    }
}
