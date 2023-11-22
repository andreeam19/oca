package Interview;

public class intervies_set {
    public static void main(String[] args) {
        // ex1();
        // System.out.println(fibonacci_rec(6));
        // System.out.println(factorial(5));
        // max_val();
        //findIndex(5);
        //countVowels("abcdef");
        //reverseNumber(12345);
        System.out.println(palindrom("capac"));
    }

    //INTERVIEWS SET
    //1.FizzBuzz: Write a program that prints the numbers from 1 to 100. But for multiples of three, print "Fizz" instead
    // of the number, and for the multiples of five, print "Buzz". For numbers which are multiples of both three and
    // five, print "FizzBuzz".
    public static void ex1() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "- ");
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.println();
        }

    }

    //2.Palindrome check: Write a function that takes a string as input and returns true if the string is a palindrome
    // (i.e., reads the same forwards and backwards).
    public static boolean palindrom(String str) {
        for (int i = 0; i <= (str.length() - 1)/2; i++) {
            int first = i;
            int last = str.length() - 1-i;
            if (str.charAt(first) != str.charAt(last)) {
                return false;
            }


        }
        return true;

    }

    //3.Fibonacci sequence: Write a function that takes an integer n as input and returns the nth number in the Fibonacci
    // sequence (i.e., the sum of the two preceding numbers, starting from 0 and 1) - RECURSIVITY

    public static int fibonacci_rec(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci_rec(n - 1) + fibonacci_rec(n - 2);
        }
    }

    //4.Factorial: Write a function that takes an integer n as input and returns the factorial of n (i.e., the product of
    // all positive integers less than or equal to n).
    public static int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }


    //5.Maximum value: Write a function that takes an array of integers as input and returns the maximum value in the
    // array.
    public static void max_val() {
        int max = 0;
        int[] array = {56, 24, 63, 24, 26, 95};
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max is: " + max);
    }

    //6.Linear search: Write a function that takes an array of integers and a target value, and returns the index of the
    // target value in the array (or -1 if the target is not found).
    public static void findIndex(int n) {
        boolean found = false;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == n) {
                found = true;
                System.out.println("Index of " + n + " is " + i);

            }

        }
        if (!found) {
            System.out.println("-1");
        }

    }

    //7.Count vowels: Write a function that takes a string as input and returns the number of vowels in the string.
    public static void countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("number of vowels:" + count);

    }

    //8.Reverse a number: Write a function that takes an integer as input and returns the same integer with its digits reversed.
    public static void reverseNumber(int num) {
        int reverseNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num = num / 10;

        }
        System.out.println("Reverse num is: " + reverseNum);
    }
}
