class Solution {
    public int minChanges(String s) {
        int count=0;
        char[] temp=s.toCharArray();
        for(int i=0; i<temp.length; i++){
            if(i%2 == 0){
                if(temp[i]!=temp[i+1]){
                    temp[i+1]=temp[i];
                    count++;
                }
            }
        }
        return count;
    }
}