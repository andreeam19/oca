package InterviewsSet;

public class MaxValue {
    //Maximum value: Write a function that takes an array of integers as
    // input and returns the maximum value in the array.
    public static void main(String[] args) {
        int []array={53,545,84,257,5654,54656,12};
        int max=0;
        int length=array.length;
        for(int i=0;i<=length-1;i++){
            if (array[i]>max) {
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
