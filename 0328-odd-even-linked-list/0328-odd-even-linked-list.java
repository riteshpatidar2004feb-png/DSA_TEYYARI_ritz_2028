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
    public ListNode oddEvenList(ListNode head) {
        ListNode k1=new ListNode(-1),ka1=k1;
        ListNode k2=new ListNode(-1),ka2=k2;
        ListNode temp=head;
        int i=1;
        while(temp!=null){
            if(i%2!=0){
                ka1.next=temp;
                ka1=ka1.next;
            }
            else{
                ka2.next=temp;
                ka2=ka2.next;
            }
            i++;temp=temp.next;
        }
        ka2.next=null;
        ka1.next=k2.next;
        return k1.next;
    }
}