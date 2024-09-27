class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        // Step 1: Sort intervals by their start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Prepare a list to store merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Start with the first interval
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        // Step 4: Iterate through the sorted intervals
        for (int i = 1; i < intervals.length; i++) {
            int currentEnd = currentInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // If intervals overlap, merge them
            if (nextStart <= currentEnd) {
                // Merge by taking the maximum end time
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, move to the next interval
                currentInterval = intervals[i];
                merged.add(currentInterval);
            }
        }

        // Convert the merged list into a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }
}