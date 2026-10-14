/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA=0;
        ListNode tempA=headA;
        while(tempA != null){
            tempA = tempA.next;
            countA++;
        }
        int countB=0;
        ListNode tempB=headB;
        while(tempB != null){
            tempB = tempB.next;
            countB++;
        }
        tempA=headA;
        tempB=headB;
        if(countA>countB){
            for(int i=1; i<=countA-countB; i++){
                tempA=tempA.next;
            }
        } else {
            for(int i=1; i<=countB-countA; i++){
                tempB=tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}