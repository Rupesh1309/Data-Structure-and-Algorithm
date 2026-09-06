class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int i=0;
        for(i=1; i<=nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return i;
    }
}