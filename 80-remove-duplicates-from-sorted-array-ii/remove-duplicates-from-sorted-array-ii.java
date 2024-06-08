class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;
        boolean seen = false;

        for (int i=1; i!=nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
                seen = false;
            } else {
                if (seen == false) {
                    nums[k] = nums[i];
                    k++;
                    seen = true;
                }
            }            
        }
        return k;
    }
}