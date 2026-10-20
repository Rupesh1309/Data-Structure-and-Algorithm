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
        ListNode odd=new ListNode(0);
        ListNode even=new ListNode(0);
        ListNode t1=odd;
        ListNode t2=even;
        ListNode temp=head;
        while(temp != null ){
            t1.next=temp;
            temp=temp.next;
            t1=t1.next;
            t2.next=temp;
            if(temp != null) temp=temp.next;
            t2=t2.next;
        }
        t1.next=even.next;
        return odd.next;
    }
}