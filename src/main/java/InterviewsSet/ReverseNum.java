package InterviewsSet;

public class ReverseNum {
    public static void main(String[] args) {

       int i= 12345;

        int rev=0;

        while(i>0){
             int lastNum=i%10;
             rev=rev*10+lastNum;
             i=i/10;
        }
        System.out.println(rev);

    }
}
