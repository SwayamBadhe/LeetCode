class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] stringArr = new int[128];
        int minSoFar = 0;
        int maxLength = 0;

        for (int i=0; i!=s.length(); i++) {
            char curr = s.charAt(i);
            minSoFar = Math.max(minSoFar, stringArr[curr]);
            maxLength = Math.max(maxLength, i - minSoFar + 1);
            stringArr[curr] = i + 1;
        }
        return maxLength;
    }
}