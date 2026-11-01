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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d1=new ListNode(0);
        ListNode d2=new ListNode(0);
        d1.next=list1;
        d2.next=list2;
        ListNode prev=d1;
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1 != null && t2 != null){
            if(t1.val<t2.val){
                prev.next=t1;
                prev=t1;
                t1=t1.next;
            } else {
                prev.next=t2;
                prev=t2;
                t2=t2.next;
            }
        }
        if(t1 == null){
            prev.next=t2;
            prev=t2;
        } else if (t2 == null){
            prev.next=t1;
            prev=t1;
        }
        return d1.next;
    }
}