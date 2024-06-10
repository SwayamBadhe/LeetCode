class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int p, int q) {
        while (p < q) {
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
            p++;
            q--;
        }
    }
}
