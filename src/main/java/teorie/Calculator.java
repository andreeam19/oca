package teorie;

public class Calculator {

    /*
     * metoda: bloc de cod care indeplineste o functie (in cazul nostru, cum spune si numele, ADUNA doua numere)
     * parametrii: reprezinta datele care sunt introduse in metoda (vin din exterior)
     */
    public static int aduna(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // pun final pentru ca vreau ca a sa aiba valoarea 1 pe toata existenta lui
        final int a = 1;
        int b = 2;


        System.out.println(aduna(a, b));
    }
}
