class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freq = new int[128];
        for(int i = 0; i < word.length(); i++){
        freq[word.charAt(i)]++;
        }
        int i = 65, j = 97, count = 0;
        while(i <= 90 && j <= 122){
            if(freq[i] != 0 && freq[j] != 0){
            if(freq[i] == freq[j]) count++;
            else if(freq[i] < freq[j]) count++;
            else if(freq[i] > freq[j]) count++;
            }
            i++;j++;
        }
        return count;
    }
}