class Solution {
    public int leastInterval(char[] tasks, int n) {
        int frequency[] = new int[26];
        int maxCount = 0;
        int max = 0;
        for(char ch:tasks){
          frequency[ch-'A']++;
          if(max == frequency[ch-'A'])maxCount++;
            else if(max < frequency[ch - 'A']){
                max = frequency[ch-'A'];
                maxCount = 1;
            }
        }
        
        int partCount = max-1;
        int partLength = n-(maxCount-1);
        int emptySlots = partCount*partLength;
        int availableTasks = tasks.length-max*maxCount;
        int idles = Math.max(0,emptySlots-availableTasks);
        
        return tasks.length+idles;
    }
}