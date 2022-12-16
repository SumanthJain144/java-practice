package com.sumanth.stepup;

/**
 * Day 10 - Best Time to Buy and Sell Stocks
 * <p>
 * Say you have an array, A, for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Return the maximum possible profit.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * A = [1, 2]
 * <p>
 * <p>
 * Output 1:
 * <p>
 * 1
 * <p>
 * Explanation 1:
 * <p>
 * Buy the stock on day 0, and sell it on day 1.
 * Input 2:
 * A = [1, 4, 5, 2, 4]
 * Output 2: 4
 * Explanation 2:
 * Buy the stock on day 0, and sell it on day 2.
 */
public class StockMaxProfit {
    public static void main(String[] args) {
        int[] input = {1, 4, 5, 2, 4};
        System.out.println("Max profit - " + findMaxProfitOfStockPrices(input));
    }

    private static int findMaxProfitOfStockPrices(int[] input) {
        int maxProfit = 0;
        int buyDay = 0;
        int highestPrice = input[input.length - 1];
        int sellDay = input.length - 1;
        for (int i = input.length - 2; i >= 0; i--) {
            if (highestPrice < input[i]) {
                highestPrice = input[i];
                sellDay = i;
            }
            if (maxProfit < highestPrice - input[i]) {
                maxProfit = highestPrice - input[i];
                buyDay = i;
            }
        }
        System.out.println("Buy the stock on day " + buyDay + ", and sell it on day " + sellDay);
        return maxProfit;
    }
}
