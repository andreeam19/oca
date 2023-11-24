package InterviewsSet;

////Count vowels: Write a function that takes a string as input and returns
//    //  the number of vowels in the string.
public class Repeta {
    public static void main(String[] args) {
        String str = " abc ba ";

        System.out.println("Original:" + str);

        System.out.println(str.replaceAll("", ""));
        str = str.toLowerCase();

        String rev = reverse(str);

         if(str.equals(rev)) {
             System.out.println("true");
             System.out.println(rev);
         }else{
             System.out.println("false");
         }
    }



    public static String reverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }


}
