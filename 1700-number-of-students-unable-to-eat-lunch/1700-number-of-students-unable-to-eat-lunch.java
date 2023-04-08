class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // count the number of students who wants sandwiches of each types
        int zeroes = 0;
        int ones = 0;
        for(int i : students){
            if(i == 0)zeroes++;
            else ones++;
        }
        // now according to the sandwich type at the top of the stack update the counter
        for(int i : sandwiches){
            if(i == 0){
                // if there are no sandwiches left of type 0 return number of student left for type 1
                if(zeroes ==0)return ones;
                zeroes--;
            } else{
                if(ones == 0)return zeroes;
                ones--;
            }
            
        }
        return 0;
    }
}