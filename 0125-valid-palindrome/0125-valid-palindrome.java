class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if((ch <= 122 && ch >= 97) || (ch <= 90 && ch >= 65 || (ch <= 57 && ch >= 48))){
                sb.append(ch);
            }
        }
       
        int i = 0;
        int j = sb.length() -1;
        while(i<j){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);
            if(ch1 != ch2)
            return false;
            i++;
            j--;
        }
        return true;
    }
}