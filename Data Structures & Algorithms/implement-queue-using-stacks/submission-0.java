class MyQueue {
    Stack<Integer> st;
    Stack<Integer> qt;
    public MyQueue() {
      st=new Stack<>(); 
      qt=new Stack<>(); 
    }
    
    public void push(int x) {
        while(!qt.isEmpty())
        {
            st.push(qt.pop());
        }
        st.push(x);
        while(!st.isEmpty())
        {
            qt.push(st.pop());
        }

    }
    
    public int pop() {
       return qt.pop();
    }
    
    public int peek() {
        return qt.peek();
    }
    
    public boolean empty() {
        return qt.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */