class Solution {
    public int maxDepth(String s) {
        int max=0;
        int count=0;
        char[] temp=new char[s.length()];
        for(int i=0; i<s.length(); i++){
            temp[i]=s.charAt(i);
        }
        for(int i=0; i<temp.length; i++){
            if(temp[i]=='('){
                count++;
            }
            max=Math.max(max,count);
            if(temp[i]==')'){
                count--;
            }
        }
        return max;
    }
}