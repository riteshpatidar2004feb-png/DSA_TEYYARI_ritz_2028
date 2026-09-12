class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            if(!map.containsKey(n)){
                List <Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
            else{
                map.get(nums[i]).add(i);
            }
        }
        int count = 0;
        for(int key: map.keySet()){
             List <Integer> list = map.get(key);
             if(list.size() > 2){
                 int diff = list.get(1) - list.get(0);
                 boolean hai = true;
                for(int i = 1; i < list.size(); i++){
                   if(diff != list.get(i) - list.get(i-1)) {
                    hai = false;
                    break;
                   }
                }
                if(hai) count++;
             }
        }
        return count;
    }
}