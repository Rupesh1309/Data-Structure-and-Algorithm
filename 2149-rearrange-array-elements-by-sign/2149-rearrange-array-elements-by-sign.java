class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int[] temp1=new int[n];
        int[] temp2=new int[n];
        int id=0;
        int idx=0;
        for(int i=0; i<n; i++){
            if(nums[i]<0){
                temp2[idx]=nums[i];
                idx++;
            } else {
                temp1[id]=nums[i];
                id++;
            }
        }
        for(int i=0; i<n; i++){
            if(i%2==0){
                ans[i]=temp1[i/2];
            } else if(i%2!=0){
                ans[i]=temp2[i/2];
            }
        }
        return ans;
    }
}