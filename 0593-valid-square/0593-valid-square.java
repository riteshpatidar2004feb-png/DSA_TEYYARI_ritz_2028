class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] nums = new int[6];
        nums[0] = distance(p1, p2);
        nums[1] = distance(p1, p3);
        nums[2] = distance(p1, p4);
        nums[3] = distance(p2, p3);
        nums[4] = distance(p2, p4);
        nums[5] = distance(p3, p4);
        Arrays.sort(nums);
        if(nums[0] > 0 && nums[0] == nums[1] && nums[2] == nums[3] && nums[1] == nums[2] && nums[4] == nums[5]){
           return true; 
        }
        return false;
    }
    public int distance(int[] p1, int[] p2){
        int x = p1[0] - p2[0];
        int y = p1[1] - p2[1];
        return x*x + y*y;
    }
}