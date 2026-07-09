class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return 1;
        Arrays.sort(nums);
        int length1 = 1, length = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] + 1 == nums[i]){
                length1++;
            }
            if(length1 > length) length = length1;
            if(nums[i - 1] == nums[i]) length1 = length1;
            else if(nums[i - 1] + 1 != nums[i]){
                length1 = 1;
            }
        }
        return length;
    }
}