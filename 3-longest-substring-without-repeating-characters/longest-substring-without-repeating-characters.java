class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxLen = 0;
       int minSoFar = 0;
       int[] stringMap = new int[128];

      for (int i=0; i!=s.length(); i++) {
        int curr = s.charAt(i);
        minSoFar = Math.max(minSoFar, stringMap[curr]);
        maxLen = Math.max(maxLen, i - minSoFar + 1);
        stringMap[curr] = i + 1;
      }
       return maxLen;
    }
}