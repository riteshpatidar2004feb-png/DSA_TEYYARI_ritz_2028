class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int count = 0;
        for(int i = 0; i < intervals.length; i++){
            int end = intervals[i][1];
            int start = intervals[i][0];
            for(int j = i+1; j < intervals.length; j++){
                int start2 = intervals[j][0];
                int end2 = intervals[j][1];
                if(start <= end2 && start2 <= end) count++;
            }
        }
        return count;
    }
}