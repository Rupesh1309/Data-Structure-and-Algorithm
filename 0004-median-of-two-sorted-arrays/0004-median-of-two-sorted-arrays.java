class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int n1=nums1.length;
        int n2=nums2.length;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                ans.add(nums1[i]);
                i++;
            } else {
                ans.add(nums2[j]);
                j++;
            }
        }
        while(i<=n1-1){
            ans.add(nums1[i]);
            i++;
        }
        while(j<=n2-1){
            ans.add(nums2[j]);
            j++;
        }
        if((n1+n2)%2==0){
           return (double) (ans.get((ans.size()/2)-1)+ans.get((ans.size()/2)))/2.0;
        }
        return (double) ans.get(ans.size()/2);
    }
}