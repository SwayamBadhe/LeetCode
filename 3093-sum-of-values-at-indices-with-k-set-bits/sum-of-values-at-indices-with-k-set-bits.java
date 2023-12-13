class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i=0; i!=nums.size(); i++) {
            // int setBits = 0;
            // int num = i;
            // while (num > 0) {
            //     setBits += (num % 2);
            //     num /= 2; 
            //     if (setBits > k) break;
            // }

            // if (setBits == k) {
            //     sum += nums.get(i); 
            // }
            if (Integer.bitCount(i)==k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}