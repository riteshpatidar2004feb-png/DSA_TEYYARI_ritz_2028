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


//         class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int[] pse = PSE(heights);
//         int[] nse = NSE(heights);
//         int area = Integer.MIN_VALUE;
//         for(int i = 0; i < pse.length; i++){
//             int a = heights[i] * (nse[i] - pse[i] - 1);
//             if(a > area) area = a;
//         }
//         return area;
//     }
//     public int[] PSE(int[] heights){
//         int n = heights.length;
//         int[] answer = new int[n];
//         Stack <Integer> st = new Stack<>();
//         st.push(0);
//         answer[0] = -1;
//         for(int i = 1; i < n; i++){
//             while(st.size() > 0 && heights[i] <= heights[st.peek()]) st.pop();
//             if(st.size() == 0) answer[i] = -1;
//             else answer[i] = st.peek();
//             st.push(i);
//         }
//         return answer;
//     }
//     public int[] NSE(int[] heights){
//         int n = heights.length;
//         int[] answer = new int[n];
//         Stack <Integer> st = new Stack<>();
//         st.push(n-1);
//         answer[n-1] = n;
//         for(int i = n-2; i >= 0; i--){
//             while(st.size() > 0 && heights[i] <= heights[st.peek()]) st.pop();
//             if(st.size() == 0) answer[i] = n;
//             else answer[i] = st.peek();
//            st.push(i);
//         }
//         return answer;
//     }
// }
    
