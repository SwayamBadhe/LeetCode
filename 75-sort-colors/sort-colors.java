class Solution {
    public void sortColors(int[] nums) {
        int left = 0, curr = 0, right = nums.length - 1;
        
        while (curr <= right) {
            if (nums[curr] == 2) {
                swap(nums, curr, right); 
                right--;
            } else if (nums[curr] == 0) {
                swap(nums, curr, left);
                left++;
                curr++;
            } else curr++;
        }
    }

    public void swap(int[] nums, int curr, int pointer) {
        int temp = nums[curr];
        nums[curr] = nums[pointer];
        nums[pointer] = temp;
    }
}