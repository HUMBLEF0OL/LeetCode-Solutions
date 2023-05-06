class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> per = new ArrayList<>();
        int final_arr[] = new int[queries.length];
        for(int i=1;i<=m;i++) 
            per.add(i);

        for(int i=0;i<queries.length;i++)
        {
            int temp = queries[i];

                if(per.contains(temp)){
                    final_arr[i] = per.indexOf(temp);
                    per.remove(per.indexOf(temp));
                    per.add(0,temp);
            }
        }

        return final_arr;
    }
}