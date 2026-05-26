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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack <Integer> st1 =new Stack<>();
        Stack <Integer> st2 =new Stack<>();
        ListNode temp1 = l1, temp2 = l2;
        int s1 = 0, s2 = 0;
        while(temp1 != null){
            st1.push(temp1.val);
            temp1 = temp1.next;
            s1++;
        }

        while(temp2 != null){
            st2.push(temp2.val);
            temp2 = temp2.next;
            s2++;
        }
        int carry = 0;
        // if(s1>s2) temp1 = l1;
        // else temp1 = l2;
        Stack <Integer> st3 =new Stack<>();
        while(st1.size() > 0 && st2.size() > 0){
            int sum = st1.pop() + st2.pop() + carry;
            if(sum > 9){
                carry = 1;
                sum = sum%10;
                st3.push(sum);
            }
            else {
                st3.push(sum);
                carry = 0;
            }
        }
        if(s1 != s2){
          if(s1>s2){
            while(st1.size() > 0){
             int sum = st1.pop() + carry;
             if(sum > 9){
                carry = 1;
                sum = sum%10;
                st3.push(sum);
             }
             else {
                st3.push(sum);
                carry = 0;
             }
            }
           }
               else {
                while(st2.size() > 0){
             int sum = st2.pop() + carry;
             if(sum > 9){
                carry = 1;
                sum = sum%10;
                st3.push(sum);
             }
             else {
                st3.push(sum);
                carry = 0;
             }
            }
               }
            }
            if( carry == 1) st3.push(1);

            //while(st3.size() > 0) st1.push(st3.pop());
            ListNode l = new ListNode(-1);
            l.next = null;
            temp1 = l;
            while(st3.size() > 0){
                 ListNode newnode = new ListNode(st3.pop());
                 newnode.next = null;
                 temp1.next = newnode;
                 temp1 = newnode;
            }
            return l.next;
        }
    }
