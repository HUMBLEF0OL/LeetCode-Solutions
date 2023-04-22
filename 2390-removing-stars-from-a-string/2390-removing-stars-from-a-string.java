class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(stk.size() > 0 && stk.peek() != '*' ){
                    stk.pop();  
                }
            } else{
                stk.push(ch);
            }
        }
        String result = "";
        while(stk.size() > 0){
            result = stk.pop() + result;
        }
        return result;
    }
}