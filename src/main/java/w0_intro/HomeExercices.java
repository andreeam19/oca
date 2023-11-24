package w0_intro;

public class HomeExercices {
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
//
//        //a) afisam mesaj, compus din parti fixe de test si prima variabila
//        System.out.println("Salut, " + name + "!");
//
//        //b) calculam varsta, o salvam in alta variabila, si o folosim la afisat mesaj
//        int age = 2020 - birthYear;
//        System.out.println("Varsta ta este de " + age + " ani!");
//
//        //c) afisam mesaj de final, folosind iar variabila name
//        System.out.println("Ramas bun, " + name + "!");
//    }
//}
    public static void main(String[] args) {

        String name="Andreea";
        int birthYear=1994;

        System.out.println("Salut "+ name+"!");

        int age=2023-birthYear;

        System.out.println("Varsta ta este de "+age+" ani!");

        System.out.println("Ramas bun, "+name+"!");
    }
}
