//06:45:00
// optimal 07:05:00
class MinStack {
    Stack <Integer> st =new Stack<>();
    Stack <Integer> mn =new Stack<>();
    public MinStack() {
        st = new Stack<>();
        mn = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(mn.size() == 0 || val < mn.peek()) mn.push(val);
        else mn.push(mn.peek());
    }
    
    public void pop() {
        st.pop();
        mn.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mn.peek();
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