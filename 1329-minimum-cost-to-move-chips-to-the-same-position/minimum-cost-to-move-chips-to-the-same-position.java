class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for (int ele: position) {
            if (ele % 2 == 0) {
                odd++;
            } else {
                even ++;
            }
        }
        return Math.min(odd, even);
    }
}