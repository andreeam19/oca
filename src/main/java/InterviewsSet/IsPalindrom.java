package InterviewsSet;

public class IsPalindrom {
    //Palindrome check: Write a function that takes a string as input and returns
    // true if the string is a palindrome (i.e., reads the same forwards and backwards).
    public static void main(String[] args) {
        String str="abcba";
        String rev=reverse(str);

        if (str.equals(rev)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static String reverse(String str) {
        String rev = "";
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
//String str, rev = "";
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a string:");
//        str = sc.nextLine();
//
//        int length = str.length();
//
//        for (int i = length - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//
//            if (str.equals(rev)) {
//                System.out.println("true");
//            } else {
//                System.out.println("false");
//            }
//        }

//    public static void StringIsPAlindromOrNot() {
//        String s = "radar";
//        String rev = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            rev = rev + s.charAt(i);
//        }
//        if (s.equals(rev)) {
//            System.out.println("String is palindrom");
//        } else {
//            System.out.println("String is not palindrom");
//        }
//    }
//String str, rev = "";
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a string:");
//        str = sc.nextLine();
//
//        int length = str.length();
//
//        for (int i = length - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        if (str.equals(rev)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }



