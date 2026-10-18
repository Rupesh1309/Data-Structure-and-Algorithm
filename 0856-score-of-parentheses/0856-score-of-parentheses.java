
class Solution {
    public int scoreOfParentheses(String s) {
        int count1=0;
        int count2=0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                count1++;
            } else{
                count1--;
                if(s.charAt(i - 1) == '(') {
                    count2 += 1 << count1;
                }
            }
        }
        return count2;
    }
}
