class Solution {
    public int matrixScore(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        for(int i = 0; i < row; i++){
            if(grid[i][0] == 0){
                for(int j = 0; j < col; j++){
                    grid[i][j] = (grid[i][j] != 1) ? 1:0;
                }
            }
        }
        for(int i = 1; i < col; i++){
            int ones = 0;
            for(int j = 0; j < row; j++){
                if(grid[j][i] == 1) ones++;
            }
            if(ones < row - ones){
                for(int j = 0; j < row; j++){
                    grid[j][i] = (grid[j][i] != 1) ? 1:0;
                }
            }
        }
        int score = 0;
        for(int i = 0; i < row; i++){
            int rowScore = 0, pow = 0;
            for(int j = col - 1; j >= 0; j--){
                rowScore += Math.pow(2, pow) * grid[i][j];
                pow++;
            }
            score += rowScore;
        }
        return score;
    }
}