//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String s,String t)
    {
        
        // Your code here
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