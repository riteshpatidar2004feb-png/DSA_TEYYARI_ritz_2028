// class Solution {
//     public int sumFourDivisors(int[] nums) {
//         int[] arr = new int[nums.length];
//         for(int i = 0; i < nums.length; i++){
//             int count = 0, n = nums[i];
//             for(int j = 1; j*j <= n; j++){
//                 if(nums[i] % j == 0) {
//                     if(j == n / j) count++;
//                     else count += 2;
//                 }
//             }
//             arr[i] = count;
//         }
//         int sum = 0;
//         for(int i = 0; i < arr.length; i++){
//            int n = nums[i];
//             if(arr[i] == 4){
//                 for(int j = 1; j*j <= n; j++){
//                  if(nums[i] % j == 0) {
//                     if(n % j == 0) {
//                     sum+=j;
//                     if(j != n / j) {
//                          sum+=n/j;
//                      }
//                     }
//                   }
//                 }
//             }   
//         }
//         return sum;
//     }
// }

class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i],count=2,four_div=1+n;
            for(int j=2;j<=n/2;j++){
                if(n%j==0){
                    count++;
                    four_div=four_div+j;
                }
                if(count>4) break;
            }
            
            if(count==4){
                sum=four_div+sum;
            }
        }
        return sum;
    }
}