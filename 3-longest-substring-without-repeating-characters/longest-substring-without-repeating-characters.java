class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxLen = 0;
       int minSoFar = 0;
       HashMap<Character, Integer> stringMap = new HashMap<>();

       for (int i=0; i!=s.length(); i++) {
            if (stringMap.containsKey(s.charAt(i))) {
                minSoFar = Math.max(minSoFar, stringMap.get(s.charAt(i)) + 1);
            } 
            stringMap.put(s.charAt(i), i);
            maxLen = Math.max(maxLen, i - minSoFar + 1);            
       } 
       return maxLen;
    }
}