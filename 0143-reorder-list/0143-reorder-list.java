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
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(curr != null){
            ListNode fwd=curr.next;
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        ListNode t1=head;
        ListNode t2=prev;
        while(t2 != null){
            ListNode next1=t1.next;
            ListNode next2=t2.next;
            t1.next=t2;
            t2.next=next1;
            t1=next1;
            t2=next2;
        }
    }
}