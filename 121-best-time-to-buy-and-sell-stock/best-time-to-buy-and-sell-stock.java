class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i!=prices.length; i++) {
            int curr = prices[i];
            minSoFar = Math.min(minSoFar, curr);
            maxProfit = Math.max(maxProfit, curr - minSoFar);
        }
        return maxProfit;
    }
}