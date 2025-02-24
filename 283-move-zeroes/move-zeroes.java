class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int k = 0;
        for (int r=0; r!=nums.length; r++) {
            if (nums[r] != 0) {
                nums[l++] = nums[r];
            } else {
                k++;
            }
        }
        for (int i=nums.length - k; i!=nums.length; i++) {
            nums[i] = 0;
        }
    }
}