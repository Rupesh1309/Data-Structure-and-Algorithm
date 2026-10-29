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
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp=head;
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
        int count=0;
        while(temp != null){
            ans.add(temp.val);
            temp=temp.next;
        }
        int k=0;
        while(k<nums.length){
            ans2.add(nums[k]);
            k++;
        }
        int i=0;
        while(i<ans.size()){
            if(ans2.contains(ans.get(i))){
                while(i<ans.size() && ans2.contains(ans.get(i))){
                    i++;
                }
                count++;
            } else {
                i++;
            }
        }
        return count;
    }
}