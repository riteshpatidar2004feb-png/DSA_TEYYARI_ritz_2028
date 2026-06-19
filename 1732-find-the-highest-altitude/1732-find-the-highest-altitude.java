class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length,sum=0;
        int[] netgain=new int[n+1];
        for(int i=0;i<n;i++){
            netgain[i]=sum;
            sum+=gain[i];
        }
        netgain[n]=sum;
        int highestA=netgain[0];
        for(int j=0;j<netgain.length;j++){
            if(highestA<netgain[j]) highestA=netgain[j];
        }
        return highestA;
    }
}