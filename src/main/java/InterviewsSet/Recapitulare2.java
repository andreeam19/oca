package InterviewsSet;

public class Recapitulare2 {
    //1.FizzBuzz: Write a program that prints the numbers from 1 to 100. But for multiples of three,
    // print "Fizz" instead of the number, and for the multiples of five, print "Buzz". For numbers
    // which are multiples of both three and five, print "FizzBuzz".
    public static void fizzBuzz(){
        int count=0;
        for(int i=1;i<=100;i++){

            boolean div3=false;
            boolean div5=false;

            System.out.print(i+" - ");
            if(i%3==0){
                div3=true;
                System.out.print("Fizz");
            }
            if(i%5==0){
                div5=true;
                System.out.print("Buzz");
            }
            if(div3&div5){
                count++;
            }
            if(count>=3){
                break;
            }
            System.out.println();
        }
    }

    //2.Palindrome check: Write a function that takes a string as input and returns true if the string
    // is a palindrome (i.e., reads the same forwards and backwards).
    public static String reverse(){
        String str="abcdef";
        char[] arr=str.toCharArray();

        char[] rev=new char[arr.length];

        int len=str.length();
        for(int i=0;i<=len-1;i++){
            rev[(len-1)-i]=arr[i];
        }
        return String.copyValueOf(rev);
    }
    public static String reverse2(){
        String str="abcdef";
        char[] arr=str.toCharArray();

        for(int i=0;i<str.length()-1-i;i++){
            char temp=arr[i];
            arr[i]=arr[(str.length()-1)-i];
            arr[(str.length()-1)-i]=temp;
        }
        return String.copyValueOf(arr);
    }

    //3.Fibonacci sequence: Write a function that takes an integer n as input and returns the nth number
    // in the Fibonacci sequence (i.e., the sum of the two preceding numbers, starting from 0 and 1) -
    // RECURSIVITY
    public static int fibonacciRec(int n){
        if(n<=0){
            return n;
        }else{
            return fibonacciRec(n-1)+fibonacciRec(n-2);
        }
    }

    //4.Factorial: Write a function that takes an integer n as input and returns the factorial of n (i.e.,
    // the product of all positive integers less than or equal to n).


    //5.Maximum value: Write a function that takes an array of integers as input and returns the maximum
    // value in the array.


    //6.Linear search: Write a function that takes an array of integers and a target value, and returns
    // the index of the target value in the array (or -1 if the target is not found).


    //7.Count vowels: Write a function that takes a string as input and returns the number of vowels in
    // the string.


    //8.Reverse a number: Write a function that takes an integer as input and returns the same integer
    // with its digits reversed.

    public static void main(String[] args) {
        //fizzBuzz();
        System.out.println(reverse2());

    }

}
