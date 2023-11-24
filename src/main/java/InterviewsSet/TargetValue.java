package InterviewsSet;

public class TargetValue {
    //Linear search: Write a function that takes an array of integers and a
    // target value, and returns the index of the target value in the array
    // (or -1 if the target is not found).
    public static void main(String[] args) {
        targetValue(6);

    }
    public static void targetValue(int num){

        int result=-1;
        int []array={1,2,3,4,6,7,8,9};
        int length= array.length;
        for(int i=0;i<=length-1;i++){
            if(array[i]==num){
                result=i;
            }
        }
        System.out.println(result);
    }
}
