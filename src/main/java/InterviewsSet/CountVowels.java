package InterviewsSet;

public class CountVowels {
    //Count vowels: Write a function that takes a string as input and returns
    //  the number of vowels in the string.

    public static void main(String[] args) {
        int vCount = 0;

        String str = "This is a really simple sentence";

        str = str.toLowerCase();

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            }

        }
        System.out.println("Number of vowels: " + vCount);

    }
}