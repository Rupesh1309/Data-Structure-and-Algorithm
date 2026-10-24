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
        if(head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (curr != null) {
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        ListNode a = head;
        ListNode b = prev;
        while (b != null) {
            ListNode nextA = a.next;
            ListNode nextB = b.next;
            a.next = b;
            b.next = nextA;
            a = nextA;
            b = nextB;
        }
    }
}