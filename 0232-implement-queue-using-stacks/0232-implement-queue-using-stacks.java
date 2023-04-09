class MyQueue {
    
    Stack<Integer> stack  = new Stack<>();
    public MyQueue() {
        // stack = null;
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if(stack.size() == 0)return -1;
        Stack<Integer> helper = new Stack<>();
        while(stack.size()>1){
            helper.push(stack.pop());
        }
        int result = stack.pop();
        
        while(helper.size()>0){
            stack.push(helper.pop());
        }
        return result;
    }
    
    public int peek() {
        if(stack.size() == 0)return -1;
        Stack<Integer> helper = new Stack<>();
        int result = -1;
        while(stack.size()>0){
            if(stack.size() == 1)result = stack.peek();
            helper.push(stack.pop());
        }
        
        
        while(helper.size()>0){
            stack.push(helper.pop());
        }
        return result;
    }
    
    public boolean empty() {
        return stack.isEmpty();
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