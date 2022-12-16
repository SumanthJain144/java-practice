package com.sumanth.stepup;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String s1, String s2) {
        // Remove all white space and convert strings to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Check if the two strings have the same length
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert the strings to character arrays
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        // Sort the arrays
        Arrays.sort(s1Array);

        Arrays.sort(s2Array);

        // Check if the sorted arrays are equal
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2)); // Output: true

        s1 = "Hello";
        s2 = "World";
        System.out.println(isAnagram(s1, s2)); // Output: false
    }
}
