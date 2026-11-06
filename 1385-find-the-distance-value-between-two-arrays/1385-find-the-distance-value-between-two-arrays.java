class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        int n=arr1.length;
        int m=arr2.length;
        for(int i=0; i<n; i++){
            int temp=0;
            for(int j=0; j<m; j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    break;
                } else {
                    temp++;
                }
            }
            if(temp==m){
                count++;
            }
        }
        return count;
    }
}