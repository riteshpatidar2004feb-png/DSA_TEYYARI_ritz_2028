class StockSpanner {
    Stack <Integer> st = new Stack<>();
    ArrayList <Integer> list = new ArrayList<>();
    int i;
    public StockSpanner() {
       i = 0;
    }
    
    public int next(int price) {
        int ret = 0;
        list.add(price);
        if(i == 0) {
            st.push(i);
            i++;
            ret = 1;
        }

        else if(st.size() > 0 && list.get(st.peek()) > price){
            st.push(i);
            i++;
            ret = 1;
        } 
        else{
            while(st.size() > 0 && list.get(st.peek()) <= price) st.pop();
            if(st.size() > 0) ret = i - st.peek();
            else ret = i+1;
            st.push(i);
            i++;
        }
        return ret;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */