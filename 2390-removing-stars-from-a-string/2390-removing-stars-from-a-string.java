class Solution {
    public String removeStars(String s) {
        StringBuilder temp1=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='*'){
                temp1.append(s.charAt(i));
            } else if(temp1.length()>0){
                temp1.deleteCharAt(temp1.length()-1);
            }
        }
        return temp1.toString();
    }
}