class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].matches("-?\\d+")){
                st.push(Integer.parseInt(operations[i]));
            } else if(operations[i].equals("+")){
                int top=st.pop();
                int temp=top+st.peek();
                st.push(top);
                st.push(temp);
            } else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            } else if(operations[i].equals("C")){
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}