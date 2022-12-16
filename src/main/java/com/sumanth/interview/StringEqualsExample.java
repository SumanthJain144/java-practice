package com.sumanth.interview;

public class StringEqualsExample {
    public static void main(String[] args) {
        String s1 = "sumanth";
        String s2 = new String("sumanth");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
