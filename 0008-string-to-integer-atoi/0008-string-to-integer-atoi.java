class Solution {
    public int myAtoi(String s) {
        int size = s.length();
        int i =0;
        int result = 0;
        int sign = 1;
        // skip starting empty string
        while(i<size && s.charAt(i) == ' ')i++;
        
        // check for sign
        if (i < size && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        // iterate over rest
        while(i<size && Character.isDigit(s.charAt(i))){
            int current = s.charAt(i) -'0';
            // premtive check
            if(result > (Integer.MAX_VALUE-current)/10){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + current;
            i++;
        }
        return result * sign;
    }
}