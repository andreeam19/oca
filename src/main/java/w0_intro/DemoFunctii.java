package w0_intro;

public class DemoFunctii {
    static int calculeazaCub(int n){

    int nLAPutearea3=n*n*n;
    return nLAPutearea3;
    }

    public static void main(String[] args) {
        int x=7;
        System.out.println(x*x*x);

        int y=3;
        System.out.println(calculeazaCub(y));
        System.out.println(calculeazaCub(10));

        int cubullui7=calculeazaCub(7);
        System.out.println(cubullui7);
        System.out.println("exemplu");
    }
}
