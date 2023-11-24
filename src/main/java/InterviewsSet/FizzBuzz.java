package InterviewsSet;

public class FizzBuzz {

    public static void main(String[] args) {
        int rep = 0;

        for (int i = 1; i <= 100; i++) {
            boolean div3 = false;
            boolean div5 = false;
            System.out.print(i + " - ");
            if (i % 3 == 0) {
                System.out.print("Fizz");
                div3 = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                div5 = true;
            }
            System.out.println();

            if (div3 && div5) {
                rep = rep + 1;
            }
            if (rep >= 3) {
                break;
            }
        }
    }
    //for (int i = 1; i <= 16; i++) {
    //            System.out.print(i + " - ");
    //            if (i % 3 == 0) {
    //                System.out.print("Fizz");
    //            }
    //            if (i % 5 == 0) {
    //                System.out.print("Buzz");
    //            }
    //            System.out.println();
    //        }
    //if (i % 3 == 0 && i % 5 == 0) {
    //                rep = rep + 1;
    //            }
    //            if (rep >= 3) {
    //                break;
    //            }
}
