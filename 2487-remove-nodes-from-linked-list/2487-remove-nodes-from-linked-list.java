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
    public ListNode removeNodes(ListNode head) {
        Stack <Integer> st = new Stack<>();
        ListNode temp = head.next;
        st.push(head.val);
        while(temp != null){
            int x = temp.val;
            if(x < st.peek()) st.push(x);
            else{
                while(st.size()>0 && x > st.peek()) {
                    st.pop();
                }
                st.push(x);
            }
            temp = temp.next;
        }

        ListNode head1 = new ListNode(st.pop());
        head1.next = null;
        while(st.size() > 0){
            ListNode newnode = new ListNode (st.pop());
            newnode.next = head1;
            head1 = newnode;
        }
        return head1;
    }
}