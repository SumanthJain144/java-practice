package com.sumanth.interview;

import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringSortInStreams {
    public static void main(String[] args) {
        String name = "sumanth";

        //Sort the characters of name
        String sortedName = name.chars()
                .mapToObj(i -> (char) i)
                .sorted()
                .map(c -> c.toString())
                .collect(Collectors.joining());
        System.out.println("sorted in asc -> " + sortedName);

        //Sort the characters of name in reverse order
        String sortedNameReverse = name.chars()
                .mapToObj(i -> (char) i)
                .peek(System.out::println)
                .sorted(Comparator.reverseOrder())
                .map(c -> c.toString())
                .collect(Collectors.joining());
        System.out.println("sorted in dec -> " + sortedNameReverse);

        System.out.println(m1());
    }

    private static int m1() {
        try {
            int a = 5/0;
            return 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 2;
        } finally {
            return 3;
        }
    }
}
