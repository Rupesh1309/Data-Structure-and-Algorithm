class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int ele:nums){
            set.add(ele);
        }
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}