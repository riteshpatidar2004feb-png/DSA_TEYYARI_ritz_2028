class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = new int[n];
        Stack <Integer> st = new Stack<>();
        st.push(0);
        pse[0] = -1;
        for(int i = 1; i < n; i++){
            while(st.size() > 0 && heights[i] <= heights[st.peek()]) st.pop();
            if(st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        st.clear();
         n = heights.length;
        int[] nse = new int[n];
        
        st.push(n-1);
        nse[n-1] = n;
        for(int i = n-2; i >= 0; i--){
            while(st.size() > 0 && heights[i] <= heights[st.peek()]) st.pop();
            if(st.size() == 0) nse[i] = n;
            else nse[i] = st.peek();
           st.push(i);
        }

        int area = Integer.MIN_VALUE;
        for(int i = 0; i < pse.length; i++){
            int a = heights[i] * (nse[i] - pse[i] - 1);
            if(a > area) area = a;
        }
        return area;
    }
}