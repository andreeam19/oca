package in_clasa.w01_intro;

/*
Ex.1 Hello, User

Scrieti un program numit HelloUser care defineste 2 variabile: una care va retine
un nume (al utilizatorului), si una care va retine anul nasterii.

- Indiciu: definiti o clasa noua numita HelloUser, in care definiti o metoda main
  (cu semnatura ceruta de compilator), in care scrieti restul codului.

- Intrebari:
    - ce tip si ce nume ati alege pentru fiecare?
    - am putea folosi tipul 'byte' pentru anul nasterii? de ce da/nu?
    - ce alte tipuri am folosi pentru anul nasterii, care il preferati si de ce?

a) Afisati un mesaj care de salut care include acel nume.
b) Calculati varsta utlizatorului (in ani), salvat-o intr-o noua variabila
(ce nume ati alege pentru ea?), si apoi afisati-o intr-un nou mesaj, pe o
linie separata fata de primul.
c) Afisati un nou mesaj de ramas bun, care include si el numele.
*/

public class ExClasa1_HelloUser {
public static void main(String[] args) {

        //declarare si initializare 2 variabile
        String name = "Cosmin";
        int birthYear = 1989;

        //a) afisam mesaj, compus din parti fixe de test si prima variabila
        System.out.println("Salut, " + name + "!");

        //b) calculam varsta, o salvam in alta variabila, si o folosim la afisat mesaj
        int age = 2020 - birthYear;
        System.out.println("Varsta ta este de " + age + " ani!");

        //c) afisam mesaj de final, folosind iar variabila name
        System.out.println("Ramas bun, " + name + "!");
    }
}
//package in_clasa.w01_intro;
//
//public class CheckTriangle {
//    public static void main(int angle 1, int angle 2, int angle 3) {
//
//
//        int angle1;
//        int angle2;
//        int angle3;
//
//        if( angle1 + angle2 + angle3 == 180)
//            System.out.println( 'angles ('+angle1+ ' ; ' +angle2+ ';' +angle3+'' ) );
//    }
//}
//
//    private static void testIt(int angle1, int angle2, int angle3) {
//        System.out.println("\nAngles (" + angle1 + "," + angle2 + "," + angle3 + ") -> " +
//                "valid triangle? : " + canFormValidTriangle(angle1, angle2, angle3));
//        System.out.println("Angles (" + angle1 + "," + angle2 + "," + angle3 + ") -> " +
//                "right-angle triangle? : " + canFormValidRightAngledTriangle(angle1, angle2, angle3));
//    }
//}

package in_clasa.w01_intro;

public class DemoFunctii {

    //definitie functie - nume, parametrii, tip rezultat returnat
    static int calculeazaCub(int n) {
        //codul functie
        int nLaPuterea3 = n * n * n;
        return nLaPuterea3;
    }

    //programul principal (functia 'speciala' numita main, pe care o putem rula direct)
    public static void main(String[] args) {
        //fara functie
        int x = 7;
        System.out.println(x * x * x);

        //putem folosi functia custom 'cub', de cate ori vrem (daca am definit-o in aceeasi clasa undeva, ca mai sus aici)
        int y = 3;
        System.out.println(calculeazaCub(y));

        System.out.println(calculeazaCub(10));

        int cubululLui7 = calculeazaCub(7);
        System.out.println(cubululLui7);
        System.out.println("exemplu");
    }
}

package in_clasa.w01_intro;

public class DemoPrimitiveTypesMaxRange {
public static void main(String[] args) {

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue); // ok, prints out max_value: 2147483647

        // trying to add 1 to int max value -> it overflows, starts
        // from "beginning": -2147483648
        maxIntValue = maxIntValue + 1;
        System.out.println(maxIntValue);
    }
}

package in_clasa.w01_intro;

class Ex0_WarmupIntro {

    static int computeSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static double squareValue(double x) {
        double patrat = x * x;
        return patrat;
        //sau:
        //return (x * x);
    }

    static String joinStrings(String s1, String s2) {
        //String alipite = s1 + s2;
        //return alipite;

        //sau:
        return s1 + s2;
    }

    static int lengthOf(String s) {
        //int lungime = s.length();
        //return lungime;

        //sau:
        return s.length();
    }

    static int truncate(double x) {
//        int xTrunchiat = (int) x;
//        return xTrunchiat;

        //sau:
        return (int) x;
    }

    static boolean isInInterval(int x, int min, int max) {
//        boolean xPesteMin = x >= min;
//        boolean xSubMax = x <= max;
//        return xPesteMin && xSubMax;

        //sau:
        return x >= min && x <= max; //nu e nevoie de paranteze, ordinea default a operatiilor e ok: intai comparatii (<=,>=), dupa &&, si dupa return
    }

    static boolean sameLength(String s1, String s2) {
        return s1.length() == s2.length();
    }

    static boolean atLeastOneTrue(boolean a, boolean b, boolean c) {
        //varianta mai lunga:
        //return (a == true) || (b == true) || (c == true);

        //varianta echivalenta mai scurta:
        return a || b || c;
    }

    static boolean allTrue(boolean a, boolean b, boolean c) {
        return a && b && c;
    }

    static boolean noneTrue(boolean a, boolean b, boolean c) {
        //varianta mai lunga:
        //return (a == false) && (b == false) && (c == false);

        //varianta echivalenta mai scurta:
        return !a && !b && !c; //nu e nevoie de paranteze (! e mai prioritar decat &&, ||)
    }

    static boolean exactlyTwoTrue(boolean a, boolean b, boolean c) {
        //varianta incorecta - true pentru macar 2 (oricare), dar si pentru toate 3 (caz incorect)
        //return (a && b) || (a && c) || (b && c);

        //varianta corecta
        return (a && b && !c) ||
                (a && !b && c) ||
                (!a && b && c);
    }

    /**
     * Main method, we use here just for easy manual testing of our methods above.
     * NOTE: after manual test run ok, don't forget to also run the automatic tests, see Ex0_Tests class!
     */
    public static void main(String[] args) {

        System.out.println("sum(2,3) = " + computeSum(2, 3));
        System.out.println("square(3) = " + squareValue(3));
        System.out.println("square(5.5) = " + squareValue(5.5));

        System.out.println();
        System.out.println("joinStrings('ab', 'cd') = '" + joinStrings("ab", "cd") + "'");
        System.out.println("lengthOf('abc') = " + lengthOf("abc"));
        System.out.println("lengthOf('Cristi') = " + lengthOf("Cristi"));
        System.out.println("truncate(3.21) = " + truncate(3.21));

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


package in_clasa.w01_intro;

/*
Ex.1 Hello, User

Scrieti un program numit HelloUser care defineste 2 variabile: una care va retine
un nume (al utilizatorului), si una care va retine anul nasterii.

- Indiciu: definiti o clasa noua numita HelloUser, in care definiti o metoda main
  (cu semnatura ceruta de compilator), in care scrieti restul codului.

- Intrebari:
  - ce tip si ce nume ati alege pentru fiecare?
  - am putea folosi tipul 'byte' pentru anul nasterii? de ce da/nu?
  - ce alte tipuri am folosi pentru anul nasterii, care il preferati si de ce?

a) Afisati un mesaj care de salut care include acel nume.
b) Calculati varsta utlizatorului (in ani), salvat-o intr-o noua variabila
(ce nume ati alege pentru ea?), si apoi afisati-o intr-un nou mesaj, pe o
linie separata fata de primul.
c) Afisati un nou mesaj de ramas bun, care include si el numele.
*/

public class ExClasa1_HelloUser {
public static void main(String[] args) {

        //declarare si initializare 2 variabile
        String name = "Cosmin";
        int birthYear = 1989;

        //a) afisam mesaj, compus din parti fixe de test si prima variabila
        System.out.println("Salut, " + name + "!");

        //b) calculam varsta, o salvam in alta variabila, si o folosim la afisat mesaj
        int age = 2020 - birthYear;
        System.out.println("Varsta ta este de " + age + " ani!");

        //c) afisam mesaj de final, folosind iar variabila name
        System.out.println("Ramas bun, " + name + "!");
    }
}


package in_clasa.w01_intro;

public class FirstProgram {

    // variables placed outside methods, directly in class => class fields, to be discussed later;
    // advice: avoid using them for now!!
    int a;

    public static void main(String[] args) {

        // variable naming:
        String String; //allowed, but please don't...

        String name = "Lucian"; //declare and initialize variable
        System.out.println("Hello " + name); //using its value

        // constant variable x - may assign a value to it only once (cannot change it later)
        final int X; //constants should be named with uppercase letters
        X = 1;

        // first block of code
        {
            int y = X + 2; // variable y, exists only in this block of code
        }

        //System.out.println(y); //compile error, var y no longer exists here!

        // second block of code - can redeclare y with different type/value
        {
            String y = "aa";
        }
    }
}


//package in_clasa.w01_intro;
//
//public class HomeExercises {
//
//}
///*
//Ex.1 Hello, User
//
//        Scrieti un program numit HelloUser care defineste 2 variabile: una care va retine
//        un nume (al utilizatorului), si una care va retine anul nasterii.
//
//        - Indiciu: definiti o clasa noua numita HelloUser, in care definiti o metoda main
//        (cu semnatura ceruta de compilator), in care scrieti restul codului.
//
//        - Intrebari:
//        - ce tip si ce nume ati alege pentru fiecare?
//        - am putea folosi tipul 'byte' pentru anul nasterii? de ce da/nu?
//        - ce alte tipuri am folosi pentru anul nasterii, care il preferati si de ce?
//
//        a) Afisati un mesaj care de salut care include acel nume.
//        b) Calculati varsta utlizatorului (in ani), salvat-o intr-o noua variabila
//        (ce nume ati alege pentru ea?), si apoi afisati-o intr-un nou mesaj, pe o
//        linie separata fata de primul.
//        c) Afisati un nou mesaj de ramas bun, care include si el numele.
//*/
//
//public class ExClasa1_HelloUser {
//    public static void main(String[] args) {
//
//        //declarare si initializare 2 variabile
//        String name = "Cosmin";
//        int birthYear = 1989;

        //a) afisam mesaj, compus din parti fixe de test si prima variabila
        System.out.println("Salut, " + name + "!");

        //b) calculam varsta, o salvam in alta variabila, si o folosim la afisat mesaj
        int age = 2020 - birthYear;
        System.out.println("Varsta ta este de " + age + " ani!");

       //c) afisam mesaj de final, folosind iar variabila name
        System.out.println("Ramas bun, " + name + "!");
   }
}
