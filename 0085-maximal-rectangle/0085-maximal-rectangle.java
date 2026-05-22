class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[][] mat = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++) mat[i][j] = matrix[i][j]-'0';
        }


    int m = mat.length, n = mat[0].length;
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
            if(mat[i][j] == 1) mat[i][j] += mat[i-1][j];
        }
        }
        int max = 0;
        for(int[] row: mat){
           int m1 = largestRectangleArea(row);
           if(m1 > max) max = m1;
        }
        return max;
    }

    public static int largestRectangleArea(int[] heights) {
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