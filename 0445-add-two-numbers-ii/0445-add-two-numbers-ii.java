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
        ListNode first = reverse(l1, null);
        ListNode second = reverse(l2, null);
        ListNode head = new ListNode(0);
        ListNode tail = head;
        ListNode curr1 = first;
        ListNode curr2 = second;
        int carry = 0;
        while (curr1 != null && curr2 != null) {
            int sum = curr1.val + curr2.val + carry;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carry = sum / 10;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while (curr1 != null) {
            int sum = curr1.val + carry;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carry = sum / 10;
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            int sum = curr2.val + carry;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carry = sum / 10;
            curr2 = curr2.next;
        }
        if (carry != 0) {
            tail.next = new ListNode(carry);
        }
        return reverse(head.next, null);
    }

    public ListNode reverse(ListNode curr, ListNode prev) {
        if (curr == null) {
            return prev;
        }
        ListNode next = curr.next;
        curr.next = prev;
        return reverse(next, curr);
    }
}