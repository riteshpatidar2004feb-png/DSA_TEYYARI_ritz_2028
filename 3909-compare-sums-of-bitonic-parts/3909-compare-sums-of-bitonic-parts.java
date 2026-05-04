class Solution {
    public int compareBitonicSums(int[] nums) {
        long sumi=0,sumd=0;
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]<nums[j]) i++;
           else if(nums[i]>nums[j]) j--;
            else {
                i++;j--;
            }
        }
        long peak=nums[i];
        for(int k=0;k<=i;k++){
             sumi+=nums[k];
        }
        for(int k=i;k<nums.length;k++){
             sumd+=nums[k];
        }
        if(sumi>sumd) return 0;
        if(sumi<sumd) return 1;
        return -1;
    }
}