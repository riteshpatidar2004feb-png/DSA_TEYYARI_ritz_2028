class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0) return false;
        //yeh mera solution
        // boolean yes=false;
        // for(int x=0;x<100;x++){
        //     double result = Math.pow(4,x);
        //     if(result==n){
        //         yes=true;
        //         break;
        //     }
        //     if(result>n) break;
        // }
        // return yes;

        //yeh gfg ka
        return ispowerOfTwo(n)&&isSquare(n);
    }
    boolean ispowerOfTwo(int n){
        return ((n&(n-1)) == 0);
    }
    boolean isSquare(double n){
        double root = Math.sqrt(n);
        return (root * root == n);
    }
}