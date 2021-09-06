package com.rahul.codingchallenges;

final class BestTimeToBuyAndSellStock {

    static int calculateBestTimeToBuyAndSellStock(int[] prices) {
        int result = 0;
        int minSoFar = Integer.MAX_VALUE;
        int currentDiff;

        for (int price : prices) {
            minSoFar = Math.min(minSoFar, price);
            currentDiff = price - minSoFar;
            if (currentDiff > result) {
                result = currentDiff;
            }
        }

        return result;
    }
}
