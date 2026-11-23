class Solution {
    public String[] assignUmbrella(int[] rain) {
        String[] answer=new String[rain.length];
        int count1=0;
        int count2=0;
        for(int i=0; i<rain.length-1; i++){
            if(rain[i]==1){
                if(rain[i+1]==1 && count1<=count2){
                    answer[i]="Alice";
                    count1++;
                } else {
                    answer[i]="Bob";
                    count2++;
                }
            } else {
                answer[i]="None";
            }
        }
        if(rain[rain.length-1]==1){
            answer[rain.length-1]="Bob";
        } else {
            answer[rain.length-1]="None";
        }
        return answer;
    }
}