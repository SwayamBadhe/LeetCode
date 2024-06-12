class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyStock = prices[0];

        for (int i=1; i!=prices.length; i++) {
            if (buyStock > prices[i]) {
                buyStock = prices[i];                
            }
            
            profit = profit > prices[i] - buyStock ? profit : prices[i] - buyStock;
        }

        return profit;
    }
}