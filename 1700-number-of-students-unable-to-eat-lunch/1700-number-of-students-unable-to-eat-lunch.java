class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> studentStack = new Stack<>();
        int currentStudentIndex = 0;
        for(int i =0;i< sandwiches.length;i++){
            if(!studentStack.isEmpty() && studentStack.peek() == sandwiches[i]){
                studentStack.pop();
            } else if(currentStudentIndex == students.length){
               return studentStack.size();
               // break;
            }
            else {
                for(int j = currentStudentIndex;j<students.length;j++){
                    if(sandwiches[i] != students[j]) studentStack.push(students[j]);
                    else{
                        studentStack.push(students[j]);
                        currentStudentIndex = ++j;
                        break;
                    }
                    if(j == students.length-1)currentStudentIndex = ++j;
                }
                i--;
            }
        }
        return 0;
    }
}