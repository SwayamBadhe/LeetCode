class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0; i!=nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) { 
                continue;
            }
            int l = i + 1, r = nums.length - 1;

            while (l < r) {
                int n1 = nums[i], n2 = nums[l], n3 = nums[r];
                int s = n1 + n2 + n3;
                if (s < 0) { l++; }
                else if (s > 0) { r--; }
                else {
                    res.add(Arrays.asList(n1, n2, n3));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }                
            }
        }
        return res;
    }
}