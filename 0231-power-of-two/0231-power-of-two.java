class Solution {
    public boolean isPowerOfTwo(int n) {
        // boolean power=false; 
        // for(int i=0;i<100;i++){
        //     if(Math.pow(2,i)==n) power=true;
        // }
        // return power;
        if(n == 0 || n < 0) return false;
        while(n > 1){
            if(n%2 == 1) return false;
            n = n/2;
        }
        return true;
    }
}