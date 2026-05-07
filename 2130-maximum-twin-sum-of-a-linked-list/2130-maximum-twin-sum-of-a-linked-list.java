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
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head1 = slow.next;
        slow.next = null;

        ListNode b = new ListNode(-1);
        ListNode a=head1,c=head1.next;
        a.next=null;
        while(c!=null){
            //b.next=a;
            b=a;
            a=c;
            c=c.next;
            a.next=b;
        }
        slow.next = a;
        int max=Integer.MIN_VALUE;
        while(head!=null&&a!=null){
            int twin = head.val+a.val;
            if(twin>max) max=twin;
            head = head.next;
            a = a.next;
        }
        return max;
    }
}