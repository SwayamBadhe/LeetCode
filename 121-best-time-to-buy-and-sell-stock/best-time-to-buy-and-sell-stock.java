class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int minSoFar = Integer.MAX_VALUE;
        for (int i=0; i!=prices.length; i++) {
            int curr = prices[i];
            ans = Math.max(ans, curr - minSoFar);
            minSoFar = Math.min(minSoFar, curr);
        }
        return ans;
    }
}