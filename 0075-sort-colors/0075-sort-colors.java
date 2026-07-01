class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count0++;
            else if(nums[i] == 1) count1++;
            else count2++;
        }
        int j = 0;
        for(int i = 1; i <= count0; i++) {
            nums[j] = 0;
            j++;
        }
        for(int i = 1; i <= count1; i++) {
            nums[j] = 1;
            j++;
        }
        for(int i = 1; i <= count2; i++) {
            nums[j] = 2;
            j++;
        }
       
    }
}