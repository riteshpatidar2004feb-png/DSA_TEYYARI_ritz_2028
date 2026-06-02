class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int lI = 0, wI = 0, max = Integer.MAX_VALUE; 
        for(int i = 0; i < landStartTime.length; i++){
            for(int j = 0; j < waterStartTime.length; j++){
                int l = landStartTime[i] + landDuration[i];
                int w = Math.max(l, waterStartTime[j]) + waterDuration[j];
                if(w < max)  max = w;
                
            }
        }

        for(int i = 0; i < waterStartTime.length; i++){
            for(int j = 0; j < landStartTime.length; j++){
                int l = waterStartTime[i] + waterDuration[i];
                int w = Math.max(l, landStartTime[j]) + landDuration[j];
                
                if(w < max)  max = w;
            }
        }
        return max;
    }
}