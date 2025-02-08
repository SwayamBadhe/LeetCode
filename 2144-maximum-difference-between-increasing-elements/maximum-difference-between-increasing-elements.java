class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int minSoFar = Integer.MAX_VALUE;
        for (int ele: nums) {
            if (ele - minSoFar != 0) {
                ans = Math.max(ans, ele - minSoFar);
            }
            minSoFar = Math.min(minSoFar, ele);
        }
        return ans;
    }
}