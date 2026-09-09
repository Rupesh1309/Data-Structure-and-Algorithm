class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        ArrayList<Integer> less=new ArrayList<>();
        ArrayList<Integer> more=new ArrayList<>();
        ArrayList<Integer> equal=new ArrayList<>();
        int[] ans=new int[n];
        for(int i=0; i<n; i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            } else if(nums[i]>pivot){
                more.add(nums[i]);
            } else {
                equal.add(nums[i]);
            }
        }
        int index=0;
        for(int i=0; i<less.size(); i++){
            ans[index]=less.get(i);
            index++;
        }
        for(int i=0; i<equal.size(); i++){
            ans[index]=equal.get(i);
            index++;
        }
        for(int i=0; i<more.size(); i++){
            ans[index]=more.get(i);
            index++;
        }
        return ans;
    }
}