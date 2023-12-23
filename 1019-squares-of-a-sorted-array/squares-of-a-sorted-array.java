class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int n = nums.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (nums[j] < nums[min_idx])
                    min_idx = j;

            int temp = nums[min_idx];
            nums[min_idx] = nums[i];
            nums[i] = temp;
        }
    return nums;
    }
}