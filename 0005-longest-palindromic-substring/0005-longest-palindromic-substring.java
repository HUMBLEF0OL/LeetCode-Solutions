class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0)return "";
        // the start and end indices are for finding the substring of longest palindrome in the end
        int start = 0;
        int end = 0;
        for(int i =0;i<s.length();i++)
        {
            // finding the length of odd indexed palindrome substring
            int len1 = pLength(s,i,i);
            // finding the length of even indexed palindrome substring
            int len2 = pLength(s,i,i+1);
            int max = Math.max(len1,len2);
            // if current length palindrome is greater then previous then udpate the start and end pointers
            if(max>end-start)
            {
                start = i-(max-1)/2;
                end = i+max/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int pLength(String s, int left,int right)
    {
        if(s.length() == 0 || left>right) return 0;
        // expanding on both sides
        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        // finding the length of palindrom string 
        return right-left-1;
    }
        
}