class Solution {
    public String revert(StringBuilder util){
		StringBuilder output = new StringBuilder();
        // starting from end so as to avoid reversing it in the end 
        for(int i = util.length()-1;i>=0;i--) {
        	output.append(util.charAt(i) == '1'?'0':'1');
        }
        return output.toString();
    }
    public char findKthBit(int n, int k) {
        // applying brute force approach
        StringBuilder util = new StringBuilder();
        util.append('0');
        for(int i =2;i<=n;i++) {
        	String temp = revert(util);
        	util.append('1').append(temp);
        }
        return util.charAt(k-1);
    }
}