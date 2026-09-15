class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int total = 1 << n;
        for (int j=0; j<total; j++) {
            List<Integer> temp = new ArrayList<>();
            for (int i=0; i<n; i++) {
                if ((j & (1 << i)) != 0) {
                    temp.add(nums[i]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}