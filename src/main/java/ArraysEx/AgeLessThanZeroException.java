package ArraysEx;

public class AgeLessThanZeroException  extends IllegalArgumentException {
   public AgeLessThanZeroException(){}
//basic,no args constructor

    public AgeLessThanZeroException(String message){
        super(message);
    }

    public AgeLessThanZeroException(Throwable cause){
       super(cause);
    }
    public AgeLessThanZeroException(String mesaage, Throwable cause){
       super(mesaage,cause);
    }
}
