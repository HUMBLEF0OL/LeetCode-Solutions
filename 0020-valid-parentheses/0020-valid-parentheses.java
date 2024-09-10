class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '[')stk.push(c);
            else if(stk.size() > 0){
                if((stk.peek() == '(' && c== ')') || 
                   (stk.peek() == '{' && c== '}') || 
                   (stk.peek() == '[' && c== ']') 
                  )stk.pop();
                else stk.push(c);
            } else stk.push(c);
        }
        return stk.size () == 0;
    }
}