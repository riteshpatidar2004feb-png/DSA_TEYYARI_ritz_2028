class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        
        int[][] temp = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int k = rowShift[i];
                temp[i][(j - k + n) % n] = grid[i][j];
            }
        }

        
        int[][] ans = new int[n][n];

        for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                int k = colShift[j];
                ans[(i - k + n) % n][j] = temp[i][j];
            }
        }

        return ans;
    }
}