package com.sumanth.stepup;

import java.util.Arrays;
import java.util.HashMap;

/**
 * [9:10 AM] Gokul Manoharan (DevOn)Day 24 - Distinct Numbers in Window
 * <p>
 * You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.
 * <p>
 * Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
 * <p>
 * NOTE: if B > N, return an empty array.
 * <p>
 * Example inputs
 * <p>
 * Input 1:
 * <p>
 * A = [1, 2, 1, 3, 4, 3]
 * B = 3
 * <p>
 * Input 2:
 * <p>
 * A = [1, 1, 2, 2]
 * B = 1
 * <p>
 * Example outputs
 * <p>
 * Output 1:
 * <p>
 * [2, 3, 3, 2]
 * <p>
 * Output 2:
 * <p>
 * [1, 1, 1, 1]
 * <p>
 * Explanations
 * <p>
 * Explanation 1:
 * <p>
 * A=[1, 2, 1, 3, 4, 3] and B = 3
 * All windows of size B are
 * [1, 2, 1]
 * [2, 1, 3]
 * [1, 3, 4]
 * [3, 4, 3]
 * So, we return an array [2, 3, 3, 2].
 * <p>
 * Explanation 2:
 * <p>
 * Window size is 1, so the output array is [1, 1, 1, 1].
 */
public class DistinctNumbersInWindow {

    public static void main(String[] args) {
        int[] inputArr = {1, 1, 1, 1};
        int windowSize = 2;
        int[] output = findDistinctCountsInWindow(inputArr, windowSize);
        System.out.println(Arrays.toString(output));

        //using window sliding algorithm
        int[] output1 = distinctNumbersWindowSlidingAlgo(inputArr, windowSize);
        System.out.println(Arrays.toString(output1));
    }

    private static int[] findDistinctCountsInWindow(int[] inputArr, int windowSize) {
        int totalArrWindows = (inputArr.length - windowSize) + 1;
        if (totalArrWindows <= 0) {
            return new int[]{};
        }
        int[] output = new int[totalArrWindows];
        for (int i = 0; i < totalArrWindows; i++) {
            output[i] = (int) Arrays.stream(inputArr, i, i + windowSize).distinct().count();
        }
        return output;
    }

    public static int[] distinctNumbersWindowSlidingAlgo(int[] A, int B) {
        // If B is larger than the length of the array, return an empty array.
        if (B > A.length) {
            return new int[0];
        }

        // Create an array to store the result.
        int[] result = new int[A.length - B + 1];

        // Create a map to store the frequencies of the elements in the first window.
        HashMap<Integer, Integer> elementCounts = new HashMap<>();
        for (int i = 0; i < B; i++) {
            int count = elementCounts.getOrDefault(A[i], 0);
            elementCounts.put(A[i], count + 1);
        }

        // Store the number of distinct elements in the first window.
        result[0] = elementCounts.size();

        // Iterate over the rest of the array, sliding the window and updating the count of distinct elements.
        for (int i = 1; i <= A.length - B; i++) {
            // Decrement the frequency of the element at the left boundary of the current window.
            // If the frequency becomes 0, remove the element from the map.
            int count = elementCounts.get(A[i - 1]);
            if (count == 1) {
                elementCounts.remove(A[i - 1]);
            } else {
                elementCounts.put(A[i - 1], count - 1);
            }

            // Increment the frequency of the element at the right boundary of the current window.
            count = elementCounts.getOrDefault(A[i + B - 1], 0);
            elementCounts.put(A[i + B - 1], count + 1);

            // Store the number of distinct elements in the current window.
            result[i] = elementCounts.size();
        }
        return result;
    }
}
