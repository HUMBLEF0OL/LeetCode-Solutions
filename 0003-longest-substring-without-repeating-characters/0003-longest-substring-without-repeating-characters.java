class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set =new HashSet<>();
        int maxLength = 0;
        int i=0;
        for(int j=0;j<s.length();j++){
            char current = s.charAt(j);
            
            while(set.contains(current)){
                set.remove(s.charAt(i++));
            };
            set.add(current);
            maxLength = Math.max(maxLength,j-i+1);
        }
        
        return maxLength;
    }
}