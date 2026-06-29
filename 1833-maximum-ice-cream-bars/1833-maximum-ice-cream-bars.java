class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0, sumIce = 0;
        for(int i = 0; i < costs.length; i++){
            sumIce +=costs[i];
            if(sumIce <= coins) count++;
            else break;
        }
        return count;
    }
}