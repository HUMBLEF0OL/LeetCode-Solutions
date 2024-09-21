class Solution {
    public boolean hasCycle(List<List<Integer>> courses,boolean[] visited, boolean[] inProgress, int current){
        if(visited[current])return false;
        if(inProgress[current])return true;
        
        inProgress[current] = true;
        for(int i:courses.get(current)){
            if(hasCycle(courses,visited,inProgress,i)){
                return true;
            }
        }
        inProgress[current] = false;
        visited[current] = true;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] pre) {
        List<List<Integer>> courses = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            courses.add(new ArrayList<>());
        }
        
        for(int p[]:pre){
            // 0 is required for 1
            courses.get(p[1]).add(p[0]);
        }
        boolean visited[] = new boolean[numCourses];
        boolean inProgress[] = new boolean[numCourses];
        
        for(int i =0;i<numCourses;i++){
            if(hasCycle(courses,visited,inProgress,i)){
                return false;
            }
        }
        return true;
    }
}