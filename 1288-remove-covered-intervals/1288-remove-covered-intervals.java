class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        for(int i = 0; i < intervals.length; i++){
            boolean hai = false;
            for(int j = 0; j < intervals.length; j++){
                if(i != j && intervals[i][0] >= intervals[j][0] && intervals[i][1] <= intervals[j][1]){
                    hai = true;
                    break;
                }
            }
            if(!hai) count++;
        }
        return count;
    }
}