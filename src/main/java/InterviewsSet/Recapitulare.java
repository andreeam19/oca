package InterviewsSet;

public class Recapitulare {
    //1.FizzBuzz: Write a program that prints the numbers from 1 to 100. But for multiples of three,
    // print "Fizz" instead of the number, and for the multiples of five, print "Buzz". For numbers
    // which are multiples of both three and five, print "FizzBuzz".
    public static void fizzBuzz() {
        int counts = 0;

        for (int i = 1; i <= 100; i++) {
            boolean div3 = false;
            boolean div5 = false;
            System.out.print(i + " - ");
            if (i % 3 == 0) {
                div3 = true;
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                div5 = true;
                System.out.print("Buzz");
            }

            if (div3 & div5) {
                counts++;
            }
            if (counts >= 3) {
                break;
            }
            System.out.println();
        }
    }
    //2.Palindrome check: Write a function that takes a string as input and returns true if the string
    // is a palindrome (i.e., reads the same forwards and backwards).
    public static String reverse(String str){
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
    public static String reverse2(){
        String str="abcdef";

        char[] arr=str.toCharArray();

        for(int i=0;i<str.length()-1-i;i++){
            char temp=arr[i];
            arr[i]=arr[str.length()-1-i];
            arr[str.length()-1-i]=temp;
        }
        return String.copyValueOf(arr);
    }

    //3.Fibonacci sequence: Write a function that takes an integer n as input and returns the nth number
    // in the Fibonacci sequence (i.e., the sum of the two preceding numbers, starting from 0 and 1) -
    // RECURSIVITY
    public static int Fibonacci_rec(int n) {
        if (n <= 1)
            return n;
    else
        return Fibonacci_rec(n - 1) + Fibonacci_rec(n - 2);
}

    //4.Factorial: Write a function that takes an integer n as input and returns the factorial of n (i.e.,
    // the product of all positive integers less than or equal to n).
    public static int factorial_rec(int n){
        if(n==0){
            return 1;
        }else{
            return (n*factorial_rec(n-1));
        }
    }
    public static void factorial(int n){
        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorialul numarului "+n+" este "+ fact);
    }

    //5.Maximum value: Write a function that takes an array of integers as input and returns the maximum
    // value in the array.
    public static void max_value(){
        int []array={1, 67, 35,74,337,3656,23,466};
        int max=0;

        for(int i=0;i<= array.length-1;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Maximul este: "+max);
    }

    //6.Linear search: Write a function that takes an array of integers and a target value, and returns
    // the index of the target value in the array (or -1 if the target is not found).
    public static void target_Val(int num){
        int result=-1;
        int []array={1,2,3,4,5,7,8,9};

        for(int i=0;i<= array.length-1;i++){
            if(array[i]==num){
                result=i;
            }
        }
        System.out.println(result);
    }

    //7.Count vowels: Write a function that takes a string as input and returns the number of vowels in
    // the string.
    public static void countsVowels(){
        String str="This is a small sentence";
        int countV=0;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ){
                countV++;
            }
        }
        System.out.println("The sentence have "+countV+" vowels");

    }

    //8.Reverse a number: Write a function that takes an integer as input and returns the same integer
    // with its digits reversed.
    public static void reverseNum(){
        int num=12345;
        int rev=0;

        while(num>0){
            int lastDigit=num%10;
            rev=rev*10+lastDigit;
            num=num/10;
        }
        System.out.println("Reverse is:"+rev);

    }

    public static void main(String[] args) {
          //fizzBuzz();
      //  System.out.println(Fibonacci_rec(7));
      //  factorial(5);
       // max_value();
    //target_Val(6);
        //countsVowels();
       // reverseNum();
//        String str="abcba";
//        String rev=reverse(str);
//        if(str.equals(rev)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
        System.out.println(reverse2());
    }


}
