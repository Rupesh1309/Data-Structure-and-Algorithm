class Solution {
    public int largestAltitude(int[] gain) {
        int count=0;
        int max=0;
        for(int i=0; i<gain.length; i++){
            count += gain[i];
            max=Math.max(count, max);
        }
        return max;
    }
}