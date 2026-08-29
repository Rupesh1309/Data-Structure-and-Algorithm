class Solution {
    public String reversePrefix(String s, int k) {
        int i=0;
        int j=k-1;
        char[] chars = s.toCharArray();
        while(i<j){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
        s=new String(chars);
        return s;
    }
}