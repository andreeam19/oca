package com.test.w3.exercises;

public class RefacereStringExercices {
    public static void main(String[] args) {
        ex24();

    }

    //1. Write a Java program to get the character at the given index within the String.
    public static void ex1() {

        String str = "Java Exercices";
        System.out.println("Original string is: " + str);

        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("The character at the position 0 is " + (char) index1);
        System.out.println("The character at the position 10 is " + (char) index2);
    }

    //7.Write a Java program to concatenate a given string to the end of another string.
    //Sample Output:
    //
    //String 1: PHP Exercises and
    //String 2: Python Exercises
    //The concatenated string: PHP Exercises and Python Exercises

    public static void ex7() {
        String str1 = " PHP Exercises and";
        String str2 = " Python Exercises";

        String new_str = str1.concat(str2);

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("The concatenated string :" + new_str);

    }

    //8. Write a Java program to test if a given string contains the specified sequence
    // of char values
    //Sample Output:
    //
    //Original String: PHP Exercises and Python Exercises
    //Specified sequence of char values: and
    //true

    public static void ex8() {
        String str1 = " PHP Exercises and Python Exercises";
        String str2 = "and";

        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));


    }

    //9. Write a Java program to compare a given string to the specified character sequence.
    //
    //Sample Output:
    //
    //Comparing example.com and example.com: trueRomânia (RO)
    //Comparing Example.com and example.com: false

    public static void ex9() {
        String str1 = "example.com";
        String str2 = "Example.com";

        CharSequence cs = "example.com";

        System.out.println("Comparing " + str1 + "and " + cs + ": " + str1.contentEquals(cs));
        System.out.println("Comparing " + str2 + "and " + cs + ": " + str2.contentEquals(cs));
    }

    //10. Write a Java program to compare a given string to the specified string buffer.
    //
    //Sample Output:
    //
    //Comparing example.com and example.com: true
    //Comparing Example.com and example.com: false

    public static void ex10() {
        String str1 = "example.com";
        String str2 = "Example.com";
        StringBuffer strbuf = new StringBuffer(str1);

        System.out.println("Comparing " + str1 + " and " + strbuf + " : " + str1.contentEquals(strbuf));
        System.out.println("Comparing " + str2 + " and " + strbuf + " : " + str1.contentEquals(strbuf));


    }

    //12. Write a Java program to check whether a given string ends with the contents of
    // another string.
    //
    //Sample Output:
    //
    //"Python Exercises" ends with "se"? false
    //"Python Exercise" ends with "se"? true
    //Hint:"\""

    public static void ex12() {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        String end_str = "se";

        boolean end1 = str1.endsWith(end_str);
        boolean end2 = str2.endsWith(end_str);

        System.out.println("\"" + str1 + "\" ends with " + "\"" + end_str + "\" ? " + end1);
        System.out.println();


    }

    //13. Write a Java program to check whether two String objects contain the same data. Go to the editor
    //
    //Sample Output:
    //
    //"Stephen Edwin King" equals "Walter Winchell"? false
    //"Stephen Edwin King" equals "Mike Royko"? false

    public static void ex13() {
        String str1 = "Stephen Edwin King ";
        String str2 = "Walter Winchell ";
        String str3 = "Mike Royko ";

        boolean equals1 = str1.equals(str2);
        boolean equals2 = str1.equals(str3);

        System.out.println("\"" + str1 + "\"" + "equals" + "\"" + str2 + "\" ?" + equals1);
        System.out.println("\"" + str1 + "\"" + "equals" + "\"" + str3 + "\" ?" + equals2);
    }

    //14. Write a Java program to compare a given string to another string, ignoring case
    // considerations. Go to the editor
    //
    //Sample Output:
    //
    //"Stephen Edwin King" equals "Walter Winchell"? false
    //"Stephen Edwin King" equals "stephen edwin king"? true

    public static void ex14() {
        String str1 = "Stephen Edwin King ";
        String str2 = "Walter Winchell ";
        String str3 = "stephen edwin king ";

        boolean equals1 = str1.equalsIgnoreCase(str2);
        boolean equals2 = str1.equalsIgnoreCase(str3);

        System.out.println("\"" + str1 + "\"" + "equals" + "\"" + str2 + "\" ?" + equals1);
        System.out.println("\"" + str1 + "\"" + "equals" + "\"" + str3 + "\" ?" + equals2);
    }

    //18. Write a Java program to create a unique identifier of a given string.
    //
    //Sample Output:
    //
    //The hash for Python Exercises. is 863132599

    public static void ex18() {

        String str = "Python Exercises.";

        int hash_code = str.hashCode();

        System.out.println("The hash for " + str + " is " + hash_code);
    }


    //20. Write a Java program to get the canonical representation of the string object.
    //
    //Sample Output:
    //
    //str1 == str2? false
    //str1 == str3? true

    //22. Write a Java program to get the length of a given string. Go to the editor
    //
    //Sample Output:
    //
    //The string length of 'example.com' is: 11
    public static void ex22() {
        String str = "example.com";

        int length = str.length();

        System.out.println("The string lenth of \'" + str + "\' is:" + length);
    }


    //23. Write a Java program to find whether a region in the current
    // string matches a region in another string.
    //
    //Sample Output:
    //
    //str1[0 - 7] == str2[28 - 35]? true
    //str1[9 - 15] == str2[9 - 15]? false
    //boolean+regionMatches

    //24. Write a Java program to replace a specified character with another character. Go to the editor
    //
    //Sample Output:
    //
    //Original string: The quick brown fox jumps over the lazy dog.
    //New String: The quick brown fox jumps over the lazy fog.

    public static void ex24() {
        String str = "The quick brown fox jumps over the lazy dog.";

        String new_str = str.replace('d', 'f');

        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }

    //25. Write a Java program to replace each substring of a given string that
    // matches the given regular expression with the given replacement.
    //
    //Sample string : "The quick brown fox jumps over the lazy dog."
    //
    //In the above string replace all the fox with cat.
    //
    //Sample Output:
    //
    //Original string: The quick brown fox jumps over the lazy dog.
    //New String: The quick brown cat jumps over the lazy dog.
    public static void ex25() {
        String str = "The quick brown fox jumps over the lazy dog.";

        String new_str = str.replaceAll("fox", "cat");
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
    //26. Write a Java program to check whether a given string starts with the contents of another string. Go to the editor
    //
    //Sample Output:
    //
    //Red is favorite color. starts with Red? true
    //Orange is also my favorite color. starts with Red? false

    public static void ex26() {

        String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";

        String start_str = "Red";
        boolean starts1 = str1.startsWith(start_str);
        boolean starts2 = str2.startsWith(start_str);

        System.out.println(str1 + "starts with " + start_str + "?" + starts1);
        System.out.println(str2 + "starsts with" + start_str + "?" + starts2);

    }


    //27. Write a Java program to get a substring of a given string between two specified
    // positions.
    //
    //Sample Output:
    //
    //old = The quick brown fox jumps over the lazy dog.
    //new = brown fox jumps

    public static void ex27() {
        String str = "The quick brown fox jumps over the lazy dog.";

        String new_str = str.substring(10, 26);

        System.out.println("old = " + str);
        System.out.println("new = " + new_str);
    }

    //29. Write a Java program to convert all the characters in a string to lowercase. Go to the editor
    //
    //Sample Output:
    //
    //Original String: The Quick BroWn FoX!
    //String in lowercase: the quick brown fox!

    public static void ex29() {
        String str = "Quick BroWn FoX!";

        String new_str = str.toLowerCase();

        System.out.println("Original Strig: " + str);
        System.out.println("String in lowercase: " + new_str);
    }

    //30. Write a Java program to convert all the characters in a string to uppercase. Go to the editor
    //
    //Sample Output:
    //
    //Original String: The Quick BroWn FoX!
    //String in uppercase: THE QUICK BROWN FOX!
    public static void ex30() {

        String str = "The Quick BroWn FoX!";

        String new_str = str.toUpperCase();

        System.out.println("Original String: "+ str);
        System.out.println("String in uppercase: "+new_str);


    }

}
