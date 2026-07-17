class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='(')
            {
                st.push(ch);//firsty traverse for open brackets
            }

            else
            {
            if(st.isEmpty()==true) return false; //if there is no open brackets like )) , stack will remain empty return false.
            if(st.peek()=='[' && ch==']') st.pop();
            else if (st.peek()=='{' && ch=='}') st.pop();
            else if (st.peek()=='(' && ch==')') st.pop();
            else return false;// like (]) so it will not match any condition in ] ,why to check next immediately return false
            }
        }
        return st.isEmpty();// else it will return true if it will be valid

    }
}
