package ArraysEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPro {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("asd@gmail.com");
        emails.add("asd@gmailcom");
        emails.add("asd@gmail.c.om");
        emails.add("asd@gmail.c.om");
        emails.add("asd@gmail.c.om");
        emails.add("asdgmail.com");
        emails.add("asdgmail@com.");

        for (int i = 0; i <= 50; i++) {
            emails.add("asd@gmail.com");
        }
        for (String email : emails) {
            try {
                if (!isValidEmail(email)) {
                    System.out.println("Email " + email + " not valid");
                }
            } catch (TooMannyAroudOrDotException | FirstCharacterIsDotOrAround | DotIsBeforeAround | DotIsNotLastCharacter e) {
                System.out.println(e);
                if(e instanceof DotIsBeforeAround){
                    System.out.println("asd");
                }
            }
        }
    }

    private static boolean isValidEmail(String email) throws TooMannyAroudOrDotException, FirstCharacterIsDotOrAround, DotIsBeforeAround, DotIsNotLastCharacter {
        boolean isValid = true;

        int countArond = 0;
        int countDot = 0;

        // check if @ or . appear more than once
        for (char c : email.toCharArray()) {
            if (c == '@') {
                countArond++;

            }
            if (c == '.') {
                countDot++;
            }
        }
        if (countArond > 1 || countDot > 1) {
            isValid = false;
            throw new TooMannyAroudOrDotException("-->Too manny arounds or dots.Check again this email: " + email);
        }

        // check if first char is . or @
        if (email.charAt(0) == '.' || email.charAt(0) == '@') {
            isValid = false;
            throw new FirstCharacterIsDotOrAround("-->First Character is dot or around in this email: " + email);
        }

        // check if @ is in front of . and there is space between them
        if (email.indexOf('.') - email.indexOf('@') <= 1) {
            isValid = false;
            throw new DotIsBeforeAround("-->Dot is before around in this email" + email);
        }

        // check if . is last char
        if (email.lastIndexOf('.') == email.length() - 1) {
            isValid = false;
            throw new DotIsNotLastCharacter("-->Dot is not last character in this email " + email);
        }

        return isValid;
    }


    public static void help() {
        String[] fruits = new String[3];
        fruits[0] = "MAngo";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";

        System.out.println(fruits);

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");

        //fruitList.remove("Apple");
        fruitList.clear();
        System.out.println(fruitList);
    }
}
