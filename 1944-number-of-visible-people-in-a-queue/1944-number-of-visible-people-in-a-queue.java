class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] answer = new int[n];
        Stack <Integer> st = new Stack<>();
        st.push(n-1);
        answer[n-1] = 0;
        for(int i = n-2; i >= 0; i--){
            int count = 0;
            while(st.size() > 0 && heights[i] >= heights[st.peek()] ) {
                st.pop();
                count++;
            }
            if(st.size() > 0) count++;
            answer[i] = count;
            st.push(i);
        }
        return answer;
    }
}