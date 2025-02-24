class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for (int i=0; i!=res.length; i++) {
            res[i] = 1; 
        }

        for (int i=1; i!=nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1]; 
        }

        int rp = nums[nums.length - 1];
        for (int i=nums.length-2; i>=0; i--) {
            res[i] = rp * res[i]; 
            rp *= nums[i];
        }
        return res;
    }
}