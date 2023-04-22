class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '*'){
                stk.pop();
            } else{
                stk.push(s.charAt(i));
            }
        }
        String result = "";
        while(stk.size() > 0){
            result = stk.pop() + result;
        }
        return result;
    }
}