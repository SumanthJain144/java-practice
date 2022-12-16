package com.sumanth.stepup;

import java.util.stream.IntStream;

/**
 * Day-1
 * a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
 */
public class PrimeNumberCheck {

    public static void main(String[] args) {
        System.out.println(isPrimeOldSchool(12));
        System.out.println(isPrimeUsingStreams(12));
    }

    public static boolean isPrimeOldSchool(int n) {
        int factor = (int) Math.sqrt(n);
        if (n <= 1) {
            return false;
        }
        while (factor > 1) {
            if (n % factor == 0) return false;
            factor--;
        }
        return true;
    }

    public static boolean isPrimeUsingStreams(int n) {
        return n > 1 && IntStream.range(2, (int) Math.sqrt(n) + 1).noneMatch(i -> n % i == 0);
    }
}
