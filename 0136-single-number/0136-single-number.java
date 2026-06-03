class Solution {
    public int singleNumber(int[] arr) {
        // int single=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]) count++;
                
        //     }
        //     if(count==1) {
        //         single=nums[i];
        //         break;
        //     }
        // }
        // return single;
        int xor = arr[0];
        for(int i = 1; i < arr.length; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
}