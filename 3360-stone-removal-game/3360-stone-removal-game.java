class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10) return false;
        boolean win = true;
        int stones = 10;
        while(n >= 0){
            if(win){
                if(n >= stones){
                    win = false;
                    n = n - stones;
                    stones--;
                }
                else return false;
            }
            else{
                if(n >= stones){
                    win = true;
                    n = n - stones;
                    stones--;
                }
                else return true;
            }
        }
        return true;
    }
}