class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        if (nums.length <= 1) return nums.length;
        
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != nums[l]) {
                nums[++l] = nums[r];
            }
        }
        return l + 1;
    }
}