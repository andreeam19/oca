package com.test.w3.exercises;

import java.sql.SQLOutput;

public class StringExercices {
    //1. Write a Java program to get the character at the given index within the String.
    public static void main(String[] args) {
        ex31();
    }

    public static void ex1() {
        String str = "Java Exercices!";
        System.out.println("Original String = " + str);
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("the character at position 0 is " + (char) index1);
        System.out.println("The character at position 10 is " + (char) index2);
    }

    //7.Write a Java program to concatenate a given string to the end of another string.
    //Sample Output:
    //
    //String 1: PHP Exercises and
    //String 2: Python Exercises
    //The concatenated string: PHP Exercises and Python Exercises
    public static void ex7() {
        String str1 = "PHP Exercices and ";
        String str2 = "Python Exercises";

        String str3 = str1.concat(str2);
        System.out.println("The concatenated string: " + str3);

    }

    //8. Write a Java program to test if a given string contains the specified sequence
    // of char values
    //Sample Output:
    //
    //Original String: PHP Exercises and Python Exercises
    //Specified sequence of char values: and
    //true
    public static void ex8() {
        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";

        System.out.println("Original string " + str1);
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
        System.out.println("Comparing " + str1 + "and " + cs + " : " + str1.contains(cs));
        System.out.println("Comparing " + str2 + "and" + cs + " :" + str2.contains(cs));
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

        System.out.println("Comparing " + str1 + " and" + strbuf + ": " + str1.contentEquals(strbuf));
        System.out.println("Comparing " + str2 + " and" + strbuf + " :" + str2.contentEquals(strbuf));
    }
    //12. Write a Java program to check whether a given string ends with the contents of
    // another string.
    //
    //Sample Output:
    //
    //"Python Exercises" ends with "se"? false
    //"Python Exercise" ends with "se"? true

    public static void ex12() {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        String end_str = "se";

        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);

        System.out.println("\"" + str1 + "\"" + " ends with " + "\" ?" + ends1);
        System.out.println("\"" + str2 + "\"" + " ends with " + "\"?" + ends2);
    }

    //13. Write a Java program to check whether two String objects contain the same data. Go to the editor
    //
    //Sample Output:
    //
    //"Stephen Edwin King" equals "Walter Winchell"? false
    //"Stephen Edwin King" equals "Mike Royko"? false

    public static void ex13() {
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";

        boolean equals1 = columnist1.equals(columnist2);
        boolean equals2 = columnist1.equals(columnist3);

        System.out.println("\"" + columnist1 + "\" equals" + "\" " + columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals" + "\" " + columnist3 + "\"? " + equals2);
    }


    //14. Write a Java program to compare a given string to another string, ignoring case
    // considerations. Go to the editor
    //
    //Sample Output:
    //
    //"Stephen Edwin King" equals "Walter Winchell"? false
    //"Stephen Edwin King" equals "stephen edwin king"? true
    public static void ex14() {

        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "stephen edwin king";

        boolean equals1 = columnist1.equalsIgnoreCase(columnist2);
        boolean equals2 = columnist1.equalsIgnoreCase(columnist3);

        System.out.println("\"" + columnist1 + "\" equals" + "\" " + columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals" + "\" " + columnist3 + "\"? " + equals2);
    }


    //18. Write a Java program to create a unique identifier of a given string.
    //
    //Sample Output:
    //
    //The hash for Python Exercises. is 863132599
    public static void ex18() {
        String str = "Python Exercises.";

        int hash_code = str.hashCode();

        System.out.println("The hash for " + str + "is " + hash_code);
    }


    //20. Write a Java program to get the canonical representation of the string object.
    //
    //Sample Output:
    //
    //str1 == str2? false
    //str1 == str3? true
    public static void ex20() {
        String str1 = "Java Exercises";
        String str2 = new StringBuffer("Java").append(" Exercises").toString();
        String str3 = str2.intern();

        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
    }


    //22. Write a Java program to get the length of a given string. Go to the editor
    //
    //Sample Output:
    //
    //The string length of 'example.com' is: 11
    public static void ex22() {
        String str = "example.com";

        int len = str.length();
        System.out.println("The string lenth of '" + str + " is: " + len);
    }

    //23. Write a Java program to find whether a region in the current
    // string matches a region in another string.
    //
    //Sample Output:
    //
    //str1[0 - 7] == str2[28 - 35]? true
    //str1[9 - 15] == str2[9 - 15]? false

    public static void ex23() {
        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";

        boolean match1 = str1.regionMatches(0, str2, 28, 8);

        boolean match2 = str1.regionMatches(9, str2, 9, 8);

        System.out.println("str1[0 -7]==str2[28 - 35]? " + match1);
        System.out.println("str1[9 - 15] ==str2[9 - 15]? " + match2);

    }

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
        System.out.println("New string : " + new_str);
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
        String str = "The quick brown fox jumps over the lazy dog";

        String new_str = str.replaceAll("fox", "cat");

        System.out.println("Original string : " + str);
        System.out.println("New string : " + new_str);
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

        String startStr = "Red";

        boolean starts1 = str1.startsWith("Red");
        boolean starts2 = str2.startsWith(startStr);

        System.out.println(str1 + " starts with Red? " + starts1);
        System.out.println(str2 + " starts with Red? " + starts2);

    }

    //27. Write a Java program to get a substring of a given string between two specified
    // positions.
    //
    //Sample Output:
    //
    //old = The quick brown fox jumps over the lazy dog.
    //new = brown fox jumps

    public static void ex27() {
        String str = "The quick brown fox jumps over the lazy dog";

        String new_str = str.substring(10, 26);

        System.out.println("old= " + str);
        System.out.println("new= " + new_str);
    }


    //29. Write a Java program to convert all the characters in a string to lowercase. Go to the editor
    //
    //Sample Output:
    //
    //Original String: The Quick BroWn FoX!
    //String in lowercase: the quick brown fox!

    public static void ex29() {
        String str = " The Quick BroWn FoX!";

        String new_str = str.toLowerCase();
        System.out.println("Original String: " + str);
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

        System.out.println("Original string: " + str);
        System.out.println("String in uppercase: " + new_str);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //31. Write a Java program to trim any leading or trailing whitespace from a given string. Go to the editor
    //
    //Sample Output:
    //
    //Original String:  Java Exercises
    //New String: Java Exercises
    public static void ex31() {

        String str = " Java Exercises ";
        String new_str = str.trim();

        System.out.println("Original String: " + str);
        System.out.println("New String: " + new_str);
    }
    //40. Write a Java program to divide a string in n equal parts. Go to the editor
    //
    //Sample Output:
    //
    //The given string is: abcdefghijklmnopqrstuvwxy
    //The string divided into 5 parts and they are:
    //
    //abcde
    //fghij
    //klmno
    //pqrst
    //uvwxy

    // public static void ex40(){
    //    int count=0;
    //  for()
}


//44. Write a Java program to reverse a string using recursion. Go to the editor
//
//Sample Output:
//
//The given string is: The quick brown fox jumps
//The string in reverse order is:
//spmuj xof nworb kciuq ehT

//46. Write a Java program to reverse every word in a string using methods. Go to the editor
//
//Sample Output:
//
//The given string is: This is a test string
//The string reversed word by word is:
//sihT si a tset gnirts

//48. Write a Java program to remove "b" and "ac" from a given string. Go to the editor
//
//Sample Output:
//
//The given string is: abrambabasc
//After removing the new string is: aramaasc

//59. Write a Java program to read a string,if the string begins with "red" or "black" return that color string, otherwise return the empty string. Go to the editor
//
//Sample Output:
//
//The given strings is: blacksea
//The string begins with the color: black

//63. Write a Java program to check whether the first two characters present at the end of a given string. Go to the editor
//
//Sample Output:
//
//The given strings is: educated
//The first two characters appear in the last is: true

//66. Write a Java program to read a string and return the string without the first two characters. Keep the first character if it is 'g' and keep the second character if it is 'h'. Go to the editor
//
//Sample Output:
//
//The given strings is: goat
//The new string is: gat
//
//he given strings is: photo
//The new string is: hoto
//
//The given strings is: ghost
//The new string is: ghost
//Click me to see the solution

//67. Write a Java program to read a string and if one or both of the first two characters is equal to specified character return without those characters otherwise return the string unchanged. Go to the editor
//
//Sample Output:
//
//The given strings is: oocyte
//The new string is: cyte
//
//The given strings is: boat
//The new string is: bat
//
//The given strings is: own
//The new string is: wn

//81. Write a Java program to check whether two strings of length 3 and 4 appear in same number of times in a given string. Go to the editor
//
//Sample Output:
//
//The given string is: redcapmanwithbluecar
//The appearance of red and blue are same: true

//82. Write a Java program to create a new string repeating every character twice of a given string. Go to the editor
//
//Sample Output:
//
//The given string is: welcome
//The new string is: wweellccoommee



