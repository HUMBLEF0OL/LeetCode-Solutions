class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sArr[] = new int[26];
        int pArr[] = new int[26];
        List<Integer> result = new ArrayList<>();
        if(s.length() < p.length())return result;
        for(int i =0;i<p.length();i++){
            pArr[p.charAt(i)-'a']++;
            sArr[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(sArr,pArr))result.add(0);
        
        int windowSize = p.length();
        for(int i =windowSize;i<s.length();i++){
            sArr[s.charAt(i)-'a']++;
            
            // remove out of window char
            sArr[s.charAt(i-windowSize)-'a']--;
            
            if(Arrays.equals(sArr,pArr))result.add(i-windowSize+1);
        }
        return result;
        
    }
}