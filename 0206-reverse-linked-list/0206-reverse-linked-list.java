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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int[] nums = new int[count];
        temp=head;
        for(int i=0; i<count; i++){
            nums[i]=temp.val;
            temp=temp.next;
        }
        int left=0;
        int right=count-1;
        while(left<right){
            int tem=nums[left];
            nums[left]=nums[right];
            nums[right]=tem;
            left++;
            right--;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }
}