class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            boolean destroy = false;
            while(!st.isEmpty() && asteroids[i]<0 && st.peek()>0)
            {
                if(st.peek()==-asteroids[i])
                {
                    st.pop();
                    destroy=true;
                    break;
                }
                else if(st.peek()> -asteroids[i])
                {
                    destroy = true;
                    break;
                }
                else
                {
                    st.pop();
                }
            }
        if(!destroy)
        {
            st.push(asteroids[i]);
        }
        }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        return ans;
    }
}