class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans=0;
        int count=1;
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=0; i--){
            if(count==k){
                ans=nums[i];
            }
            count++;
        }
        return ans;
    }
}