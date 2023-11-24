package InterviewsSet;

public class Fibo {

    //- may also have problems with big n values - runs out of stack memory.
    static int fibonacci_rec(int n) {
        return n <= 1 ?
                n :
                fibonacci_rec(n - 1) + fibonacci_rec(n - 2);
    }

    public static void main(String[] args) {
        System.out.println( fibonacci_rec(5));
    }

}
