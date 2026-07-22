class Solution {
    public int reverseBits(int n) {
        // int[] binary=new int[32];
        // int sum=0,j=31;
        // for(int i=0;i<32;i++){
        //     binary[i]=n%2;
        //     sum=sum+(int)Math.pow(2,j)*binary[i];
        //     j--;
        //     n=n/2;
        // }
        // return sum;

        //bit manipulation pdne ke baad ka sawal
        String str = Integer.toBinaryString(n);
        for(int i = str.length(); i < 32; i++)
        str = "0" +str;
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum = sum + (1<<i) * (str.charAt(i) - '0');
        }
        return sum;
    }
}