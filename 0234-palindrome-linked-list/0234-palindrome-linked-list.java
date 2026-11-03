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
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        ListNode prev=null;
        while(curr != null){
            ListNode fwd=curr.next;
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        ListNode l1=head;
        ListNode l2=prev;
        while(l2 != null){
            if(l1.val != l2.val){
                return false;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return true;
    }
}