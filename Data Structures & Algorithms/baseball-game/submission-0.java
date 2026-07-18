class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String op:operations)
        {
            if(!op.equals("+") && !op.equals("C")  && !op.equals("D"))
            {
                st.push(Integer.parseInt(op));
            }
            else if (op.equals("+"))
            {
                int second=st.pop();
                int first=st.pop();
                int sum=second+first;
                st.push(first); 
                st.push(second);
                st.push(sum);  
            }
            else if(op.equals("C"))
            {
                st.pop();
            }
            else 
            {
                int number=st.pop();
                int n=number*2;
                st.push(number);
                st.push(n);
            }
        }

        int total=0;
        for(int x:st)
        {
            total+=x;
        }

        return total;
    }
}