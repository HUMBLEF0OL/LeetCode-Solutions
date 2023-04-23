class Pair{
    int id;
    int startTime;
    int childExecution;
}
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Pair> stk = new Stack<>();
        int result[] = new int[n];
        for(String current : logs){
            String log[] = current.split(":");
            if(log[1].equals("start")){
                Pair currentExecution = new Pair();
                currentExecution.id = Integer.parseInt(log[0]);
                currentExecution.startTime = Integer.parseInt(log[2]);
                currentExecution.childExecution = 0;
                stk.push(currentExecution);
            } else {
                Pair startTime = stk.pop();
                int interval = Integer.parseInt(log[2]) - startTime.startTime + 1;
                int executionTime = interval - startTime.childExecution;
                result[startTime.id] += executionTime;
                // update the parent for this interval
                if(!stk.isEmpty()){
                    stk.peek().childExecution += interval;
                }
            }
        }
        return result;
    }
}