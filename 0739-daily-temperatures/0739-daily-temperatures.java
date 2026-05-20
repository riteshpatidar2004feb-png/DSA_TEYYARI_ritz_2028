class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> st = new Stack <>();
        int[] ans = new int[temperatures.length];
        st.push(temperatures.length-1);
        ans[temperatures.length-1] = 0;
        for(int i = temperatures.length - 2; i >= 0; i--){
            while( st.size() > 0 && temperatures[i] >= temperatures[st.peek()]) st.pop();
            if(st.size() == 0) ans[i] = 0;
            else{
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }
        return ans;
    }
}