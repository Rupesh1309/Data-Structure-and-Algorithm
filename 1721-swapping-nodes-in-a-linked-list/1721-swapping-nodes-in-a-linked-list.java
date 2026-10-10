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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        temp=head;
        int[] arr=new int[count];
        for(int i=0; i<count; i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        int left=k-1;
        int right=count-k;
        int tem = arr[left];
        arr[left] = arr[right];
        arr[right] = tem;
        temp = head;
        for (int i=0; i<count; i++) {
            temp.val = arr[i];
            temp = temp.next;
        }
        return head;
    }
}