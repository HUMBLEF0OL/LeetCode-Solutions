class MinStack {
    Stack<Integer> main;
    Stack<Integer> min;
    public MinStack() {
        main = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if(main.size() == 0){
            min.push(val);
        }else{
            min.push(Math.min(min.peek(),val));
        }
        main.push(val);
    }
    
    public void pop() {
        min.pop();
        main.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */