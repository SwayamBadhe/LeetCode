class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        int result[] = new int[nums.length];

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else {
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;        
        }
        return result;
    }


    //     for (int i = 0; i < nums.length; i++) {
    //         nums[i] = nums[i] * nums[i];
    //     }
    //     int n = nums.length;
    //     for (int i = 0; i < n-1; i++)
    //     {
    //         int min_idx = i;
    //         for (int j = i+1; j < n; j++)
    //             if (nums[j] < nums[min_idx])
    //                 min_idx = j;

    //         int temp = nums[min_idx];
    //         nums[min_idx] = nums[i];
    //         nums[i] = temp;
    //     }
    // return nums;
    // }
}