class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums) set.add(ele);
        int temp=0;
        int count=0;
        for(int i=1; i<1000; i++){
            if(i%k==0){
                if(!set.contains(i)){
                    return i;
                }
            }
        }
        return 1;
    }
}