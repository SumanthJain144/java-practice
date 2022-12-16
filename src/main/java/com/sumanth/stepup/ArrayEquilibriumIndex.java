package com.sumanth.stepup;

/**
 * Day 5 - Given an array of size N, Write a function that returns an equilibrium index
 * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 * Difficulty level- Medium
 * Output: Return the equilibrium index of the given array. If no such index is found then return -1.
 * Constraints - 1 <= N <= 10^5
 *
 *
 * Input 1 - [-7, 1, 5, 2, -4, 3, 0]
 * Output 1 - 3
 * Explanation - 3 is an equilibrium index, because A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 *
 *
 *
 * Input 2 - [7, -2, 0, 0, 1, 1, 3]
 *
 * Output 1 - 2
 *
 * Explanation - 2 is an equilibrium index because A[0] + A[1] = A[3] + A[4] + A[5] + A[6]
 */
public class ArrayEquilibriumIndex {

    public static void main(String[] args) {
        System.out.println(getArrayEquilibriumIndex(new int[]{-7, 1, 5, 2, -4, 3, 0})); //3
        System.out.println(getArrayEquilibriumIndex(new int[]{7, -2, 0, 0, 1, 1, 3})); //2
    }

    private static int getArrayEquilibriumIndex(int[] input) {



        return 0;
    }
}
