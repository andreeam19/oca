package ArraysEx;

public class FirstCharacterIsDotOrAround extends Exception{
    public FirstCharacterIsDotOrAround(String message){
        super(message);
    }
    public FirstCharacterIsDotOrAround(String message, String email){
        super(message+email);
    }
}
