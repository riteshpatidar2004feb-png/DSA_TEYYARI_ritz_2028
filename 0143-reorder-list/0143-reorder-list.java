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
    public void reorderList(ListNode head) {
        if(head.next==null) return ;
        ListNode slow = head, fast = head;
        while (fast.next != null &&fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow.next, c = a.next;
        slow.next = null;
        ListNode b = new ListNode(-1);
        a.next=null;
        while( c!= null){
            b = a;
            a = c;
            c = c.next;
            a.next = b;
        }
        //slow.next = a;  beacuse of this line i wasted my 2 hours, becuase it creates cycle

        ListNode temp=head, a1=a;
        while(temp!=null&&a1!=null){
            ListNode t1=temp.next, a2=a1.next;
            temp.next=a1;
            a1.next=t1;
            temp=t1;
            a1=a2;
        }
        }
    }
