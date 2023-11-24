package InterviewsSet;

import java.util.Scanner;

public class Factorial {
    //Factorial: Write a function that takes an integer n as input and returns the factorial of n (i.e., the product of all positive integers less than or equal to n).
    public static void main(String[] args) {
       // factorial(5);






    }
    public static void factorial(int num){
        int fact=1;

        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
    public static int factorial_rec3(int n){
        if(n==0)
            return 1;
        else
            return (n*factorial_rec3(n-1));
    }
    public static int factorial_rec(int n){
        return n==0 ?
               1:
                (n*factorial_rec(n-1));


    }

}
