class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int maxSum = 0;
        int currSum = 0;
        int minSoFar = 0;
        HashMap<Integer, Integer> numsMap = new HashMap<>();         

        for (int i=0; i!=nums.length; i++) {
            int num = nums[i];
            if (numsMap.containsKey(num) && numsMap.get(num) >= minSoFar) {
                int prev = numsMap.get(num);
                for (int j=minSoFar; j<=prev; j++) {
                    currSum -= nums[j];
                    minSoFar++;
                }           
            } 
            currSum += num;
            maxSum = Math.max(maxSum, currSum);
            numsMap.put(num, i); 
        }
        return maxSum;
    }
}