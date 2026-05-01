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
    public ListNode partition(ListNode head, int x) {
        ListNode k1=new ListNode(-1),ka1=k1;//dummy node
        ListNode k2=new ListNode(-1),ka2=k2;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
               ka1.next=temp;
               ka1=temp;
            }
            if(temp.val>=x){
               ka2.next=temp;
               ka2=temp;
            }
            temp=temp.next;
        }
        ka2.next=null;
        ka1.next=k2.next;
       
        return k1.next;
    }
}