class Solution {
    public int findNumbers(int[] nums) {
        int i=0;
        int count=0;
        while(i<nums.length){
            if((10<=nums[i] && nums[i]<=99) || (1000<=nums[i] && nums[i]<=9999) || (100000<=nums[i] && nums[i]<=999999)){
                count++;
                i++;
            } else {
                i++;
            }
        }
        return count;
    }
}