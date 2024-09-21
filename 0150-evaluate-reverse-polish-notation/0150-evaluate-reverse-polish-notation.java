class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token:tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int first = stack.pop();
                int second = stack.pop();
                if(token.equals("+"))stack.push(first+second);
                else if(token.equals("-"))stack.push(second-first);
                else if(token.equals("*"))stack.push(second*first);
                else if(token.equals("/"))stack.push(second/first);
            }else stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
}