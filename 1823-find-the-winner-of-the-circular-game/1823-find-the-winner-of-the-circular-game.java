class Solution {
    public int findTheWinner(int n, int k) {
        Queue <Integer> q = new LinkedList<>();
        for( int i = 1; i <= n; i++) q.offer(i);
        while(true){
            int n1 = q.size();
            if(n1 == 1) return q.peek();
            int i = 1;
            while(i < k){
                i++;
                int temp = q.remove();
                q.add(temp);
            }
            q.remove();
        }
        //return -1;
    }
}