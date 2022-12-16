package com.sumanth.stepup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Day 9: Find leaders in an array
 * Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
 * An element is a leader if it is strictly greater than all the elements to its right side.
 * NOTE: The rightmost element is always a leader because there are no elements on the right side of it to check.
 * Return an empty array if there are no leaders.
 * <p>
 * <p>
 * <p>
 * <p>
 * Input 1: A = [16, 17, 4, 3, 5, 2]
 * <p>
 * Output 1: [17, 5, 2]
 * <p>
 * <p>
 * <p>
 * Input 2: A = [1, 2]
 * <p>
 * Output 2: [2]
 */
public class LeaderInArray {
    public static void main(String[] args) {
        int[] input = new int[]{16, 17, 4, 3, 5, 2};
        System.out.println("------Naive method-------");
        int[] output = findLeadersInArray(input);
        Arrays.stream(output).forEach(System.out::println);

        System.out.println("------Carry forward method-------");
        int[] leaders = finLeaders(input);
        Arrays.stream(leaders).forEach(System.out::println);
    }

    private static int[] findLeadersInArray(int[] input) {
        int[] output = new int[input.length];
        int leadersCount = 0;
        if (input.length == 0) {
            return output;
        }
        first:
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    continue first;
                }
            }
            output[leadersCount] = input[i];
            leadersCount++;
        }
        output[leadersCount] = input[input.length - 1];
        return output;
    }

    /*Carry-forward method*/
    private static int[] finLeaders(int[] A) {
        int n = A.length;
        //Check for corner case
        if (n == 0) {
            return new int[0];
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(A[n - 1]);
        int leader = A[n - 1];
        for (int i = n - 2; i > 0; i--) {
            if (A[i] > leader) { // Element is greater than leader from its right means it is greater from all element right from itself.
                leader = A[i];
                ans.add(0, A[i]);
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }

}
