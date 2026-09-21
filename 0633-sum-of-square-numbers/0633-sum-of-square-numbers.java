class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while (i<=j) {
            long square = (long)i*i + (long)j*j;
            if (square == c) {
                return true;
            } 
            else if (square > c) {
                j--;
            } 
            else {
                i++;
            }
        }
        return false;
    }
}