// LeetCode 121 - Best Time to Buy and Sell Stock
// Approach: Track Minimum Price
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            minValue = Math.min(minValue, prices[i]);
            int profit = prices[i] - minValue;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
