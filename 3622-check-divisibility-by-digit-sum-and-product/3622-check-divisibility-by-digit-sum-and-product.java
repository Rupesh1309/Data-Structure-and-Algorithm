class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int i=n;
        while(i>0){
            int temp=0;
            temp=i%10;
            sum += temp;
            prod *= temp;
            i=i/10;
        }
        if(n%(sum+prod)==0){
            return true;
        }
        return false;
    }
}