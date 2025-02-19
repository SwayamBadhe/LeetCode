class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int n1 = nums[l], n2 = nums[r];
            int s = n1 + n2;
            if (s < target) { l++; }
            else if (s > target) { r--; }
            else { return new int[] {l + 1, r + 1}; }
        }

        return new int[] {};
    }
}