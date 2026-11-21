class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int sum2=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(sum2==sum-sum2-nums[i]){
                return i;
            } else {
                sum2 += nums[i];
            }
        }
        return -1;
    }
}