class Solution {
    public int hammingWeight(int n) {
        // // yeh meri
        // int no1=0;
        // while(n>0){
        //     int bit=n%2;
        //     if(bit==1) no1++;
        //     n=n/2;
        // }
        // return no1;

        // yeh gfg ki
        int count = 0;
        for(int i = 0; i < 31; i++){
            if((n >> i) % 2 != 0) count++;
        }
        return count;
    }
}