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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=1; i<left; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        ListNode temp = curr;
        ListNode prev2 = null;
        for(int i=0; i<right-left+1; i++) {
            ListNode fwd = curr.next;
            curr.next = prev2;
            prev2 = curr;
            curr = fwd;
        }
        prev.next = prev2;
        temp.next = curr;
        return dummy.next;
    }
}
