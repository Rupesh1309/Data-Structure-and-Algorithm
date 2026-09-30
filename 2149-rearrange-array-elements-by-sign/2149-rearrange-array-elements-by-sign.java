class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length];
        int[] neg=new int[nums.length];
        int[] ans=new int[nums.length];
        int temp1=0;
        int temp2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                pos[temp1]=nums[i];
                temp1++;
            } else {
                neg[temp2]=nums[i];
                temp2++;
            }
        }
        temp1=0;
        temp2=0;
        for(int j=0; j<nums.length; j++){
            if(j%2==0){
                ans[j]=pos[temp1];
                temp1++;
            } else {
                ans[j]=neg[temp2];
                temp2++;
            }
        }
        return ans;
    }
}