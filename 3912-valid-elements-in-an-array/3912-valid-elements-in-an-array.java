class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length-1;i++){
            boolean g=false;
            boolean l=false;
            for(int j=i+1;j<nums.length;j++)   if(nums[i]<=nums[j]) g=true;
            for(int j=0;j<i;j++) if(nums[i]<=nums[j]) l=true;
            if(g==false||l==false) list.add(nums[i]);
        }
        if(nums.length>1) list.add(nums[nums.length-1]);
        return list;
    }
}