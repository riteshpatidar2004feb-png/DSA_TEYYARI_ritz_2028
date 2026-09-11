class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int i = 0; i < digits.length; i++) freq[digits[i]]++;
        int total = 0;
//         if(freq[0] != 0){

//     for(int h = 1; h <= 9; h++){
//         if(freq[h] == 0) continue;

//         freq[h]--;

//         for(int t = 0; t <= 9; t++){
//             if(freq[t] == 0) continue;

//             freq[t]--;

//             for(int o = 0; o <= 8; o += 2){
//                 if(freq[o] != 0){
//                     total++;
//                 }
//             }

//             freq[t]++;
//         }

//         freq[h]++;
//     }
// }

//         else{
//             int even = 0;
//             for(int i = 0; i < 10; i++) if(i%2 == 0 && freq[i] != 0) even += freq[i];
//             int o_place = even;
//             int h_place = digits.length - 1;
//             int t_place = digits.length - 2;
//             int duplicate = 1;
//             for(int i = 0; i < 10; i++){
//                 if(freq[i] > 1) {
//                     int fact = 1;
//                     for(int j = freq[i]; j >= 1; j--) fact *= j;
//                     duplicate *= fact;
//                 }
//             }

//           total = (o_place * h_place * t_place) / duplicate;
//         }
for(int h = 1; h <= 9; h++){
        if(freq[h] == 0) continue;

        freq[h]--;

        for(int t = 0; t <= 9; t++){
            if(freq[t] == 0) continue;

            freq[t]--;

            for(int o = 0; o <= 8; o += 2){
                if(freq[o] != 0){
                    total++;
                }
            }

            freq[t]++;
        }

        freq[h]++;
    }
        return total;
    }
}