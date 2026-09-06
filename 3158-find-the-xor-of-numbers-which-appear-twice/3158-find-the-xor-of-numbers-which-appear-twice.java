class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                temp.add(nums[i]);
            }
        }
        for(int i=0; i<temp.size(); i++){
            xor ^= temp.get(i);
        }
        return xor;
    }
}