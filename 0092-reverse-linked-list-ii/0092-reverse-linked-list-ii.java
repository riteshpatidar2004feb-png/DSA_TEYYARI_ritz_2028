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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right || head.next == null ) return head;
        if(head.next.next == null){
            ListNode temp=head.next;
            head.next.next = head;
            head.next = null;
            return temp;
        }
        ListNode head1 = new ListNode(-1);
        head1.next=head;
        head=head1;
        ListNode l = head, r = head;
        int i = 0;
        while( i < (left-1) ){
            l = l.next;
            i++;
        }
        i = 0;
        while( i < right ){
            r = r.next;
            i++;
        }
ListNode lefth = l; l = l.next; lefth.next = null;
ListNode righth = r.next;  r.next = null;
    

    ListNode b = new ListNode(-1), a = l.next, l1 = l ; 
    l.next = null;

    while(a != null){
        b = l;
        l = a;
        a = a.next;
        l.next = b;
    }
    lefth.next = l;
    l1.next = righth;

    return head.next;
}
}