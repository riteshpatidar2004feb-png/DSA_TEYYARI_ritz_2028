class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //yeh gfg ka hai timestamp: 03:06:38
        List <List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        int cardinal = 1<<n;
        for(int i = 0; i < cardinal; i++){
            List<Integer> a = new ArrayList<>();
            for(int j = 0; j < n; j++){
                if((i>>j)%2 == 1){
                    a.add(nums[j]);
                }
            } 
            list.add(a);
        }
        return list;
    }
}