class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int max=0;
        int lo=0;
        int hi=0;
        while(hi<nums.length){
            if(nums[hi]==0){
                count++;
            }
            if(count>1){
                if(nums[lo]==0){
                    count--;
                }
                lo++;
            }
            max=Math.max(max,hi-lo); 
            hi++;
        }
        return max;
    }
}