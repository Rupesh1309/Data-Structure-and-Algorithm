class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left; i<=right; i++){
            // char[] temp=words.charAt(i);
            for(int j=0; j<words[i].length(); j++){
                char ch=words[i].charAt(j);
                char ch1=words[i].charAt(words[i].length()-1);
                if(j==0){
                    if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') && 
                    (ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
                    )
                    count++;
                }
            }
        }
        return count;
    }
}