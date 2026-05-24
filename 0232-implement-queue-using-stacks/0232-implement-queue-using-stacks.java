class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st1 = new Stack<>();
    public MyQueue() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>0){
            st1.push(st.pop());
        }
        int temp = st1.pop();
        while(st1.size()>0){
            st.push(st1.pop());
        }
        return temp;
    }
    
    public int peek() {
        while(st.size()>0){
            st1.push(st.pop());
        }
        int temp = st1.peek();
        while(st1.size()>0){
            st.push(st1.pop());
        }
        return temp;
    }
    
    public boolean empty() {
        if(st.size()>0) return false;
        else return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */