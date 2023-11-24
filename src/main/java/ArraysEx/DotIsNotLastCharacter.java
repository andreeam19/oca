package ArraysEx;

public class DotIsNotLastCharacter extends Exception {
    public DotIsNotLastCharacter(String message) {
        super(message);
    }
    public DotIsNotLastCharacter(String message,String email) {
        super(message+email);
    }
}
