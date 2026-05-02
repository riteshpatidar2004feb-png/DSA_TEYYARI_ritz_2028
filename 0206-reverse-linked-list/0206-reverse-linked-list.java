/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode b=head,c=b.next,f=c.next;
        b.next=null;
        while(c!=null){
            c.next=b;
            b=c;
            c=f;
            if(f!=null) f=f.next;
        }
        return b;
    }
}