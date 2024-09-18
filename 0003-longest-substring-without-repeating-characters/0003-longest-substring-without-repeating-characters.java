class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str = "";
        int maxlength = 0;
        for(char ch:s.toCharArray()){
            int index = str.indexOf(ch);
            
            if(index != -1){
                str = str.substring(index+1);
            }
            str +=ch;
            maxlength = Math.max(maxlength,str.length());
            
                
        }
        return maxlength;
    }
}