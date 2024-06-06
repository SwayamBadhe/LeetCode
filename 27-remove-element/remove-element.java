class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt = 0;
        int i = 0;
        while (i<nums.length-cnt) {
            if (nums[i] == val) {
                cnt++;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
            }
            i++;
        }
        return nums.length - cnt;
    }
}

   