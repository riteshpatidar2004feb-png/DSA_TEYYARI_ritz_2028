class Solution {
    public int findMin(int[] nums) {
        int low =0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<high&&nums[mid]>nums[mid+1]) return nums[mid+1];
            else if(mid>low&&nums[mid]<nums[mid-1]) return nums[mid];
            else if(nums[mid]<=nums[low]) high=mid-1;
            else low=mid+1;
        }
        return nums[0];
    }
}