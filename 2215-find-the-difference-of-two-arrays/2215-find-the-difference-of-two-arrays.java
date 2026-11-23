class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer=new ArrayList<>();
        ArrayList<Integer> temp1=new ArrayList<>();
        ArrayList<Integer> temp2=new ArrayList<>();
        ArrayList<Integer> ans1=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            temp1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            temp2.add(nums2[i]);
        }
        for(int i=0; i<nums1.length; i++){
            if(!temp2.contains(nums1[i]) && !ans1.contains(nums1[i])){
                ans1.add(nums1[i]);
            }
        }
        answer.add(ans1);
        for(int i=0; i<nums2.length; i++){
            if(!temp1.contains(nums2[i]) && !ans2.contains(nums2[i])){
                ans2.add(nums2[i]);
            }
        }
        answer.add(ans2);
        return answer;
    }
}