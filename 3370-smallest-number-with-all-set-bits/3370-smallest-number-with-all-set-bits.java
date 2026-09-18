class Solution {
    public int smallestNumber(int n) {
        double power=0;
        for(int i=1; i<31; i++){
            power=Math.pow(2,i);
            if(power>n){
                return (int)power-1;
            }
        }
        return (int)power;
    }
}