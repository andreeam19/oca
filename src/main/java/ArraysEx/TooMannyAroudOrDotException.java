package ArraysEx;

public class TooMannyAroudOrDotException extends Exception {
    public TooMannyAroudOrDotException(String message) {
        super(message);
    }

    public TooMannyAroudOrDotException(String message,String email) {
        super(message+email);
    }
}