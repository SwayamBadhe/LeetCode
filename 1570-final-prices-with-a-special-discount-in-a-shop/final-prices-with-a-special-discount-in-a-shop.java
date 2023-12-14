class Solution {
    public int[] finalPrices(int[] prices) {
       int[] answers = new int[prices.length];
       for (int i=0; i!=prices.length; i++) {
           boolean set = true;
           for (int j=i+1; j!=prices.length; j++) {
               if (prices[j] <= prices[i]) {
                   answers[i] = prices[i] - prices[j];
                   set = false;
                   break;
               }
           }
           if (set) {
               answers[i] = prices[i];
           }
       } 
       return answers;
    }
}