class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest_wealth = 0;
        for (int[] customer: accounts) {
            int wealth = 0;
            for (int amount: customer) {
                wealth += amount;
            }
            richest_wealth = Math.max(richest_wealth, wealth);
        }
        return richest_wealth;
    }
}