package com.sumanth.stepup;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Day 2 -  Given an array A of N integers. Count the number of elements that have at least 1 element greater than itself.
 * Difficulty level - Easy
 * Constraints - 1 <= N <= 10^5
 * Output - Return the count of elements.
 * <p>
 * Example input | output - [3,1,4,2] | 3,[0,1,1,1,1] | 1, [7,7,7,5,5,5,5] | 4
 * Example output - 3
 */
public class CounterGreaterThanItSelf {
    public static void main(String[] args) {
        System.out.println(getCountGreaterThanItSelf(new int[]{3, 1, 4, 2})); //3
        System.out.println(getCountGreaterThanItSelf(new int[]{7, 7, 7, 5, 5, 5, 5})); //4
        System.out.println(getCountGreaterThanItSelf(new int[]{0, 1, 1, 1, 1})); //1
        System.out.println(getCountGreaterThanItSelf(new int[]{3, 3, 3, 2, 2, 4})); //5
    }

    private static int getCountGreaterThanItSelf(int[] input) {
        //Sort and Find out the number of occurrence of each element.
        Collection<Long> occurrenceCount = Arrays.stream(input)
                .sorted()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values();

        //Get the sum of element occurrences except the last one[It is the highest number]
        return occurrenceCount.stream().limit(occurrenceCount.size() - 1).mapToInt(Long::intValue).sum();
    }
}
