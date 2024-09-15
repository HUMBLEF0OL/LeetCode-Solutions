class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int result = 0;
        int oddMax = 0;
        for(char ch:map.keySet()){
            int currentCount = map.get(ch);
            if(currentCount%2 == 0)result+=currentCount;
            else{
                result += currentCount-1;
            }
        }
        if(s.length() > result)result++;
        return result;
    }
}