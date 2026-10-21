class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int leftSum=0;
            int rightSum=0;
            for(int j=0; j<i; j++){
                leftSum += nums[j];
            }
            for(int k=i+1; k<nums.length; k++){
                rightSum += nums[k];
            }
            answer[i]=Math.abs(leftSum-rightSum);
        }
        return answer;
    }
}