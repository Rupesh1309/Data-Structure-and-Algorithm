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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        int sum = 0;
        ListNode temp2 = head.next;
        while(temp2 != null) {
            if (temp2.val != 0) {
                sum += temp2.val;
            } else {
                ListNode newNode = new ListNode(sum);
                current.next = newNode;
                current = newNode;
                sum = 0;
            }
            temp2 = temp2.next;
        }
        return temp.next;
    }
}