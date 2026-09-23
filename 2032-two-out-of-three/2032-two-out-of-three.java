class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet <Integer> set1 = new HashSet<>();
        HashSet <Integer> set2 = new HashSet<>();
        HashSet <Integer> set3 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) set1.add(nums1[i]);
        for(int i = 0; i < nums2.length; i++) set2.add(nums2[i]);
        for(int i = 0; i < nums3.length; i++) set3.add(nums3[i]);

        List <Integer> list = new ArrayList<>();

        for(int x: set1){
            if(set2.contains(x) || set3.contains(x)) list.add(x);
        }

        for(int x: set2){
            if(!list.contains(x) && (set1.contains(x) || set3.contains(x))) list.add(x);
        }

        for(int x: set3){
            if(!list.contains(x) && (set2.contains(x) || set1.contains(x))) list.add(x);
        }
        return list;
    }
}