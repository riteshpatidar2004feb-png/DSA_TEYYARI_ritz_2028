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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        if(head.next.next==null) {
            if(head.val==head.next.val) return true;
            return false;
        } 
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode b=slow,c=b.next,f=c.next;
        b.next=null;
        while(c!=null){
            c.next=b;
            b=c;
            c=f;
            if(f!=null) f=f.next;
        }
        while(b!=null&&head!=null){
            if(b.val!=head.val) return false;
            b=b.next;
            head=head.next;
        }
        return true;
    }
}