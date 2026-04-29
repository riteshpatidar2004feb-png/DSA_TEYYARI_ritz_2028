/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //yeh gfg ka solution hai mera isme ghanta bhi nhi hai
        ListNode slow=head,fast=head,temp=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(true){
                    if(temp==slow) return slow;
                    slow=slow.next;
                    temp=temp.next;
                }
            }
        }
        return null;
    }
}