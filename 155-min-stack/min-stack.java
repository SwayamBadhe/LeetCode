class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;
    int min = Integer.MIN_VALUE;

    public MinStack() {
        stack = new ArrayDeque<>();    
        minStack = new ArrayDeque<>();    
    }
    
    public void push(int val) {
        stack.push(val);    
        minStack.push(minStack.isEmpty() ? val : Math.min(val, minStack.peek()));   
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */