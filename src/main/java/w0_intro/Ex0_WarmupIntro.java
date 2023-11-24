package w0_intro;

public class Ex0_WarmupIntro {
    static int computeSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static double squareValue(double x) {
        double patrat = x * x;
        return patrat;
        //sau:
        //return x*x;
    }

    static String joinStrings(String s1, String s2) {
        //String alipire=s1+s2;
        //return alipire;

        //sau:
        return s1 + s2;
    }

    static int lengthOf(String s) {
        //int lungime=s.length();
        //return lungime;

        //sau:
        return s.length();
    }

    static boolean isInInterval(int x, int min, int max) {
        return x >= min && x <= max;
    }

    static boolean sameLength(String s1, String s2) {
        return s1.length() == s2.length();
    }

    static boolean atLeastOneTrue(boolean a, boolean b, boolean c) {
        //varianta mai lunga
        //return(a==true)||(b==true)||(c==true);

        //varianta mai scurta:
        return a || b || c;
    }

    static boolean allTrue(boolean a, boolean b, boolean c) {

        return a && b && c;
    }

    static boolean noneTrue(boolean a, boolean b, boolean c) {
        //varianta mai lunga:
        //return (a==false)&&(b==false)&&(c==false);
        //varianta mai scurta:
        return !a && !b && !c;
    }

    static boolean exactlyTwoTrue(boolean a, boolean b, boolean c) {
        return (a && b && !c) || (a && !b && c) || (!a && b && c);
    }

    public static void main(String[] args) {
        System.out.println("sum(2,3) = " + computeSum(2, 3));
        System.out.println("square(3) = " + squareValue(3));
        System.out.println("square(5.5) = " + squareValue(5.5));


        System.out.println();
        System.out.println("isInInterval(3, 0, 5) = " + isInInterval(3, 0, 5));
        System.out.println("isInInterval(3, 5, 10) = " + isInInterval(3, 5, 10));

        System.out.println();
        System.out.println("sameLength('abc', '123') = " + sameLength("abc", "123"));
        System.out.println("sameLength('ab', '1234') = " + sameLength("ab", "1234"));

        System.out.println();
        System.out.println("atLeastOneTrue(false, false, false) = " + atLeastOneTrue(false, false, false));
        System.out.println("atLeastOneTrue(true, false, false) = " + atLeastOneTrue(true, false, false));
        System.out.println("atLeastOneTrue(false, true, true) = " + atLeastOneTrue(false, true, true));

        System.out.println();
        System.out.println("allTrue(false, false, false) = " + allTrue(false, false, false));
        System.out.println("allTrue(false, true, true) = " + allTrue(false, true, true));
        System.out.println("allTrue(true, true, true) = " + allTrue(true, true, true));

        System.out.println();
        System.out.println("noneTrue(true, true, false) = " + noneTrue(true, true, false));
        System.out.println("noneTrue(false, false, true) = " + noneTrue(false, false, true));
        System.out.println("noneTrue(false, false, false) = " + noneTrue(false, false, false));

        System.out.println();
        System.out.println("exactlyTwoTrue(false, true, false) = " + exactlyTwoTrue(false, true, false));
        System.out.println("exactlyTwoTrue(true, true, true) = " + exactlyTwoTrue(true, true, true));
        System.out.println("exactlyTwoTrue(true, false, true) = " + exactlyTwoTrue(true, false, true));
    }
}

