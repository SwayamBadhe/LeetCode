class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxLen = 0;
       int minSoFar = 0;
       HashMap<Character, Integer> stringMap = new HashMap<>();

       for (int i=0; i!=s.length(); i++) {
            char curr = s.charAt(i);
            if (stringMap.containsKey(curr)) {
                minSoFar = Math.max(minSoFar, stringMap.get(curr) + 1);
            } 
            stringMap.put(curr, i);
            maxLen = Math.max(maxLen, i - minSoFar + 1);            
       } 
       return maxLen;
    }
}