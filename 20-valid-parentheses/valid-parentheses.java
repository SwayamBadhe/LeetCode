class Solution {
    public boolean isValid(String s) {
        int l = s.length();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c); 
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')') && (top != '(')) return false;
                if ((c == '}') && (top != '{')) return false;
                if ((c == ']') && (top != '[')) return false;
            }
        }
        return stack.isEmpty();
    }
}