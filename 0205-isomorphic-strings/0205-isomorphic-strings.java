class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1= new HashMap<>();
        HashMap<Character,Character> map2= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char temp=s.charAt(i);
            char temp2=t.charAt(i);
            if(map1.containsKey(temp)){
                if(map1.get(temp)!=temp2){
                    return false;
                }
            }
            else {
                    map1.put(temp,temp2);
                }
            if(map2.containsKey(temp2)){
                if(map2.get(temp2)!=temp){
                    return false;
                } 
            }
            else {
                    map2.put(temp2,temp);
                }
        }
        return true;
    }
}