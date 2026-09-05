class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int[] prefMax=new int[n];
        int[] suffMin=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int j=0; j<n; j++){
            if(nums[j]>max){
                max=nums[j];
            }
            prefMax[j]=max;
        }
        for(int j=n-1; j>=0; j--){
            if(nums[j]<min){
                min=nums[j];
            }
            suffMin[j]=min;
        }
        for(int j=0; j<n; j++){
            if((prefMax[j]-suffMin[j])<=k){
                return j;
            }
        }
        return -1;
    }
}