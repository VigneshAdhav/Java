package com.java;

public class StringRotationChecker {
    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "cdefab";

        if (areRotations(s1, s2)) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Strings are not rotations of each other.");
        }
    }
}
