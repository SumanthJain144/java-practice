package com.sumanth.interview;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {


    public static void main(String[] args) {

        List<String> list = List.of("vikas", "sharana", "sam", "varun");
        List<String> filtered = list.stream()
                .map(str -> str.toUpperCase())
                .filter(str -> str.startsWith("V"))
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
