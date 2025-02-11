class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        for (int i=0; i!=nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (sumMap.containsKey(diff)) {
                return new int[] {i, sumMap.get(diff)};
            }
            sumMap.put(num, i);
        }
        return new int[] {};
    }
}