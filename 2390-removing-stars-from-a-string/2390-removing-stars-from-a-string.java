class Solution {
    public String removeStars(String s) {
        char[] temp=new char[s.length()];
        for(int i=0; i<s.length(); i++){
            temp[i]=s.charAt(i);
        }
        StringBuilder temp1=new StringBuilder();
        for(int i=0; i<temp.length; i++){
            if(temp[i]!='*'){
                temp1.append(temp[i]);
            } else if(temp1.length()>0){
                temp1.deleteCharAt(temp1.length()-1);
            }
        }
        return temp1.toString();
    }
}