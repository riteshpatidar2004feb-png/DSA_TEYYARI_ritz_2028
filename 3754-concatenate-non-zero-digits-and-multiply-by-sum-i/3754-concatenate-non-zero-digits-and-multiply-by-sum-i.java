class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        ArrayList <Integer> list = new ArrayList<>();
        while(n > 0){
            int digit = n % 10;
            if(digit != 0) {
                sum += digit;
                list.add(digit);
            }
            n /= 10;
        }
        long place = 1, sum2 = 0;
        for(int i = 0; i < list.size(); i++){
            sum2 = sum2 + place * list.get(i);
            place *= 10;
        }
        return sum * sum2;
    }
}