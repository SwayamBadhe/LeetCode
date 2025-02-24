class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int res = 0;
        boolean sign = true;
        int start = 0;

        if (s.length() > 0 && s.charAt(0) == '-') {
            sign = false;
            start = 1;
        } else if (s.length() > 0 && s.charAt(0) == '+') start = 1;
        
        if (s.length() <= start) return 0;

        for (int i=start; i!=s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) break;
            int digit = c - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (c - '0');
        }

        return sign ? res : -res;
    }
}