class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest_wealth = 0;
        for (int i=0; i<accounts.length; i++) {
            int wealth = 0;
            for (int amount: accounts[i]) {
                wealth += amount;
            }
            richest_wealth = Math.max(richest_wealth, wealth);
        }
        return richest_wealth;
    }
}