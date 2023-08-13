class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        HashMap<Character,Integer> frequency = new HashMap<>();
        // storing s in the hashmap
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            frequency.put(current,frequency.getOrDefault(current,0)+1);
        }
        
        // iterating over t and and checking with frequency
        for(int i =0;i<t.length();i++){
            char current = t.charAt(i);
            if(frequency.containsKey(current) && frequency.get(current) > 0){
                frequency.put(current,frequency.get(current)-1);
            } else return false;
        }
        return true;
        
    }
}