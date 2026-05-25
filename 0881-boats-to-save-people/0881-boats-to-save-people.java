class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people.length == 1) return 1;
        Arrays.sort(people);
        int n = people.length, i = 0, j = n-1, boat=0;
        while(i <= j){
            int sum = people[i] + people[j];
            if(sum > limit){
                j--;
                boat++;
            }
            else{
                i++;
                j--;
                boat++;
            }
        }
        return boat;
    }
}