class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> s1= new ArrayList<>();
        ArrayList<Character> s2= new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            s1.add(s.charAt(i));
        }
        for(int i=0; i<t.length(); i++){
            s2.add(t.charAt(i));
        }
        Collections.sort(s1);
        Collections.sort(s2);
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}