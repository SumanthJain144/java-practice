package com.sumanth.stepup;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Day 4 - You're given an array of unsorted integers, At a given time, you can increment the elements by 1. What is the minimum number of increments you can do overall to make all the elements of array equal?
 * <p>
 * <p>
 * Difficulty level - Medium
 * <p>
 * Output - Number of minimum increments
 * <p>
 * Constraints- 1 <= Arrray.length <= 10^6, Elements can be repeated
 * <p>
 * <p>
 * <p>
 * Example input: [2, 4, 1, 4, 2]
 * <p>
 * Output: 7
 * <p>
 * Explanation: 4 is the max element here and we have to increment the other values 7 times altogether to make all of them 4 and so the array becomes [4, 4, 4, 4, 4].
 */
public class FIndIncrementsToEqualTheArray {
    public static void main(String[] args) {
        System.out.println(countIncrementsToMakeArrayElementsEqual(new int[]{2, 4, 1, 4, 2})); //7
        System.out.println(countIncrementsToMakeArrayElementsEqual(new int[]{1, 1, 1, 1, 1, 1})); //0
        System.out.println(countIncrementsToMakeArrayElementsEqual(new int[]{10, 10, 10, 9})); //1
        System.out.println(countIncrementsToMakeArrayElementsEqual(new int[]{67, 100, 1, 4})); //228
        System.out.println(countIncrementsToMakeArrayElementsEqual(new int[]{-1, 2})); //3
    }

    private static int countIncrementsToMakeArrayElementsEqual(int[] input) {
        int maxElement = Arrays.stream(input).max().getAsInt();
        int countOfIncrements = Arrays.stream(input).map(element -> maxElement - element).sum();
        return countOfIncrements;
    }
}
