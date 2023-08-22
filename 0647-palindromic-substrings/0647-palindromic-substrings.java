class Solution {
    public boolean isPalindrome(String str){
        // reverse the string and check
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public int countSubstrings(String s) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        int length = s.length();
        for(int i =0;i<length;i++){
            for(int j=i+1;j<=length;j++){
                String currentString = s.substring(i,j);
                // if the formed string is present in set or its a palindrome then increase the count
                if(set.contains(currentString) || isPalindrome(currentString)){
                    set.add(currentString);
                    count++;
                }
            }
        }
        return count;
    }
}