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
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        int max=0;
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        ListNode curr=slow;
        while(curr != null){
            ListNode fwd=curr;
            fwd=fwd.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        ListNode temp=head;
        int count=0;
        while(temp != null && prev != null){
            count=temp.val+prev.val;
            max=Math.max(max,count);
            temp=temp.next;
            prev=prev.next;
        }
        return max;
    }
}