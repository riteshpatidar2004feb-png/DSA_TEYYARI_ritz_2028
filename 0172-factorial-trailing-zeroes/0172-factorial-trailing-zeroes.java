class Solution {
    public int trailingZeroes(int n) {
        // long product = 1;
        // for(int i = n; i > 0; i--) product = product * i;
        // int count = 0;
        // while(product%10 == 0){
        //         count++;
        //         product /= 10;
        // }
        // return count;

        // if(n >=0 && n<=4) return 0;
        // if(n >=5 && n<=9) return n/5;
        // if(n >=10 && n<=24) return n/5;
        int n1 = 5, sum = 0;
        while(n1 <= n){
            sum = sum + n/n1;
            n1*=5;
        }
        return sum;
    }
}